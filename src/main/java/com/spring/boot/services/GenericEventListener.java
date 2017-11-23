package com.spring.boot.services;

import com.spring.boot.events.GenericEvent;

@FunctionalInterface
public interface GenericEventListener<T extends GenericEvent> {
	void onEvent(T event);
}