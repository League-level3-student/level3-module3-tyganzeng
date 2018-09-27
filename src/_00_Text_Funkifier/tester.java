package _00_Text_Funkifier;

public class tester {
	public static void main(String[] args) {
		System.out.println(funkifyText("hello"));
	}

	public static String funkifyText(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				Character c = s.charAt(i);
				c = Character.toUpperCase(c);
				chars[i] = c;
			}
		}
		String d = new String(chars);
		return d;
	}
}
