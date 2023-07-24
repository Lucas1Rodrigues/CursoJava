package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.IncreasePrice;
import util.SumOfPredicate;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		SumOfPredicate sp = new SumOfPredicate();
	
		double sum = sp.filteredSum(list, p -> p.getPrice() >= 250);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		}

	}


