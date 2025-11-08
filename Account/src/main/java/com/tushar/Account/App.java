package com.tushar.Account;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       
    	 ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	 
    	 Money money= (Money) context.getBean("acc");
    	 
    	 System.out.println(money.getName()+" "+money.getType()+" "+money.getBalance());
    	 
    }
}
