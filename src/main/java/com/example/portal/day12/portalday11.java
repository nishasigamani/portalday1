package com.example.portal.day12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class portalday11 
{
      @GetMapping("/welcome")
      public String welcome()
      {
    	  return"Welcome to SpringBoot";
      }
}

