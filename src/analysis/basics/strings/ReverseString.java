package analysis.basics.strings;

public class ReverseString {
	
	private String str;
	private String result;
	
	public ReverseString(String input) {
		this.str = input;
		this.result = "";
		reverse();
	}
	
	private void reverse() {
		char[] parsedChar = str.toCharArray();
		int len = parsedChar.length;
		
		for(int i = len - 1; i >= 0; i--) {
			result = result + parsedChar[i];
		}
	}
	
	public String getReversedString() {
		return result;
	}
}
