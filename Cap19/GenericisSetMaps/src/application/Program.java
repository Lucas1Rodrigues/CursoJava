package application;

import java.util.Iterator;
import java.util.Scanner;

import generics.PrintService;

public class Program {

	public static void main(String[] args) {
		PrintService<Integer> p = new PrintService<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			p.addValue(value);
		}
		
		System.out.println("first number: ");
		p.printar();
		
	}

}
