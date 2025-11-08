package com.tushar.Transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
    	
    	TransactionDetails tran= (TransactionDetails) context.getBean("tranc");
    	
    	System.out.println(tran.getName()+ " "+tran.getBranch()+ " " +tran.getAmount());
    	
    }
}
