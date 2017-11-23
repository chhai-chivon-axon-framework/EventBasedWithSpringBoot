package com.spring.boot.events;

@FunctionalInterface
public interface Event<T> {
	void fire(T event);
}
