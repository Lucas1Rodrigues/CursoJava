package trabalhandoComString;

public class Strings {
	public String reverse(String s) {
		String ret = "";
		for (int i = 0; i < s.length(); i+=1) {
			ret = s.charAt(i) + ret;
		}
		return ret;
	}
	
	public String cipher(int key) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String escr = alphabet.substring(key);
		return escr + alphabet.substring(0,key);
	}
	
	public String breakCipher(String message) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String a ;
		if(alphabet.substring(1) == 
		
		
	}
}
