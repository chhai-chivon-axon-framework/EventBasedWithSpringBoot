package com.spring.boot.events.publishers;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.spring.boot.events.ConfirmReservationEvent;

@Service
public class ConfirmPublishingService extends GenericPublishingService<ConfirmReservationEvent> {

	public ConfirmPublishingService(ApplicationEventPublisher eventPublisher) {
		super(eventPublisher);
	}
	
}
