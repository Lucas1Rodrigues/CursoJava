//listando diretorios
package aulaArquivos;

import java.io.File;
import java.util.Scanner;

	public class AulaArquivos5 {
		public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println("Files: ");
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}
		
		
		
		
	
	
	
	
	}
}

