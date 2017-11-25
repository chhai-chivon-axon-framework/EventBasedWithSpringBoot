package com.spring.boot.events.springway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.spring.boot.events.templates.EventSupplier;

@Service
public class EventFiringService implements EventSupplier<Event> {

	private final ApplicationEventPublisher eventPublisher;

	@Autowired
	public EventFiringService(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	@Override
	public void fire(Event event) {
		System.out.println("EventFiringService::fire " + event.toString());
		eventPublisher.publishEvent(event);
	}

}
