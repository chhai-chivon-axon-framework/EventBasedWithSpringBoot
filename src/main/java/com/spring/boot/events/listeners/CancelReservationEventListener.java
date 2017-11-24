package com.spring.boot.events.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.boot.events.CancelReservationEvent;
import com.spring.boot.events.templates.GenericEventListener;

@Component
public class CancelReservationEventListener extends GenericEventListener<CancelReservationEvent> {

	@Override
	public void dispatch(CancelReservationEvent event) {
		System.out.println("Fired from CancelReservationEventListener: Cancel Reservation");
		notifyEvent();
	}

	@EventListener
	@Override
	public void onEvent(CancelReservationEvent event) {
		this.event = event;
		dispatch(event);
	}

}
