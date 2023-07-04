package aulaArquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AulaArquivos6 {

	public static void main(String[] args) {
		// Ler o arquivo tabuada.txt	
		File path = new File("/home/lucas/eclipse/CursoJavaNelio/Cap17/tabuada.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(" ERROR " + e.getMessage());
		}
		
	}

}
