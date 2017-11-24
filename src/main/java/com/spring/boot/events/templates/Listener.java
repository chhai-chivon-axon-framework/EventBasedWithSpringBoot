package com.spring.boot.events.templates;

@FunctionalInterface
public interface Listener<EVENT> {
	void onEvent(EVENT event);
}