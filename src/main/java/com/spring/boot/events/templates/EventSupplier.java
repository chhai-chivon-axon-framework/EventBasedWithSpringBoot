package com.spring.boot.events.templates;

@FunctionalInterface
public interface EventSupplier<EVENT> {
	void fire(EVENT event);
}
