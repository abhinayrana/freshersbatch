package com.org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory
{
private static Connection conn;
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g"
					+ "");
	            } 
               catch (ClassNotFoundException |SQLException e) 
                  {		
			e.printStackTrace();
		  }
		
		return conn;
	}
	public static void main(String[] args) {
		System.out.println(ConnectionFactory.getConnection());
	}

}
