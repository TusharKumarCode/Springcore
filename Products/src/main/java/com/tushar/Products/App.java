package com.tushar.Products;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	 String config= "com\\tushar\\Products\\context.xml\\Contextapplication.Xml";
    	 
    	 ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext(config);
    	 
    	 ProductsDetails details= (ProductsDetails) applicationContext.getBean("items");
    	 
    	 System.out.println(details.getName()+ " "+details.getType()+ " "+details.getStatus()+ " "+details.getBillNO());
    	 
    	 
    }
}
