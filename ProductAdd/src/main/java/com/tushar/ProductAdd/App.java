package com.tushar.ProductAdd;

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
    	
    	String add="insert into salary(id,name,salary) value(?,?,?)";
    	PreparedStatement stm= connection.prepareStatement(add);
    	
    	stm.setInt(1,345);
    	stm.setString(2, "tushar");
    	stm.setInt(3,58949);
    	
    	int newRow= stm.executeUpdate();
    	
    	System.out.println(newRow);
    }
}
