package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class SomaAlturas {

	public static void main(String[] args) {
		/* Ler nome, idade, e altura, apresentar
		altura media das pessoas e a porcentagem das pessoas com menos de 16 anos*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja inserir?:\n");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		float sum = 0;
		int menorQ = 0;
		for(int i = 0;i<n;i++) {
			System.out.println("Dadas da " + (1+i) + "a pessoa.\n");
			System.out.println("Digite o nome:");
			nome[i] = sc.next();
			System.out.println("Digite a idade:\n");
			idade[i] = sc.nextInt();
			System.out.println("Digite a altura:\n");
			altura[i] = sc.nextDouble();
			sum += altura[i];
			if(idade[i] < 16) {
				menorQ += 1;
			}
		}
		
		float avg = sum/n;
		float percent = (menorQ/n)*100;
	
		System.out.println("Altura media: " + sum/n);
		System.out.println("Pessoas com menos de 16 anos " + percent + "%");
		System.out.println("Nome das Pessoas \n");
		for(int i=0; i<n;i++) {
			System.out.println(nome[i] + "\n");
		}
		
	
	}

}
