package exercicio;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		// Criar dois vetores com tamanho N e somar entre eles, atribuindo o resultado em um terceiro vetor
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos terá os vetores? ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Digite os valores do vetor A");
			vectA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vectB.length; i++) {
			System.out.println("Digite os valores do vetor B");
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante:");
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
	}

}
