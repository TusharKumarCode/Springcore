package com.tushar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Item item= (Item) context.getBean(Item.class);
    	
    	System.out.println(item.getItemName());
    }
}
