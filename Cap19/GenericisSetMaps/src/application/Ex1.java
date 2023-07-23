package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) throws ParseException  {
		Map<String, Integer> votosM = new LinkedHashMap<>();
		
		String path = "/home/lucas/in.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] eleitor = line.split(",");
				String name = eleitor[0];
				Integer votos = Integer.parseInt(eleitor[1]);
				
				if(votosM.containsKey(name)) {
					Integer votosSomados = votosM.get(name);
					votosM.put(name, votos + votosSomados);
				}else {
					votosM.put(name, votos);
				}
				line = br.readLine();
			}
			for (String name : votosM.keySet()) {
				System.out.println(name + ":" + votosM.get(name));
			}
			
		}catch(IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		catch(NullPointerException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		
		

	}

}
