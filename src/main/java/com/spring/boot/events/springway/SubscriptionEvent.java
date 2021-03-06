package com.spring.boot.events.springway;

import java.util.UUID;

public class SubscriptionEvent {
	
	protected UUID id;
	protected String name;
	public int channelCode;

	public SubscriptionEvent(UUID id, String name, int channelCode) {
		this.id = id;
		this.name = name;
		this.channelCode = channelCode;
	}

	public static SubscriptionEvent of(NotificationEvent event) {
		return new SubscriptionEvent(event.getId(), event.getName(), event.getChannelCode());
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
		return "SubscriptionEvent [id=" + id + ", name=" + name + ", channelCode=" + channelCode + "]";
	}
	
}
