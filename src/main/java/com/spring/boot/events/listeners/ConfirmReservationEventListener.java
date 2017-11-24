package com.spring.boot.events.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.boot.events.ConfirmReservationEvent;
import com.spring.boot.events.templates.GenericEventListener;

@Component
public class ConfirmReservationEventListener extends GenericEventListener<ConfirmReservationEvent> {

	@EventListener
	@Override
	public void onEvent(ConfirmReservationEvent event) {
		this.event = event;
		dispatch(event);
	}
	
	@Override
	public void dispatch(ConfirmReservationEvent event) {
		System.out.println("Fired from ConfirmReservationEventListener1: Confirm Reservation1");
		notifyEvent();
	}
	
}
