package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Email: ");
		sc.nextLine();
		String email = sc.next();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		sc.nextLine();
		String data = sc.next();
		
		System.out.println(date.parse(data));
	
	}

}
