package com.spring.boot.events.templates;

import java.util.HashSet;
import java.util.Set;

public abstract class PublishedEventNotifier<EVENT> {	
	
	Set<EventSubscriber> subscribers = new HashSet<EventSubscriber>();
	
	public void subscribe(EventSubscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void unsubscribe(EventSubscriber subscriber) {
		subscribers.remove(subscribers);
	}
	
	protected void notifyEvent() {
		subscribers.forEach(subscriber -> subscriber.onEventAction(this));
	}
	
	protected abstract EVENT getEvent();
}