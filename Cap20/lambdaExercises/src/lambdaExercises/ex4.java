package lambdaExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex4 {

	public static void main(String[] args) {
		List <Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
	
		System.out.println("all duplicated elements removed: " + nums.stream().sorted()
		.distinct()
		.collect(Collectors.toList())
				
				);

	}

}
