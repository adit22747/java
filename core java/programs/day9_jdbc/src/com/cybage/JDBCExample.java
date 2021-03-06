package com.cybage;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCExample {
	
	public void getRecord() throws Exception {
//		// 1. need to load necessary class
//		Class.forName("com.mysql.cj.jdbc.driver");   //class will be provided by vendor(mysql)
//		
//		// 2. connect to actual database using mysql class(mysql driver)
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyb", "root", "password");
		
		
		Connection con = DbUtil.getCon();
		// 3. now we can talk to database through con connection
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery("select * from customer");
		
		while(result.next()) { //will fetch next record
			System.out.println(result.getInt(1) + "   " + result.getString(2));
		}
		
		
		result.close();
		statement.close();
		con.close();
		
	}
	
	public void addRecord() throws Exception {
//		// 1. need to load necessary class
//		Class.forName("com.mysql.cj.jdbc.driver");   //class will be provided by vendor(mysql)
//				
//		// 2. connect to actual database using mysql class(mysql driver)
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyb", "root", "password");
				
		// 3. now we can talk to database through con connection
		
		Connection con = DbUtil.getCon();
		
		PreparedStatement ps = con.prepareStatement("insert into customer values (?,?)");
		ps.setInt(1, 12345);
		ps.setString(2, "dm101");
		
		if(!ps.execute()) {
			System.out.println("record added");
		}
		else {
			System.out.println("could not add");
		}
		ps.close();
		
	}
}
