package com.tushar.ProductsRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException,SQLException
    {
       
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","tushar");
    	
    	String read="select * from salary";
    	PreparedStatement stm= connection.prepareStatement(read);
    	
    	ResultSet rs= stm.executeQuery();
    	
    	while(rs.next()) {
    		
    		int id=rs.getInt(1);
    		String name=rs.getString(2);
    		int salary=rs.getInt(3);
    		
    		System.out.println("id "+id+" name "+name+" salary "+salary);
    	}
    	
    	String upd="update salary set id=? where name=?";
    	PreparedStatement stms= connection.prepareStatement(upd);
    	
    	stms.setInt(1, 6);
    	stms.setString(2,"tushar");
    	
    	int updCount=stms.executeUpdate();
    	
    	System.out.println(updCount);
    	
    	String del="delete from salary where id=?";
    	PreparedStatement stmtm= connection.prepareStatement(del);
    	
    	stmtm.setInt(1, 5);
    	
    	int delCount=stmtm.executeUpdate();
    	
    	System.out.println(delCount);
    }
}
