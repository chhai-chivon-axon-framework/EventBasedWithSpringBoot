package com.spring.boot.events.subscribers;

import org.springframework.stereotype.Component;

import com.spring.boot.events.ConfirmReservationEvent;
import com.spring.boot.events.listeners.ConfirmReservationEventListener2;
import com.spring.boot.events.templates.GenericEventSubscriber;

@Component
public class ConfirmEventSubscriber3
		extends GenericEventSubscriber<ConfirmReservationEventListener2, ConfirmReservationEvent> {

	public ConfirmEventSubscriber3(ConfirmReservationEventListener2 eventListener) {
		super(eventListener);
	}

	@Override
	public void onEventAction(ConfirmReservationEventListener2 notifier) {
		System.out.println("ConfirmEventSubscriber 3");
		System.out.println(notifier.getEvent().toString());
	}

}
