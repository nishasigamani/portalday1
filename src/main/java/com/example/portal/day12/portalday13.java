package com.example.portal.day12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class portalday13 
{
	   @GetMapping("/color")
       public String favColor()
       {
    	   String colorr ="pink";
    	   return "My Favorite Color is "+colorr;
       }
}
