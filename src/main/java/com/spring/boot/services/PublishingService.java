package com.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.spring.boot.events.Event;
import com.spring.boot.events.GenericEvent;

@Service
public abstract class PublishingService <T extends GenericEvent> implements Event<T> {
	
	protected final ApplicationEventPublisher eventPublisher;

	@Autowired
	public PublishingService(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}
}
