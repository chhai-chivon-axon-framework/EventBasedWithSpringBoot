package com.spring.boot.events.springway;

import java.util.UUID;

public class NotificationEvent {
	
	protected UUID id;
	protected String name;
	public int channelCode;
	
	public NotificationEvent(UUID id, String name, int channelCode) {
		this.id = id;
		this.name = name;
		this.channelCode = channelCode;
	}

	public static NotificationEvent of(ChannelEvent event) {
		return new NotificationEvent(event.getId(), event.getName(), event.getChannelCode());
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
		return "NotificationEvent [id=" + id + ", name=" + name + ", channelCode=" + channelCode + "]";
	}
	
}
