package com.tushar.Spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        
    	String config= "com\\tushar\\Spring\\accxml\\context.xml";
    	
    	ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext(config);
    	
    	
    	
    	
    }
}
