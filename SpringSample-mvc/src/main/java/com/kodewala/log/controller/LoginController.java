package com.kodewala.log.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
     
	 @RequestMapping("/login")
	 
	 public ModelAndView login() {
		 
		 System.out.println("login done....");
		 ModelAndView mv= new ModelAndView();
		 mv.setViewName("login");
		 return mv;
	 }
	 
@RequestMapping("/dologin")
	 
	 public ModelAndView doLogin() {
		 
		 System.out.println("login done....");
		 ModelAndView mv= new ModelAndView();
		 mv.setViewName("dologin");
		 return mv;
	 }
}
