package com.tushar.logindata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringController {
    
	 @RequestMapping("/login")
	 public String doLogin() {
		 
		 System.out.println("SpringController.dologin()...........");
		 return "landingpage";
	 }
	 
	 @RequestMapping("/validatelogin")
	 public String finalPage(@RequestParam("username") String username,@RequestParam("password") String password) {
		 
		 System.out.println("SpringController.finalPage().........");
		 System.out.println("username is "+username);
		 System.out.println("password is "+password);
		 return "finalpage";
		 
	 }
}
