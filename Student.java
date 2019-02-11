package Account;

public class Student 
{
  private String name;
  private String address;
  private int numcourse;
  private String[] courses= {"java",".Net","C++"};
  private int[] grades= {60,50,70};

   void m()
  {
	  
  }
	
	public Student(String name,String address)
	{
		this.name=name;
		this.address=address;
	}


	public String getName() 
	{
		return name;
	}


	public String getAddress() 
	{
		return address;
	}


	public void setAddress(String address)
	{
		this.address = address;
	}
	
public String toString()
{
	return name+" "+address;
}

public void addCourseGrade()
{
	
	for(int i=0;i<courses.length;i++)
	{
		System.out.println("Course:"+courses[i]+"   "+"Grade:"+grades[i]);
		
	}
}

public void printGrades()
{
	
   for(int i=0;i<grades.length;i++)
   {
	   System.out.println("grade:"+grades[i]);
   }
}

public void averageGrade()
{
  int sum=0,count=0;
  
  for(int i=0;i<grades.length;i++)
  {
	  sum=sum+grades[i];
	  count++;
  }
 
  System.out.println("Average of All grades: "+sum/count);
	
   
}
}

