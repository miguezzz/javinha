package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.println("Enter account number: ");
		int accnumber = sc.nextInt();
		
		System.out.println("Is there an initial deposit? (y/n)");
		char askdeposit = sc.next().charAt(0);
		
		if (askdeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double inideposit = sc.nextDouble();
			acc = new Account(holder, accnumber, inideposit);
		}
		else {
			acc = new Account(holder, accnumber);
		}
		
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(acc.toString());
		
		System.out.println("");
		System.out.println("Enter deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("");
		System.out.println("Updated account data:");
		System.out.println(acc.toString());
		
		System.out.println("");
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("");
		System.out.println("Updated account data:");
		System.out.println(acc.toString());
		
		sc.close();
	}
}
