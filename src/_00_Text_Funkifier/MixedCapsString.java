package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				Character c = s.charAt(i);
				c = Character.toUpperCase(c);
				chars[i] = c;
			} else {
				Character c = s.charAt(i);
				c = Character.toLowerCase(c);
				chars[i] = c;
			}
		}
		String d = new String(chars);
		return d;
	}

}
