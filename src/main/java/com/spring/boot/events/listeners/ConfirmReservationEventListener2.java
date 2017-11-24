package com.spring.boot.events.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.boot.events.ConfirmReservationEvent;
import com.spring.boot.events.templates.GenericEventListener;

@Component
public class ConfirmReservationEventListener2 extends GenericEventListener<ConfirmReservationEvent> {

	@EventListener
	@Override
	public void onEvent(ConfirmReservationEvent event) {
		this.event = event;
		dispatch(event);
	}
	
	@Override
	public void dispatch(ConfirmReservationEvent event) {
		System.out.println("Fired from ConfirmReservationEventListener2: Confirm Reservation2");
		notifyEvent();
	}
	
}
