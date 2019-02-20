package com.org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class EmployeeDAO 
{

	public int insert(Employee emp) throws SQLException {
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
		Connection conn =DBsingleton.getConnection();
		System.out.println(DBsingleton.getInstance().hashCode());

		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, emp.getEmpNo());
		pStatement.setString(2, emp.getEname());
		pStatement.setString(3, emp.getJob());
		pStatement.setInt(4, emp.getMgr());
		pStatement.setDate(5, emp.getHiredate());
		pStatement.setDouble(6, emp.getSal());
		pStatement.setDouble(7, emp.getComm());
		pStatement.setInt(8, emp.getDeptNo());
		int output=pStatement.executeUpdate();
		return output;
		
	}
	
	public Employee read(int empNo) throws SQLException {
		String query="select * from emp where empNo= ?";
		Employee emp=null;
		Connection conn = DBsingleton.getConnection();
		System.out.println(DBsingleton.getInstance().hashCode());
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			emp=new Employee();
			emp.setEname(resultSet.getString("ename"));
		}
		return emp;
	}
	public static void main(String[] args) {
		try {
			System.out.println(new EmployeeDAO().insert(new Employee(1008, "Sachin", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			System.out.println(new EmployeeDAO().read(7900));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
