package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import generics.CalculationServices;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String path = "/home/lucas/in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationServices.max(list);
			System.out.println("Max: ");
			System.out.println(x);
			
		}catch(IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
	}

}
