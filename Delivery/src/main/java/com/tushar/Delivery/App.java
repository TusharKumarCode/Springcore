package com.tushar.Delivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Products prds= (Products) context.getBean("del");
    	
    	System.out.println(prds.getName()+ " " +prds.getItemName()+ " " +prds.getPrice());
    	
    }
}
