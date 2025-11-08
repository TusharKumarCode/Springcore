package com.tushar.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Email email= (Email) context.getBean(Email.class);
    	
    	System.out.println(email.getEmail());
    	
    }
}
