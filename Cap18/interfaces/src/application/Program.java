package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		boolean control = true;
		
		while(control) { 
			System.out.println("Enter Circle or Rectangle (c/r)");
			char shape = sc.next().charAt(0);
		if(shape == 'C') {
			System.out.println("Enter radius: ");
			Double radius = sc.nextDouble();
			Circle c = new Circle(radius);
			System.out.println("The circle area: " + c.area());
		}else if(shape == 'R'){
			System.out.println("Enter width: ");
			Double width = sc.nextDouble();
			System.out.println("Enter height: ");
			Double height = sc.nextDouble();
			Rectangle r = new Rectangle(width, height);
			System.out.println("The Rectangle area: " + r.area());
		}else if(shape!='C' || shape != 'R') {
			System.err.println("Just type R or C characters in this program.");
		}
	}
	}
}