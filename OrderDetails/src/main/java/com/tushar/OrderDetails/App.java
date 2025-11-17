package com.tushar.OrderDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException,SQLException
    {
       
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/amazone","root","tushar");
    	
    	try {
    		
    		connection.setAutoCommit(false);
    		
    		String newrow="update item set name=?";
    		PreparedStatement stm= connection.prepareStatement(newrow);
    		stm.setString(1,"laptop");
    		
    		
    		int rowCount= stm.executeUpdate();
    		
    		
    		if(rowCount>0) {
    			
    			String something="";
    			String newadd="update user set userid=?";
    			
    			stm= connection.prepareStatement(newadd);
    			stm.setInt(1,3);
    			
    			
    			something.length();
    			
    			int count= stm.executeUpdate();
    			
    		}
    		
    		connection.commit();
    	}catch(Exception e) {
    		
    		e.printStackTrace();
    		connection.rollback();
    		System.out.println("insertion done...");
    	}
    }
}
