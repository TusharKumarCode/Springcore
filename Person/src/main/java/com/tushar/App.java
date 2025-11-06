package com.tushar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	String config= "com\\tushar\\context.xml\\applicationContext.Xml";
    	
    	ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext(config);
    	
    	Details details= (Details) applicationContext.getBean("acc");
    	
    	System.out.println(details.getName()+ " " +details.getAddress()+ " " +details.getProp());
    	
    }
}
