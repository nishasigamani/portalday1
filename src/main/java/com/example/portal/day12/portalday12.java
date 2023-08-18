package com.example.portal.day12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class portalday12 
{
	  @GetMapping("/name")
       public String getname()
       {
    	   String name="Hi I am Nisha";
    	   return name;
       }         
}


