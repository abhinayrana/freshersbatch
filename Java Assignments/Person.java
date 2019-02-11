package com.Assignment1;

public class Person {
	protected String name;
	private String address;

		public Person(String name,String address) {
			this.name = name;
			this.address = address;
			
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + "]";

		}

		
}

--------------------------------------------------------------------------------------------------------------------------------

package com.Assignment1;
import java.util.Arrays;
public class Student extends Person{
	private int numCourses;
	private String[] courses;
	private int[] grades;
	public Student(String name, String address) {
		super(name, address);
		this.numCourses=0;
		
		
	}
	@Override
	public String toString() {
		return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + "]";
	}
	public void  addCourseGrade(String courses,int grades) {
		this.courses[numCourses]=courses;
		this.grades[numCourses]=grades;
		numCourses++;
	}
	public void printGrades() {
		System.out.println(name);
		for( int i=0;i<numCourses;i++)
			System.out.println(courses[i] +":"+ grades[i]);
			
		
	}
	public double getAverageGrade() {
		int sum=0;
		for(int i=0;i<numCourses;i++)
			sum+=grades[i];
		
		return sum/numCourses;
			
	}

}
-------------------------------------------------------------------------------------------------------------------

package com.Assignment1;

public class Teacher  extends Person {

		private String[] courses;
		private  int numCourses;

		public Teacher(String name, String address) {
			super(name, address);
			numCourses=0;
			courses=new String[30];
			
		}

		@Override
		public String toString() {
			return "Teacher [getAddress()=" + getAddress() + ", getName()=" + getName() + ", toString()=" + super.toString()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}

	public boolean addCourse(String Course) {
		boolean status=false;
		for( int i=0;i<numCourses;i++)
		{
		       if(Course.equals(courses[i]))
		    	   status=true;
		   
			
		}
		if(status==false) {
			courses[numCourses]=Course;
			numCourses++;
			return true;

		}
		else
			return false;
	}
		

}
----------------------------------------------------------------------------------------------------------------------------------------

package com.Assignment1;

public class PracStudent {

	public static void main(String[] args) {
		Person p = new Person("Abhinay","Himachal Pradesh");
		Student s = new Student("Rajesh","Bihar");
		Teacher t = new Teacher("Ankit","Rajasthan");
		System.out.println(t.addCourse("Maths"));
		System.out.println(s.addCourseGrade("Maths",89));

	}

}
