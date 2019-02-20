package com.assign;

public interface Cal 
{
  public double result(double m,double n);
}
---------------------------------------------------------------

package com.assign;

class Calc
{
	public static void main(String[] args) 
	{
	  Cal c = (p,q) -> (p+q);
	  Cal d = (p,q) -> (p-q);
	  Cal e = (p,q) -> (p*q);
	  Cal f = (p,q) -> (p/q);
	  System.out.println("Sum of -2 and 1 = "+c.result(-2, 1));
	  System.out.println("Difference of 10 and 1 = "+d.result(2, 1));
	  System.out.println("Multiplication of 5 and 10 = "+e.result(5, 10));
	  System.out.println("Division of 49 and 10 = "+f.result(49, 10));
	}
}
