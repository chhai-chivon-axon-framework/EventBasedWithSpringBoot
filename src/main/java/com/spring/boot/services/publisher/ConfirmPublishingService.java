package com.spring.boot.services.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.spring.boot.events.ConfirmReservationEvent;
import com.spring.boot.services.PublishingService;

@Service
public class ConfirmPublishingService extends PublishingService<ConfirmReservationEvent> {

	@Autowired
	public ConfirmPublishingService(ApplicationEventPublisher eventPublisher) {
		super(eventPublisher);
	}

	@Override
	public void fire(ConfirmReservationEvent confirmReservationEvent) {
		eventPublisher.publishEvent(confirmReservationEvent);
	}
}
