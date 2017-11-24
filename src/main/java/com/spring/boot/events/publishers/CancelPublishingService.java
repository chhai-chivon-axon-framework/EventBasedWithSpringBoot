package com.spring.boot.events.publishers;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.spring.boot.events.CancelReservationEvent;

@Service
public class CancelPublishingService extends GenericPublishingService<CancelReservationEvent> {

	public CancelPublishingService(ApplicationEventPublisher eventPublisher) {
		super(eventPublisher);
	}
}
