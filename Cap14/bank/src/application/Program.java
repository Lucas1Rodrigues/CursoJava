package application;

import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data account: ");
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Balance: ");
		Double balance = sc.nextDouble();
		System.out.println("withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account a1 = new Account(number, name, balance, withdrawLimit);
		
		a1.withdraw(1000.0);
		System.out.println(a1.getBalance());
		
		
		
		
	}

}
