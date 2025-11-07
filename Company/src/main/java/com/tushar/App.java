package com.tushar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	 String path="com\\tushar\\context.xml\\application.Xml";
    	 
    	 ClassPathXmlApplicationContext application= new ClassPathXmlApplicationContext(path);
    	 
    	 Employee empl= (Employee) application.getBean("emp");
    	 
    	 System.out.println(empl.getName()+ " "+empl.getDepartment()+ " "+empl.getId());
    	 
    }
}
