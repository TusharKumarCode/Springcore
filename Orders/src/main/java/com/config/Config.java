package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
	 @Bean("ord")
	 
	 public Order createOrderBean() {
		 
		 Order ord= new Order();
		 
		 ord.setId(7868);
		 ord.setName("sagar");
		 ord.setItem("mobile");
		 
		 return ord;
	 }
}
