package com.example.AirlineManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserAirlineController {
	 @Autowired
	    UserDetails userA;
        @RequestMapping("api/v1.0/flight/booking/history")
		@GetMapping()
		void bookingHistory () {
			System.out.println("bookings");
		}
		
		@RequestMapping("/api/v1.0/flight/booking/cancel/{pnr}")
		@DeleteMapping()
		void bookingCancel() {
			System.out.println("the cancel ticket");
			
		}
		

}
