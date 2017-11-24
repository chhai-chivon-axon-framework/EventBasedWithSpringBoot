package com.spring.boot.events.templates;

import org.springframework.stereotype.Component;

@Component
public abstract class GenericEventListener<EVENT> extends PublishedEventNotifier<EVENT>
		implements EventDispatcher<EVENT>, Listener<EVENT> {

	protected EVENT event;

	@Override
	public EVENT getEvent() {
		return event;
	}

}
