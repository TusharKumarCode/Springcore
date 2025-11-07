package com.tushar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.config.Order;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        
        Order order= (Order) context.getBean("ord");
        
        System.out.println(order.getId()+ " "+order.getName()+ " "+order.getItem());
        
    }
    
}