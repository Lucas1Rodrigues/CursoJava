package aulaArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Product> list = new ArrayList<>();
		System.out.println("Enter a file path: ");
		String sourceStr = sc.nextLine();
		
		File sourceFile = new File(sourceStr);
		String sourceFolderStr = sourceFile.getParent();
		
		Boolean success = new File(sourceFolderStr + "/out").mkdir();
		String targetFileStr = sourceFolderStr + "/out/summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceStr))) {
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				itemCsv = br.readLine();
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
					for (Product item : list) {
						bw.write(item.getProduct() + "," + String.format("%.2f",item.getTotal()));
						bw.newLine();
					}
					System.out.println("file summary.csv created");
				} catch (IOException e) {
					// TODO: handle exception
				}
			}
			
		}catch(IOException e) {
			System.err.println("error");
		}
		
	}
}