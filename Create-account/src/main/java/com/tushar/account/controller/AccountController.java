package com.tushar.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
     
	  @RequestMapping("/account")
	  public ModelAndView account() {
		  
		  System.out.println("account create....");
		  ModelAndView mv= new ModelAndView();
		  mv.setViewName("account");
		  return mv;
	  }
}
