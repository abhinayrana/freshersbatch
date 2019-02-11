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
