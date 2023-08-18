package com.example.day2.Application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class valueThroughApplication {
	@Value(value="${myName}")
	public String stname;
	@Value(value="${age:18}")
	public int age; 
	
	@GetMapping("/student")
 public String displayst()
 {
	 return "My name is "+stname+" and my age is "+age;
 }
}
