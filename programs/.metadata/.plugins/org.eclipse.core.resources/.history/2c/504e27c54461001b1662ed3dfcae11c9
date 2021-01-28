package com.cybage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbUtil {
	
	private static String dbUrl;
	private static String dbUser;
	private static String dbPassword;
	private static String className;

	static {
		try {
			FileReader reader = new FileReader("db.properties");
			Properties props = new Properties();
			
			props.load(reader);
			dbUrl = props.getProperty("dbUrl");
			dbUser = props.getProperty("dbUser");
			dbPassword = props.getProperty("dbPassword");
			className = props.getProperty("className");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	// without connection pool
//	public static Connection getCon() throws Exception {
//		
//		
//		// 1. need to load necessary class
//		Class.forName(className);   //class will be provided by vendor(mysql)
//				
//		// 2. connect to actual database using mysql class(mysql driver)
//		Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
//	
//	
//		return con;
//	}
	
	public static Connection getCon() throws Exception {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl(dbUrl);
		ds.setUsername(dbUser);
		ds.setPassword(dbPassword);
		ds.setMinIdle(5);
		ds.setMaxIdle(10);
		ds.setMaxOpenPreparedStatements(100);
	
		return ds.getConnection();

	}
	
	
}
