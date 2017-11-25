package com.spring.boot.events.springway;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.boot.events.templates.Listener;

@Component
public class SubscriberJava implements Listener<SubscriptionEvent> {

	@EventListener
	@Override
	public void onEvent(SubscriptionEvent event) {
		System.out.println("SubscriberJava::onEvent " + event.toString());
	}

}
