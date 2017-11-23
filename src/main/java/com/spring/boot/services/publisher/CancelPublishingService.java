package com.spring.boot.services.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.spring.boot.events.CancelReservationEvent;
import com.spring.boot.services.PublishingService;

@Service
public class CancelPublishingService extends PublishingService<CancelReservationEvent> {

	@Autowired
	public CancelPublishingService(ApplicationEventPublisher eventPublisher) {
		super(eventPublisher);
	}

	@Override
	public void fire(CancelReservationEvent cancelReservationEvent) {
		eventPublisher.publishEvent(cancelReservationEvent);
	}

}
