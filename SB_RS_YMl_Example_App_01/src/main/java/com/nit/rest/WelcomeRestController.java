package com.nit.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Value("${app.welcomeMsg}")   //If less values we need to take from the .yml
	private String getMsg;           //file then we use @Value annotaion
	
	@Value("${app.greetMsg}")   //here app is the prefix and greetMsg is child
	private String greetMsg;
	
	@GetMapping("/jshfj")
	public String getMsgs() {
		return getMsg + greetMsg;  //the variable name and the return type must be 
	}                                 //match (Ex:getMsg in @Value should match with 
	                                  //return type getMsg)
	
}
