package lambdaExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex2 {

	public static void main(String[] args) {
		// ler dois numeros e somar usando expressoes lambd
		
		int[] vectInt = {4,1,54,6,8,100,12,1};
		System.out.println(IntStream.of(vectInt)
				.average().getAsDouble()
				);
		
		

	}

}
