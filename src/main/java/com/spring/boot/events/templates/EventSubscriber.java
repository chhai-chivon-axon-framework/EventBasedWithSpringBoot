package com.spring.boot.events.templates;

@FunctionalInterface
public interface EventSubscriber<NOTIFIER> {
	void onEventAction(NOTIFIER notifier);
}
