package aulaArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AulaArquivos {

	public static void main(String[] args) {
		File file = new File("/home/lucas/eclipse/CursoJavaNelio/Cap17/in.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			System.out.println("Caminho: " + file.getPath());
			System.out.println("Nome do arquivo: " + file.getName());
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
