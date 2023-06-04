package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department's name: ");
		String nameDepart = sc.next();
		
		Department d1 = new Department(nameDepart);
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String nameWorker = sc.next();
		System.out.println("Level: (High case only)");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.println("Base Salary: ");
		Double salary = sc.nextDouble();
		Worker w1 = new Worker(nameWorker,level,salary,d1);
		
		System.out.println("How many contracts to this worker");
		int n = sc.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contracts #" + (1+i) + " data");
			System.out.println("Date: (dd/MM/yyyy)");
			Date date = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours)");
			Integer hours = sc.nextInt();
			
			HourContract c1 = new HourContract(date,valuePerHour,hours);
			w1.addContract(c1);
		}
		
		System.out.println("Enter month and year to calculate income: (MM/yyyy) ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + w1.getName());
		System.out.println("Department: " + d1.getName());
		System.out.println("income for: " + monthAndYear + ": " + w1.income(year, month));
	
		sc.close();
	}

}
