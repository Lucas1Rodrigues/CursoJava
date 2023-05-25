package exercicio;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		//entrar valores em um array e apresentar qual foi o maior valor e a posicao deste valor
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos numeros deseja entrar: ");
		int n = sc.nextInt();
		int[] val = new int[n];
		
		for (int i = 0; i < val.length; i++) {
			System.out.println("Digite o valor: ");
			val[i] = sc.nextInt();
		}
		int j = 0, maior = 0,posicao = 0;
		for (int i = j+1; i < val.length; i++) {
			if (val[i] > val[j]) {
				maior = val[i];
				posicao = i;
			}else {
				maior = val[j];
				posicao = j;
			}
			j++;
		}
		
		System.out.println("O maior numero digitado é " + maior);
		System.out.println("Posicao do maior numero: " + posicao);
		

	}

}
