package com.spring.boot.services.subscriber;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.spring.boot.events.ConfirmReservationEvent;
import com.spring.boot.services.GenericEventListener;

@Service
public class ConfirmReservationListenerService implements GenericEventListener<ConfirmReservationEvent> {

	@EventListener
	@Override
	public void onEvent(ConfirmReservationEvent event) {
		System.out.println("Confirm Reservation");
		System.out.println(event.toString());
	}

}
