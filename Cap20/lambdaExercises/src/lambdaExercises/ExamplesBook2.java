package lambdaExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExamplesBook2 {
	public static void main(String[] args) {
		Integer[] values = {5,2,6,3,7,8,1,9,10,4};
		
		System.out.printf("Original values: %s", Arrays.asList(values));
		
		System.out.println();
		System.out.printf("Sorted values: %s", Arrays.stream(values).sorted().collect(Collectors.toList()));
	
		//valores maiores que 4
		System.out.println();
		List<Integer> greaterThan4 =  Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());
		System.out.printf("values greater than 4 %s",greaterThan4);
		
		System.out.println(greaterThan4.stream().sorted().collect(Collectors.toList()));
				
		
	}

}
