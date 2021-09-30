package com.example.AirlineManagement;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	ArrayList<Airline> flightList = new ArrayList<Airline>();
	Airline newFlight = new Airline();
	
	@RequestMapping("/api/v1.0/flight/admin/login")
	@PostMapping
	void adminLogin() {
		System.out.println("valid user");
	}
	
	
	@RequestMapping("/api/v1.0/flight/airline/register")
	@PostMapping
	String addFlight() {
		System.out.println("AirLineName " + newFlight.getAirLineName());
		System.out.println("flight no. " + newFlight.getFlightNo());
		System.out.println("src " +newFlight.getSrc());
		System.out.println("dest " +newFlight.getDest());
		System.out.println("price" +newFlight.getPrice());
		System.out.println("numberOfSeat " +newFlight.getNumberOfSeat());
		flightList.add(newFlight);
		return "Add Inventory/Schedule of an existing Airline";
	}
	

}
