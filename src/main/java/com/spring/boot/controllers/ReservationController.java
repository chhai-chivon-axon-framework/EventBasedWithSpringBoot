package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.boot.events.CancelReservationEvent;
import com.spring.boot.events.ConfirmReservationEvent;
import com.spring.boot.events.publishers.CancelPublishingService;
import com.spring.boot.events.publishers.ConfirmPublishingService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private ConfirmPublishingService confirmPublisher;
	
	@Autowired
	private CancelPublishingService cancelPublisher;
	
	@RequestMapping("/confirm")
	@ResponseBody
	String confirmReservation() {
		confirmPublisher.fire(new ConfirmReservationEvent("CONFIRMED"));
		return "Reservation Confirmed";
	}
	
	@RequestMapping("/cancel")
	@ResponseBody
	String cancelReservation() {
		cancelPublisher.fire(new CancelReservationEvent("CANCELLED"));
		return "Reservation Cancelled";
	}
}
