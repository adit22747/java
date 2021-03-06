package com.cybage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.sql.DatabaseMetaData;

public class JDBCExample {
	public void getResultInfo() throws Exception{
		
//		String sql = "select * from customer where id = ?";
		String sql = "select * from customer";
		
		//1. get connection
		Connection con = DbUtil.getCon();
		
		
		//2.create prepared statement
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setInt(1, 12345);
		ResultSet result = ps.executeQuery();
		ResultSetMetaData metaData =  result.getMetaData();
		
		System.out.println("number of records: " + metaData.getColumnCount());
		con.close();
		ps.close();
		result.close();
		
	}
	
	public void getDbInfo() throws Exception {
		
		Connection con = DbUtil.getCon();
		
		DatabaseMetaData dbMetadata = con.getMetaData();  // information regarding the database
		System.out.println("username: " + dbMetadata.getUserName());
	}
	
	public void txnMgmnt() throws Exception {
		
		Connection con = DbUtil.getCon();
		con.setAutoCommit(false);
		
		PreparedStatement ps = con.prepareStatement("insert into customer values (12,'dm102')");
		ps.executeUpdate();
		
//		con.commit();   // it will be added permanently
//		con.rollback(); //it wont be reflected in database
	}
}
