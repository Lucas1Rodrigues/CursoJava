package program;

import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) {		
		
		//Client data :
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Email: ");
		sc.nextLine();
		String email = sc.next();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		sc.nextLine();
		String date = sc.next();
		
		Client c1 = new Client(name, email, date);
			
		//Order data
		Date date1 = new Date();
		Order o1 = new Order();
		o1.setMoment(date1);
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		o1.setStatus(OrderStatus.PROCESSING);
		System.out.println("How many item to this order?  ");
		int n = sc.nextInt();
		
		OrderItem[] orderIt = new OrderItem[n];
		Product p1 = new Product();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter # " + (i + 1) + " item data: ");;
			System.out.println("Product name: " );
			String Name = sc.next();
			p1.setName(name);
			System.out.println("Product Price: ");
			Double price = sc.nextDouble();
			p1.setPrice(price);
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
	
			orderIt[i] = new OrderItem(quantity,price,p1);
		}
		
		System.out.println(o1);
		
		
		
	}

}
