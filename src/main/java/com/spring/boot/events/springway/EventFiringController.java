package com.spring.boot.events.springway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/event")
public class EventFiringController {
	
	@Autowired
	private EventFiringService eventFiringService;
	
	@RequestMapping("/fire")
	@ResponseBody
	String fireEvent() {
		eventFiringService.fire(new Event("Java Event", ChannelType.JAVA.getCode()));
		eventFiringService.fire(new Event("Scala Event", ChannelType.SCALA.getCode()));
		return "Event Fired";
	}
}
