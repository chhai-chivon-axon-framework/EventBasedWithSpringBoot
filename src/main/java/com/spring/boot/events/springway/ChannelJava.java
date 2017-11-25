package com.spring.boot.events.springway;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ChannelJava extends Publisher<SubscriptionEvent> implements Channel<NotificationEvent> {

	public ChannelJava(ApplicationEventPublisher publisher) {
		super(publisher);
	}

	@EventListener(condition = "#notification.channelCode == 1")
	@Override
	public void notifySubscriber(NotificationEvent notification) {
		System.out.println("ChannelJava::notifySubscriber " + notification.toString());
		publish(SubscriptionEvent.of(notification));
	}

}
