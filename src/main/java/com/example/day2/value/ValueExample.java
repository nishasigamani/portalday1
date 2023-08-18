package com.example.day2.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueExample {
	@Value("103")
	public int regno;
	@Value("Nisha")
	public String name;
	
	@RequestMapping("/display")
	public String display()
	{
		return "My name is "+name+" Reg Number is "+regno;
	}

}
