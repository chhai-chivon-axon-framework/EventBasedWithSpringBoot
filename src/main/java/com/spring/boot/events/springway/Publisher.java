package com.spring.boot.events.springway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public abstract class Publisher<EVENT> {
	
	protected final ApplicationEventPublisher publisher;
	
	@Autowired
	public Publisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	protected void publish(EVENT event) {
		publisher.publishEvent(event);
	}
	
}
