package com.spring.boot.events.springway;

import java.util.UUID;

public class ChannelEvent {
	
	protected UUID id;
	protected String name;
	public int channelCode;

	public ChannelEvent(UUID id, String name, int channelCode) {
		this.id = id;
		this.name = name;
		this.channelCode = channelCode;
	}

	public static ChannelEvent of(Event event) {
		return new ChannelEvent(event.getId(), event.getName(), event.getChannelCode());
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
		return "ChannelEvent [id=" + id + ", name=" + name + ", channelCode=" + channelCode + "]";
	}
	
}
