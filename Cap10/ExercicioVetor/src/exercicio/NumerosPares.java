package exercicio;

import java.util.Iterator;
import java.util.Scanner;

public class NumerosPares {
	//Entre com os numeros e mostre quais sao pares e quantos sao no total.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros deseja entrar no programa?\n");
		int n = sc.nextInt();
		int[] num = new int[n];
		int contador = 0;
		
		for(int i = 0;i<n;i++) {
			System.out.println("Digite um numero inteiro: ");
			num[i] = sc.nextInt();
			}
		
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2 == 0) {
			contador++;
			System.out.print(num[i] + " ");
		}

	}
		System.out.println("\nO total de pares no array é: " + contador);

}
}