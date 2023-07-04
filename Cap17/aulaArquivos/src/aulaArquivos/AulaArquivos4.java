//Exemplo criado por mim, calcule a tabuada do numero escolhido e imprima a tabuada em um arquivo tabuada.txt
package aulaArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AulaArquivos4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("qual gostaria de saber: ");
			int n = sc.nextInt();
			int i = 0,x = 0;
			String path = new String("/home/lucas/eclipse/CursoJavaNelio/Cap17/tabuada.txt");
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
				 while(i<=10) {
					 x = n*i;
					 bw.write(n + "+" + i + " = " + x);
					 bw.newLine();
					 i++;
				}
				 if(path != null) {
					 System.out.println("Documento gerado com sucesso!");
				 }
			}
			catch(IOException e) {
				System.out.println("Error" + e.getMessage());
			}

	}

}
