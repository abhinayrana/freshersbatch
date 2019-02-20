package com.assign;

public class TestOrder 
{
  public static void main(String[] args) 
  {
	Order o=(p) -> {
		
		if(p>10000)
			 System.out.println("Price ="+p+", status = ACCEPTED");
		else
			System.out.println("Price ="+p+", status = REJECTED");
	
		return 1;
	};
	
	o.ord(2000);
	o.ord(20000);
	o.ord(11000);
  }
}
