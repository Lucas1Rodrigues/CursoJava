package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String path = "/home/lucas/in.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
				line = br.readLine();	
			}
			System.out.println("Enter salary: ");
			Double salary = sc.nextDouble();
			
			List<String> emails = list.stream().filter(x -> x.getSalario() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
		}
		catch(IOException e) {
			
		}
		
		
	}
}