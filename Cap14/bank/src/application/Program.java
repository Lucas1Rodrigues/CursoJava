package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data: ");
			System.out.println("Number: ");
			Integer number = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Balance: ");
			Double balance = sc.nextDouble();
			System.out.println("withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
		
			Account a1 = new Account(number, name, balance, withdrawLimit);
			System.out.print("Enter amount withdraw: ");
			Double amount = sc.nextDouble();
			a1.withdraw(amount);
			System.out.println("New balance: " + a1.getBalance());
		}
		catch(DomainException e)
		{
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("try again, type correct data.");
		}
		
		
		
		
		
		
		
		
		
	}

}
