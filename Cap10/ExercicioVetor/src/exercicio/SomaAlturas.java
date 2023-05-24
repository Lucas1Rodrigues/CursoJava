package exercicio;

import java.util.Scanner;

public class SomaAlturas {

	public static void main(String[] args) {
		/* Ler nome, idade, e altura, apresentar
		altura media das pessoas e a porcentagem das pessoas com menos de 16 anos*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja inserir?:\n");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0;i<n;i++) {
			System.out.println("Dadas da " + i + "a pessoa.\n");
			System.out.println("Digite o nome:\n");
			nome[i] = sc.next();
			System.out.println("Digite a idade:\n");
			idade[i] = sc.nextInt();
			System.out.println("Digite a altura:\n");
			altura[i] = sc.nextDouble();
		}
		
	
	}

}
