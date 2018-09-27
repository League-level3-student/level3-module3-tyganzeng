package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String b = "";
		for (int i = s.length(); i > 0; i--) {
			b += s.substring(i - 1, i);
		}
		return b;
	}

}
