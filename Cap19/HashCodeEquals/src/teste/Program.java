package teste;

public class Program {

	public static void main(String[] args) {
		
		teste t0 = new teste("maria", "maria@gmail.com");
		teste t1 = new teste("maria", "maria@gmail.com");		
		String s1 = "Lucas";
		String s2 = "Lucas";
		
		System.out.println(t0.hashCode());
		System.out.println(t1.hashCode());
		
		System.out.println(t0.equals(t1));
		System.out.println(s1==s2);
	}

}
