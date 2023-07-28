package lambdaExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex6 {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(3.4,6.5,9.1,4.5,1.7);
		
		
		System.out.println("Original list: " + list.stream().collect(Collectors.toList()));
		
		System.out.println("Sum of list: " + list.stream()
				.mapToDouble(Double::doubleValue).sum()
				);

	}

}
