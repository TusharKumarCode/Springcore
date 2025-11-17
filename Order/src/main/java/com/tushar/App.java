package com.tushar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	OrderItems ordit= (OrderItems) context.getBean(OrderItems);
    	
    	System.out.println(ordit.getOrderId());
    	
    	
    }
}
