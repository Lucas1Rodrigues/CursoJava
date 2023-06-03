package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		Date date1 = new Date();
		Order o1 = new Order();
		
		//Client data :
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		sc.nextLine();
		Date date = sdf.parse(sc.next());
		
		Client c1 = new Client(name, email, date);
		
		//Order data
		o1.setMoment(date1);
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, c1);
		
		System.out.println("How many item to this order?  ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter # " + (i + 1) + " item data: ");;
			System.out.println("Product name: " );
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product Price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, price);
			
			OrderItem it = new OrderItem(quantity,price, product);
			order.addOrderItem(it);
		}
		System.out.println();
		System.out.println(o1);
		
		
		
	}

}
