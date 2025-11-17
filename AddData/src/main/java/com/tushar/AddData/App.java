package com.tushar.AddData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException,SQLException
    {
       
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazone","root","tushar");
    	
    	try {
    		
    		connection.setAutoCommit(false);
    		String str="";
    		String newrow="insert into user(userid,username,password) values(?,?,?)";
    		PreparedStatement stm= connection.prepareStatement(newrow);
    		
    		stm.setInt(1, 5);
    		stm.setString(2, "rocky");
    		stm.setString(3, "rc8900");
    		
    		int updcn= stm.executeUpdate();
    		
    		System.out.println("user added now add products...");
    		
    		if(updcn>0) {
    			
    			String addrow="insert into item(name,price,qty) values(?,?,?)";
    			str.length();
    			stm=connection.prepareStatement(addrow);
    			stm.setString(1, "pendriver");
    			stm.setInt(2, 2980);
    			stm.setInt(3, 2);
    			
    			int updt= stm.executeUpdate();
    			
    			System.out.println("product added...");
    		}
    		
    		connection.commit();
    	}catch(Exception e) {
    		
    		e.printStackTrace();
    		connection.rollback();
    		System.out.println("roll back done....");
    	}
    }
}
