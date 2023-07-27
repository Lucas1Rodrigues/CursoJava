package lambdaExercises;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {

	public static void main(String[] args) {
		String[] string = {"red", "orange", "yellow", "green","Blue", "indigo","Violet"};
		
		System.out.printf("Original array: %s", Arrays.stream(string).collect(Collectors.toList()));
		System.out.println();
		System.out.printf("In upper case: %s", Arrays.stream(string)
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList()));
		
		System.out.println();
		System.out.printf("Strings maiores que 'n' %s",Arrays.stream(string)
				.filter( s->  s.compareTo("n") > 0)
				.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.collect(Collectors.toList())
				);
		
		
		}

	}


