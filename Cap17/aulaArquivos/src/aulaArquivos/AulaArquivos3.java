package aulaArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AulaArquivos3 {
	public static void main(String[] args) {
		String path ="/home/lucas/eclipse/CursoJavaNelio/Cap17/in.txt";
	
			
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
			catch(IOException e)
			{
				System.out.println("error: " + e.getMessage());
			}
			}
	}