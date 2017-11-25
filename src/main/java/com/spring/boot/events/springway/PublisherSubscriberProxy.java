package com.spring.boot.events.springway;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.spring.boot.events.templates.Listener;

@Component
public abstract class PublisherSubscriberProxy<INPUT_EVENT, OUTPUT_EVENT> extends Publisher<OUTPUT_EVENT> implements Listener<INPUT_EVENT> {

	public PublisherSubscriberProxy(ApplicationEventPublisher publisher) {
		super(publisher);
	}

	@Override
	public void onEvent(INPUT_EVENT inputEvent) {
		publish(convertTo(inputEvent));
	}

	protected abstract OUTPUT_EVENT convertTo(INPUT_EVENT inputEvent);
}
