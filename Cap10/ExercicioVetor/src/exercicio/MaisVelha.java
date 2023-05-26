package exercicio;

import java.util.Scanner;

public class MaisVelha {

	public static void main(String[] args) {
		//Ler dois vetores nome e idade e apresentar a pessoa mais velha
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas pessoas entrará no porgrama?");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digte o nome da " + i + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
		}
		int j = 0,maior = 0,nomMaisVelho = 0;
		for (int i = j+1; i < idade.length; i++) {
			if(idade[i] > idade[j]) {
				maior = idade[i];
				nomMaisVelho = i;
			}else {
				maior = idade[j];
				nomMaisVelho = j;
			}
		}
		
		System.out.println("Nome da pessoa mais velha: " + nome[nomMaisVelho]);
		System.out.println("codigo do mais velho " + nomMaisVelho);
	}
	

}
