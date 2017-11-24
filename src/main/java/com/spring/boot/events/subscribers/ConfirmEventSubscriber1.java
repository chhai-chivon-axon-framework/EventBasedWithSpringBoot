package com.spring.boot.events.subscribers;

import org.springframework.stereotype.Component;

import com.spring.boot.events.ConfirmReservationEvent;
import com.spring.boot.events.listeners.ConfirmReservationEventListener;
import com.spring.boot.events.templates.GenericEventSubscriber;

@Component
public class ConfirmEventSubscriber1 
	extends GenericEventSubscriber<ConfirmReservationEventListener, ConfirmReservationEvent> {
	
	public ConfirmEventSubscriber1(ConfirmReservationEventListener eventListener) {
		super(eventListener);
	}

	@Override
	public void onEventAction(ConfirmReservationEventListener notifier) {
		System.out.println("ConfirmEventSubscriber 1");
		System.out.println(notifier.getEvent().toString());
	}
	
}
