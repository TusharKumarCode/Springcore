package com.tushar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springconfig.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Lecture lect= (Lecture) context.getBean("clg");
    	
    	System.out.println(lect.getName()+" "+lect.getDep()+" "+lect.getSalary());
    }
}
