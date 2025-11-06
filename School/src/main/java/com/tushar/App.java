package com.tushar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	String config="com\\tushar\\stdcontext.xml\\Context.Xml";
    	
    	ClassPathXmlApplicationContext application= new ClassPathXmlApplicationContext(config);
    	
    	Students stds= (Students) application.getBean("std");
    	
    	System.out.println(stds.getName()+ " "+stds.getClasses()+ " "+stds.getSection());
    	
    }
}
