package com.spring.boot.events.springway;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class EventListenerService extends PublisherSubscriberProxy<Event, ChannelEvent> {
	
	public EventListenerService(ApplicationEventPublisher publisher) {
		super(publisher);
	}

	@EventListener
	@Override
	public void onEvent(Event event) {
		System.out.println("EventListenerService::onEvent " + event.toString());
		super.onEvent(event);
	}

	@Override
	protected ChannelEvent convertTo(Event event) {
		return ChannelEvent.of(event);
	}

}