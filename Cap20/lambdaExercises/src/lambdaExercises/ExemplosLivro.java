package lambdaExercises;

import java.util.stream.IntStream;

public class ExemplosLivro {

	public static void main(String[] args) {
		int[] values = {3, 10, 6, 1, 4, 8, 5, 9, 7};
		
		//exibe valores originais
		System.out.println("Original values: ");
		IntStream.of(values)
			.forEach(value -> System.out.printf("%d", value));
			System.out.println();
			
		// count, min, max,sum e average dos valores
		System.out.println("Count: " +IntStream.of(values).count());
		System.out.println("Min: " + IntStream.of(values).min().getAsInt());
		System.out.println("Max: " + IntStream.of(values).max().getAsInt());
		System.out.println("Sum: " + IntStream.of(values).sum());
		System.out.println("Average: " + IntStream.of(values).average().getAsDouble());
	
		//soma dos valores com metodo reduce
		System.out.println("Sum via reduce method: "
				+ IntStream.of(values).reduce(0,(x,y) -> x + y));
		//valores pares exibidos em ordem
		System.out.println("par values:");
		IntStream.of(values)
			.filter(value -> value%2 == 0)
			.sorted()
			.forEach(value -> System.out.println(value));
		
		System.out.println("Impar values multiplied by 10:");
		IntStream.of(values)
		.filter(value -> value%2 != 0)
		.map(value -> value*10)
		.sorted()
		.forEach(value -> System.out.println(value));
	
		System.out.println("sum of squares: " + IntStream.of(values)
		.reduce(0, (x,y)-> x + y * y));
		System.out.println("Product of all: " + 
		IntStream.of(values).reduce(1, (x,y) -> x*y)
				);
	
	
	
	
	}
	
	
}
