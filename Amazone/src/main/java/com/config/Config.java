package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tushar.Amazone.User;

@Configuration
public class Config {
   
	  @Bean("user")
	  public User createUserBean() {
		  
		  User user= new User();
		  
		  user.setUserName("rahul");
		  user.setPassword("ryi4859");
		  user.setStatus("logedin");
		  
		  return user;
	  }
}
