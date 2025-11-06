package com.tushar.Bank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        String path="com\\tushar\\Bank\\context.xml\\applicationContext.Xml";
        
        ClassPathXmlApplicationContext applicationContext= new  ClassPathXmlApplicationContext(path);
        
        Account account = (Account) applicationContext.getBean("acc");
		System.out.println(account.getAccountNumber() + " " + account.getType() + " " + account.getIfsc());
    }
}
