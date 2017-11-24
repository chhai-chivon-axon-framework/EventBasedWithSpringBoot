package com.spring.boot.events.subscribers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.boot.events.listeners.CancelReservationEventListener;
import com.spring.boot.events.templates.EventSubscriber;

@Component
public class CancelEventSubscriber implements EventSubscriber<CancelReservationEventListener> {

	private final CancelReservationEventListener cancelReservationEventListener;
	
	@Autowired
	public CancelEventSubscriber(CancelReservationEventListener cancelReservationEventListener) {
		this.cancelReservationEventListener = cancelReservationEventListener;
		this.cancelReservationEventListener.subscribe(this);
	}
	
	@Override
	public void onEventAction(CancelReservationEventListener notifier) {
		System.out.println("CancelEventSubscriber");
		System.out.println(notifier.getEvent().toString());
	}

}
