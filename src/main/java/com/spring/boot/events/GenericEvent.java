package com.spring.boot.events;

import java.time.LocalDateTime;
import java.util.UUID;

public class GenericEvent {
	
	private final UUID uid;
	private final LocalDateTime eventDate;
	
	public GenericEvent() {
		this.uid = UUID.randomUUID();
		this.eventDate = LocalDateTime.now();
	}

	public UUID getUid() {
		return uid;
	}

	public LocalDateTime getEventDate() {
		return eventDate;
	}

	@Override
	public String toString() {
		return "GenericEvent [uid=" + uid + ", eventDate=" + eventDate + "]";
	}
	
}
