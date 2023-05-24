package exercicio;

import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		int sum = 0;
		for(int i = 0;i<n;i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		double avg = sum/n;
		System.out.printf("O valor medio da altura e %.2f%n" + avg);
		
		sc.close();
	}

}
