package sets;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Lucas");
		set.add("Pedro");
		set.add("Lucas");
		set.add("Lucas");
		set.add("Lucas");
		set.add("Junin");
		
		set.remove("Lucas");
		
		set.removeIf(x -> x.charAt(0) == 'P');
		System.out.println(set.contains("Lucas"));
		for (String item : set) {
			System.out.println(item);
		}
	}

}
