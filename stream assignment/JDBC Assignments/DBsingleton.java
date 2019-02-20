package com.org.jdbc;

import java.sql.*;

public class DBsingleton {
	private static final DBsingleton ONE = new DBsingleton();
	private static Connection conn;

	 DBsingleton() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g" + "");
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

	public static DBsingleton getInstance() {
		return ONE;
	}

	public static Connection getConnection() {
		return conn;
	}
	
	  public static void main(String[] args) {
	  
	  DBsingleton dbs=DBsingleton.getInstance(); Connection
	  con=dbs.getConnection();
	  System.out.println("connected");
	  } 

}
