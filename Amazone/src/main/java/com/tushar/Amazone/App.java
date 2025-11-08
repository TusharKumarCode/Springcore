package com.tushar.Amazone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;

public class App 
{
    public static void main( String[] args )
    {
       
    	 ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
    	 
    	 User user= (User) context.getBean("user");
    	 
    	 System.out.println(user.getUserName()+" "+user.getPassword()+" "+user.getStatus());
    	 
    }
}
