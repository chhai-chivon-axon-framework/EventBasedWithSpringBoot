package com.spring.boot.events.templates;

@FunctionalInterface
public interface EventDispatcher<EVENT> {
	void dispatch(EVENT event);
}
