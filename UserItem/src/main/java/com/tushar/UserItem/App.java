package com.tushar.UserItem;

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
    	
    	String newrow= "insert into item(name,price,qty) values(?,?,?)";
    	PreparedStatement stm= connection.prepareStatement(newrow);
    	
    	stm.setString(1, "earphone");
    	stm.setInt(2, 3000);
    	stm.setInt(3,1);
    	
    	int updateCount=stm.executeUpdate();
    	
    	System.out.println(updateCount);
    	
    	String addrow="insert into user(userid,username,password) values(?,?,?)";
    	PreparedStatement stms= connection.prepareStatement(addrow);
    	
    	stms.setInt(1, 10);
    	stms.setString(2, "tony");
    	stms.setString(3, "tn4589");
    	
    	int upcn= stms.executeUpdate();
    	
    	System.out.println(upcn);
    
    }
}
