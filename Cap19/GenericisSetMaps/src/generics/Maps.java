package generics;

import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> m1 = HashMap<String, Integer>();
		
		
		m1.put("Lucas", 23);
		m1.put("Felicia", 25);
		m1.put("Jurislene",59);
		
		System.out.println(m1.get("Felicia"));
		System.out.println(m1.size());
		
		System.out.println("Qual a idade de lucas mais a de felicia?");
		int numLucas = m1.get("Lucas");
		int numFelicia = m1.get("Felicia");
		System.out.println(numLucas+numFelicia);
		
		System.out.println("Existe alguem com nome de Felipe?");
		if(m1.containsKey("Felipe")) {
			System.out.println("SIM");
		}else {
			System.out.println("NÃO");
		}
		
		System.out.println("Existe alguem com o nome de Jurislene?");
		if(m1.containsKey("jurislene")) {
			System.out.println("SIM");
		}else {
			System.out.println("NÃO");
		}
		System.out.println("------------------");
		for (String key : m1.keySet()) {
			System.out.println(key + ":" + m1.get(key));
		}
	}

}
