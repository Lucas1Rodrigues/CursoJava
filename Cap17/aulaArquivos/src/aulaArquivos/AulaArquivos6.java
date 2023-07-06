package aulaArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AulaArquivos6 {

	

	public static void main(String[] args) throws FileNotFoundException {
		// Ler o arquivo tabuada.txt	
		File path = new File("/home/lucas/eclipse/CursoJavaNelio/Cap17/tabuada.txt");
		Scanner sc = new Scanner(path);
		
		try {
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	
		
		}
	}


