package trabalhandoComString;

public class testandoStrings {
	public static void main(String[] args) {
		/*
		alphabet.substring(23);
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("Lucas doido "));
		sb.insert(6, "nao é ");
		System.out.println(sb);
		System.out.println(alphabet.substring(23)+alphabet.substring(0,23));
	*/
		Strings s1 = new Strings();
		
		//invertendo palavras
		System.out.println(s1.reverse("Lucas Rodrigues"));
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alphabet);
		System.out.println(s1.cipher(19));
	
		
	}
}
