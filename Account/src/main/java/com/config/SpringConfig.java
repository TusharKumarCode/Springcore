package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tushar.Account.Money;

@Configuration
public class SpringConfig {
    
	 @Bean("acc")
	 public Money createMoneyBean() {
		 
		 Money money= new Money();
		 
		 money.setName("sanu");
		 money.setType("savings");
		 money.setBalance(47368);
		 
		 return money;
	 }
}
