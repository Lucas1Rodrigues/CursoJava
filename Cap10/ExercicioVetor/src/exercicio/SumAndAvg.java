package exercicio;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		/* Fazer um programa que faça receber os numeros em um vetor
		e apos isso mostrar a soma e medio do valores recebidos */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o total de numeros recebidos:\n");
		int n = sc.nextInt();
		double[] vect = new double[n];
		int sum = 0;
		for(int i = 0;i<vect.length;i++) {
			System.out.println("Digite seus valores:\n");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.println("Media dos valores recebidos: " + sum/vect.length);
		System.out.println("\nSoma dos valores recebidos: " + sum);
		
	}

}
