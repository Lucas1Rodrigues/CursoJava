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
			Integer[][] mat = new Integer[l][c];
			
			System.out.println("Matriz: ");
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			System.out.println("Digite um numero: ");
			int x = sc.nextInt();
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if(x == mat[i][j]) {
						System.out.println("Posicao do numero: [" + i + "] [" + j + "]");
						if (i > 0) {
							System.out.println("Acima: " + mat[i-1][j]);
						}
						if(i < mat[i].length) {
							System.out.println("abaixo: " + mat[i+1][j]);
						}
						if (j > 0) {
							System.out.println("Esquerda: " + mat[i][j-1]);
						}
						if (j > mat[i].length - 1) {
							System.out.println("Direita: " + mat[i][j+1]);
						}
						
					}
				}
			}
		
			sc.close();
		}

	}
