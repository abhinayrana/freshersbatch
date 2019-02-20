package com.assign;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTransaction {

	public static void main(String[] args) 
	{
		Trader t1= new Trader("aman","shimla");
		Trader t2= new Trader("shivani","delhi");
		Trader t3= new Trader("rohit","indore");
		Trader t4= new Trader("varun","pune");
		Trader t5= new Trader("rajesh","pune");
		Trader t6= new Trader("vikas","bangalore");
		Trader t7= new Trader("vicky","delhi");
		
		List<Transaction> list= new ArrayList<>();
		
		list.add(new Transaction(t1,2011,150000));
		list.add(new Transaction(t2,2012,200000));
		list.add(new Transaction(t3,2011,50000));
		list.add(new Transaction(t4,2018,300000));
		list.add(new Transaction(t5,2019,500000));
		list.add(new Transaction(t6,2018,700000));
		list.add(new Transaction(t7,2000,300000));
		
		List<Transaction> list2=list.stream()
				.filter(p->p.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
		
		System.out.println("Transactions in ascending order:- ");
		list2.forEach(e->System.out.println("Year = "+e.getYear()+" Value = "+e.getValue()));
	
		System.out.println("-------------------------------------------------------");
		System.out.println("Traders working in pune in ascending order:- ");
		
		List<String> list3=list.stream()
				.filter(p->p.getTrader().getCity().equals("pune"))
				.sorted(Comparator.comparing(e->e.getTrader().getName()))
				.map(e->e.getTrader().getName())
				.collect(Collectors.toList());
				list3.forEach(System.out::println);
				
				System.out.println("-------------------------------------------------------");
				System.out.println("Traders working in indore:- ");
				
				List<String> list4=list.stream()
						.filter(p->p.getTrader().getCity().equals("indore"))
						.map(e->e.getTrader().getName())
						.collect(Collectors.toList());
						list4.forEach(System.out::println);
						
						System.out.println("-------------------------------------------------------");
						System.out.println("unique cities are:- ");
						
						List<String> list5=list.stream()
								.map(e->e.getTrader().getCity())
								.distinct()
								.collect(Collectors.toList());
						list5.forEach(System.out::println);
						

						System.out.println("-------------------------------------------------------");
						System.out.println("Transaction values of traders from delhi are:- ");
						
						
						List<Transaction> list6=list.stream()
								.filter(p->p.getTrader().getCity().equals("delhi"))
								.collect(Collectors.toList());
						
 list6.forEach(e->System.out.println("Name = "+e.getTrader().getName()+", Value = "+e.getValue()+", City = "+e.getTrader().getCity()));
	
 
 System.out.println("-------------------------------------------------------");
	System.out.println("highest value of all the transactions is:- ");

	
	int list7=list.stream()
			.max(Comparator.comparing(Transaction::getValue))
			.map(Transaction::getValue)
			.get();
	System.out.println(list7);
	
	 System.out.println("-------------------------------------------------------");
		System.out.println("smallest value of all the transactions is:- ");

		int list8=list.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.map(Transaction::getValue)
				.get();
		System.out.println(list8);
								
	}
}
