package com.spring.boot.events;

import java.time.LocalDateTime;
import java.util.UUID;

public class GenericEvent {
	
	protected final UUID uid;
	protected final LocalDateTime eventDate;
	
	public GenericEvent() {
		this.uid = UUID.randomUUID();
		this.eventDate = LocalDateTime.now();
	}

	protected UUID getUid() {
		return uid;
	}

	protected LocalDateTime getEventDate() {
		return eventDate;
	}

	@Override
	public String toString() {
		return "GenericEvent [uid=" + uid + ", eventDate=" + eventDate + "]";
	}
	
}
