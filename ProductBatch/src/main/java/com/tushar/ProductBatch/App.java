package com.tushar.ProductBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException,SQLException
    {
        
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","tushar");
    	
    	String newdata= "insert into salary(id,name,salary) value(?,?,?)";
    	
    	PreparedStatement stm= connection.prepareStatement(newdata);
    	
    	for(int i=0;i<=10;i++) {
    		
    		stm.setInt(1, 15);
    		stm.setString(2, "rama");
    		stm.setInt(3, 40000);
    		stm.addBatch();
    	}
    	
    	int[] count=stm.executeBatch();
    	System.out.println(count);
    	
    	
    	
    }
}
