package exercicio;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		// ler N valores em um vetor e apresentar a media apenas dos valores pares digitados
		// se nao houver numeros pares, apresentar "NAO EXISTE NUMEROS PARES"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double avg,sum=0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]%2 == 0) {
				sum += vetor[i];
			}
		}
		avg = sum/vetor.length;
		if (sum == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.printf("A media dos numeros pares = %.1f",avg);
		}

	}

}
