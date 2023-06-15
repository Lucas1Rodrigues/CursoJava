package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Commom, used or imported: (c/u/i)");
			char c = sc.next().charAt(0);
			if(c == 'c') {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				Product c1 = new Product(name, price);
			}else {
				if(c == 'u') {
					
				}
			}
			
		}
	}

}
