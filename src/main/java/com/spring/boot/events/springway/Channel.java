package com.spring.boot.events.springway;

public interface Channel<NOTIFICATION> {
	void notifySubscriber(NOTIFICATION notification);
}
