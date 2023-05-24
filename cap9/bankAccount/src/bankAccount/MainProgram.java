package bankAccount;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		String number = sc.next();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("\nIs there initial deposit: (true/false)");
		boolean initial = sc.nextBoolean();
		//Conditional
		int balance = 0;
		if (initial) {
			System.out.print("Enter your initial balance: ");
			balance = sc.nextInt();
		}
		
		Account a1 = new Account(number,name,initial,balance);
		
		a1.deposit(1000);
		System.out.println(a1.toString());
	}

}
