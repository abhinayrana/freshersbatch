package com.org.ArrayList;

public class Employee
{
	  String empname;
	  String empid;
	  double empsal;

	  
	  public Employee(String empid, String empname, double empsal) 
	  {
		this.empname = empname;
		this.empid = empid;
		this.empsal = empsal;
	  }
	  
	  public String toString()
	  {
		  return empname+" "+empid+" "+empsal;
	  }
	
}
