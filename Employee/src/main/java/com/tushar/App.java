package com.tushar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Emp;
import com.configuration.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Emp emp= (Emp) context.getBean(Emp.class);
    	
    	System.out.println(emp.getName());
    }
}
