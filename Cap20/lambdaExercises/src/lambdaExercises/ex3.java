package lambdaExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex3 {

	public static void main(String[] args) {
		String[] string = {"lucas", "fernanda", "pires","gonçaves","jameliao","pk"};
		
		
		
		System.out.println(Arrays.stream(string)
				.map(String::toLowerCase)
				.collect(Collectors.toList())
				);
		
		System.out.println(Arrays.stream(string)
				.map(String::toUpperCase)
				.collect(Collectors.toList())
				);

	}

}
