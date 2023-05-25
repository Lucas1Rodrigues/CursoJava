package exercicio;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		//Entrar os elementos de um vetor e apresentar a media entre eles, com tres casas decimais e os elementos abaixo da media
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double avg,sum=0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor: ");
			vetor[i] = sc.nextDouble();
			sum += vetor[i];
		}
		
		avg = sum/vetor.length;
		System.out.println("A media dos valores do vetor: " + avg);
		System.out.println("Valores abaixo da média: ");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < avg) {
				System.out.println(vetor[i]);
			}
		}

	}


}
