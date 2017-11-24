package com.spring.boot.events.templates;

import com.spring.boot.events.GenericEvent;

public interface Subscriber<EVENT extends GenericEvent> { 
	void subscribe(EVENT event);

}
