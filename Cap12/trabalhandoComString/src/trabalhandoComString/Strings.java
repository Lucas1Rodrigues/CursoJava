package trabalhandoComString;

public class Strings {
	public String reverse(String s) {
		String ret = "";
		for (int i = 0; i < s.length(); i+=1) {
			ret = s.charAt(i) + ret;
		}
		return ret;
	}
}
