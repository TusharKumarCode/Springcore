package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tushar.Delivery.Products;

@Configuration
public class SpringConfig {
   
	 @Bean("del")
	 public Products createProductsBean() {
		 
		   Products prd= new Products();
		   
		   prd.setName("tushar");
		   prd.setItemName("mobile");
		   prd.setPrice(37489);
		   
		   return prd;
	 }
}
