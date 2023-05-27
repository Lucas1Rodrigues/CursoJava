package exercicio;

import java.util.Scanner;

public class ExercicioPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many room will be rented: ");
		int n = sc.nextInt();
		int[] room = new int[n];
		String[] name = new String[n];
		String[] email = new String[n];
		boolean[] rented = new boolean[n];
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.println("Nome: " );
			name[i] = sc.next();
			System.out.print("Email: ");
			sc.nextLine();
			email[i] = sc.next();
			System.out.println("Room: ");
			room[i] = sc.nextInt();
				
		}
		System.out.println("Busy rooms: ");
		for (int i = 1; i <= n; i++) {
			if (name[i] != null) {
				System.out.println(room[i] + ": " + name[i] + ", " + email[i]);
			}
			
		}
		
	}

}
