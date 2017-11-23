package com.spring.boot.events;

public class ConfirmReservationEvent extends GenericEvent {
	
	private final String name;
	
	public ConfirmReservationEvent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ConfirmReservationEvent [name=" + name + ", getUid()=" + getUid() + ", getEventDate()=" + getEventDate()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
