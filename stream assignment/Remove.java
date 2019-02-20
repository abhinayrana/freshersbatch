package com.assign;

import java.awt.List;
import java.util.ArrayList;

public class Remove 
{

	public static void main(String[] args) 
	{
		
        ArrayList<String> list= new ArrayList<>();
        list.add("Aman");
        list.add("Gaurav");
        list.add("Abhinay");
        list.add("Sandeep");
        list.add("Cristiano");
        System.out.println("Before removing even no. words :-");
        System.out.println(list);
        System.out.println("\n");
 
        list.removeIf(e->(e.length()%2==0));
        System.out.println("After removing even no. words :-");
        System.out.println(list);
    }

}
