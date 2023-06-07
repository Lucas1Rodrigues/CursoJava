package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee data "+ i + "# data: ");
			System.out.println("Outsourced (y/n): ");
			char c = sc.next().charAt(0);
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Hours: " );
			int hours = sc.nextInt();
			sc.nextLine();
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if(c=='y') {
				System.out.println("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
				
			}
		}
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}
}
