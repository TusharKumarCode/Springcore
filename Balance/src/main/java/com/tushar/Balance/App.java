package com.tushar.Balance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Accnt ac= (Accnt) context.getBean(Accnt.class);
    	
    	System.out.println(ac.getAccountHolderName());
    }
}
