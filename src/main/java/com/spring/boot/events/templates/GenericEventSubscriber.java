package com.spring.boot.events.templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class GenericEventSubscriber<PUBLISHER extends PublishedEventNotifier<EVENT>, EVENT> 
	implements EventSubscriber<PUBLISHER> {
	
	protected final PUBLISHER eventListener;
	
	@Autowired
	public GenericEventSubscriber(PUBLISHER eventListener) {
		this.eventListener = eventListener;
		this.eventListener.subscribe(this);
	}
	
}
