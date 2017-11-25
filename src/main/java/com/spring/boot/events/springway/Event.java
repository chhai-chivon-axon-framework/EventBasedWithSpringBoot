package com.spring.boot.events.springway;

import java.util.UUID;

public class Event {
	
	protected UUID id;
	protected String name;
	protected int channelCode;
	
	public Event() { }
	
	public Event(String name, int channelCode) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.channelCode = channelCode;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getChannelCode() {
		return channelCode;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", channelType=" + ChannelType.valueOf(channelCode).toString() + "]";
	}
	
}
