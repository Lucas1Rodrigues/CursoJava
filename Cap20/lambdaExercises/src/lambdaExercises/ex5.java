package lambdaExercises;

import java.util.Arrays;
import java.util.List;

public class ex5 {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(3.4,6.5,9.1,4.5,1.7);
		
		System.out.println("Average: " + list.stream().mapToDouble(Double::doubleValue)
				.average().orElse(0.0)
				);
		
		
	}

}
