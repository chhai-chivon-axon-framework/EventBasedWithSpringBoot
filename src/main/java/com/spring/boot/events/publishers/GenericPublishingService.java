package com.spring.boot.events.publishers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.spring.boot.events.GenericEvent;
import com.spring.boot.events.templates.EventSupplier;

@Service
public abstract class GenericPublishingService<EVENT extends GenericEvent> implements EventSupplier<EVENT> {

	protected final ApplicationEventPublisher eventPublisher;

	@Autowired
	public GenericPublishingService(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	@Override
	public void fire(EVENT event) {
		eventPublisher.publishEvent(event);
	}
}
