package aulaArquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a path file: ");
		String sourceStr = sc.nextLine();
		File sourcePath = new File(sourceStr);
		
		System.out.println(sourcePath.getParent());
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourcePath))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				String[] number = line.split("+");
				int two = Integer.parseInt(number[0]);
				int exponential = Integer.parseInt(number[1]);
				System.out.println(two + "+" + exponential);
			}
		}
		catch (IOException e) {
			System.err.println("Error: ");
		}
		
		
		
	}

}
