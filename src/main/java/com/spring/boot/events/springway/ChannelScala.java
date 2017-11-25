package com.spring.boot.events.springway;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ChannelScala extends Publisher<SubscriptionEvent> implements Channel<NotificationEvent> {

	public ChannelScala(ApplicationEventPublisher publisher) {
		super(publisher);
	}

	@EventListener(condition = "#notification.channelCode == 2")
	@Override
	public void notifySubscriber(NotificationEvent notification) {
		System.out.println("ChannelScala::notifySubscriber " + notification.toString());
		publish(SubscriptionEvent.of(notification));
	}

}
