package com.spring.boot.services.subscriber;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.spring.boot.events.CancelReservationEvent;
import com.spring.boot.services.GenericEventListener;

@Service
public class CancelReservationListenerService implements GenericEventListener<CancelReservationEvent> {

	@EventListener
	@Override
	public void onEvent(CancelReservationEvent event) {
		System.out.println("Cancel Reservation");
		System.out.println(event.toString());
	}

}
