package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int n = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Digite um numero. Algo esta errado!");
			e.printStackTrace();
		}finally {
			System.out.println("******* Program finished ******");
		}
		
	}

}
