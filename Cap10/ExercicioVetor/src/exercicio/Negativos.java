package exercicio;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		//Ler N numeros e armazenar no vetor, e apos isso mostrar os numeros negativos
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o total de numeros: ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		
		for(int i=0;i<vectA.length;i++) {
			vectA[i] = sc.nextInt();
		}
		
		for(int i=0;i<vectA.length;i++) {
			if (vectA[i]<0) {
				System.out.println("Numeros negativos:\n" + vectA[i]);
			} 

		}

	}

}
