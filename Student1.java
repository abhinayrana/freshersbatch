package Account;

import java.util.Scanner;


public class Student1 extends Student
{
   
	public Student1(String name, String address) 
	{
         super(name , address);
         
	}
	

	public static void main(String[] args)
	{
          Student1 s=new Student1("AMAN","27/4");
          System.out.println("NAME:"+s.getName());
          System.out.println("ADDRESS:"+s.getAddress());
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your address to set");
          String  address=sc.next();
          System.out.println("Setting Address is:"+address);
    
  
          s.addCourseGrade();
          s.printGrades();
          s.averageGrade();
 
   
	}

}

