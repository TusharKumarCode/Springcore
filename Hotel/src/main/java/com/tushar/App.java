package com.tushar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	String config="com\\tushar\\context.xml\\applcont.Xml";
    	
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(config);
    	
    	About about= (About) context.getBean("hot");
    	
    	System.out.println(about.getName()+ " "+about.getOwnerName()+ " "+about.getAddress());
    	
    }
}
