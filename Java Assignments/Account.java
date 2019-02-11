package Account;

public class Account {
    String name,id;
     int balance;
 public Account()
 {
	 
 }
public Account(String name,String id)
{
	name=name;
	id=id;
}
public Account(String name,String id,int balance)
{
	this.name=name;
	this.id=id;
	this.balance=balance;
}
void setId(String i) 
{
	this.id=i;
}
void setName(String n)
{
	this.name=n;
}
void setBalance(int b)
{
	this.balance=b;
}
String getId()
{
	return id;
}
String getName()
{
	return name;
}
int getBalance()
{
	return balance;
}
  int  credit(int amt)
{
	  amt=balance+amt;
	  return amt;
	
}
int debit(int amt)
{
	if(amt<=balance)
		balance=balance-amt;
	else
		System.out.println("amount exceeded balance");
	return balance;
}
public String toString()
{
	return id+" "+name+" "+balance;
}
}
----------------------------------------------------------------------------------------

package Account;

import java.util.Scanner;

public class Pro {
	public static void main(String[] args) {
		Account a=new Account();
		
		a.setId("123A");
		a.setName("Aman");
		a.setBalance(1000);
		

		System.out.println("Id: "+a.getId());
		System.out.println("Name: "+a.getName());
		System.out.println("Balance: "+a.getBalance());
		
		System.out.print("Balance after crediting 500: ");
		System.out.println(a.credit(500));
		
		System.out.print("Balance after debiting 200: ");
		System.out.println(a.debit(200));
		
	}

}

