package com.daikichiRoutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
		}


	@RequestMapping("/")
	public String welcome(@RequestParam(value="firstName", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName, @RequestParam(value="times", required= false) int times)  {
		if(firstName == null) {
			return "Hello Human";
		}
		else if(lastName == null) { 
			return "Hello " + firstName; 
		}
		else if (times == 0) {
			return "Hello " + firstName + " " + lastName;
		}
		else {
			return ("Hello " + firstName + " " + lastName + " ").repeat(times);
		}
	
	}
		
	
}
