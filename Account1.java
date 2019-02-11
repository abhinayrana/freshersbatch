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
