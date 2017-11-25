package com.spring.boot.events.springway;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.boot.events.templates.Listener;

@Component
public class ChannelService extends Publisher<NotificationEvent> implements Listener<ChannelEvent> {

	public ChannelService(ApplicationEventPublisher publisher) {
		super(publisher);
	}

	@EventListener
	@Override
	public void onEvent(ChannelEvent channelEvent) {
		System.out.println("ChannelService::onEvent " + channelEvent.toString());
		NotificationEvent notification = NotificationEvent.of(channelEvent);
		publish(notification);
	}

}
