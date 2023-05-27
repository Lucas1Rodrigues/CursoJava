package teoria;

import java.util.List;
import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		// demonstracao de listas e a classe array list
		
		List<String> list = new ArrayList<>();
		
		list.add("Lucas");
		list.add("Fulano");
		list.add("cicrano");
		list.add("aninha");
		list.add(0,"Danyelly");
		
		
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		list.removeIf(x -> x.charAt(0) == 'D');
		for (String string : list) {
			System.out.println(string);
		}

	}

}
