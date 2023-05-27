package matrizes;

import java.util.Scanner;

public class ExercicioMatrizes {

	public static void main(String[] args) {
		// Ler uma matriz com l linhas e c colunas, assim como os valores da matriz,
		//por fim ler um valor x e imprimir os valores a direita, esquerda, cima e baaixo
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor da linha e coluna (nessa ordem): ");
			int l = sc.nextInt();
			int c = sc.nextInt();
			int[][] mat = new int[l][c];
			
			System.out.println("Matriz: ");
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < c; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			System.out.println("Digite um numero: ");
			int x = sc.nextInt();
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if(x == mat[i][j]) {
						System.out.println("Acima: " + mat[i-1][l]);
						System.out.println("abaixo: " + mat[i+1][l]);
						System.out.println("Esquerda: " + mat[i][l-1]);
						System.out.println("Direita: " + mat[i][l+1]);
					}
			}
		}
		
	}

}
