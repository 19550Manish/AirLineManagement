package com.example.AirlineManagement;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FlightController {
	
	@RequestMapping("/api/v1.0/flight/search")
	@PostMapping
	void search() {
		System.out.println("the search result ");
		
	}
	
	@RequestMapping("/api/v1.0/flight/booking/{flightid}")
	@PostMapping
	void booking(@RequestBody Airline airline) {
		System.out.println("the booking deatils");
	}
	
	@RequestMapping("/api/v1.0/flight/ticket/{pnr}")
	@GetMapping
	Airline ticket(@RequestBody Airline airline) {
			return airline;
	}
	

}
