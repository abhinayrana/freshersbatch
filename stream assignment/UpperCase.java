package com.assign;

import java.util.ArrayList;
import java.util.List;

public class UpperCase 
{

	public static void main(String[] args) 
	{
		
		 List<String> list= new ArrayList<>();
	        
		    list.add("aman");
	        list.add("gaurav");
	        list.add("abhinay");
	        list.add("sandeep");
	        list.add("cristiano");
	        
	        System.out.println("Before converting to uppercase :-");
	        System.out.println(list);
	        System.out.println("\n");
	        
	        list.replaceAll(e->e.toUpperCase());
	        System.out.println("After converting to uppercase :-");
	        System.out.println(list);
	        
	}

}
