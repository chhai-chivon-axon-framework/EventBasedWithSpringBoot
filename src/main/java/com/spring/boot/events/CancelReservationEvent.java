package com.spring.boot.events;

public class CancelReservationEvent extends GenericEvent {
	
	private final String name;
	
	public CancelReservationEvent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CancelReservationEvent [name=" + name + ", uid=" + uid + ", eventDate=" + eventDate + "]";
	}
	
}
