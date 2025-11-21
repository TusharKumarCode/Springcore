package com.tushar.login.controller;



@Controller
public class LoginController {
   
	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("LoginController.login()::::::::::::::::::::::::::::::::::::::::::::::::::::::;");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayLogin");
		return mv;
	}
	
    
	 
}
