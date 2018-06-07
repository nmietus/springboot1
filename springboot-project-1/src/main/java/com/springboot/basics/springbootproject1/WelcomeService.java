package com.springboot.basics.springbootproject1;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		// TODO Auto-generated method stub
		return "Witaj użytkowniku!";
	}
}
