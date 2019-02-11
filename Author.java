package com.Assignment1;

public class Author {
	private String name;
	private String email;
	 private char gender;
	public  Author(String name, String email, char gender) {
		    super();
			this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void display()
	{
		 System.out.println( "Name of the author--"+name+"  "+"Email:"+email+"  "+"Gender-"+gender);
		
	}

}


-------------------------------------------------------------------------------------------------------------------------------------------------

package com.Assignment1;

public class Book {

	 private Author author;
	  private  String name;
	  private double price;
	  private int qty;
	
	public  Book( String name, double price, int qty) {
		super();
		
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public String getBname() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Author getAuthor() {
		return author;
	}
	public void display2()
	{
		System.out.println("Name of the book--"+this.name+"  "+"price of the book:"+this.price+"  "+"Quantity--"+this.qty);
	   
	}
	
	 
}
--------------------------------------------------------------------------------------------------------------------------

package com.Assignment1;
import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
		String name,email,bname;
                char grn;
		int qty;
                double price;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Author name");	
		name=sc.nextLine();
		System.out.println("enter Author Email");	
		email=sc.nextLine();
		System.out.println("enter Author Gender");
	        grn=sc.next().charAt(0);
	     
		Author a=new Author(name, email, grn);
		Book b=new Book("Beautiful Day",9999.99,1);
		
		a.display();
		b.display2();
		
		

	}

}
