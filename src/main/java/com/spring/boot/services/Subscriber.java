package com.spring.boot.services;

import com.spring.boot.events.GenericEvent;

public interface Subscriber<T extends GenericEvent> { 
	void subscribe(T event);
}
