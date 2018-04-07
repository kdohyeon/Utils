package analysis.basics.strings;

public class StringParser {
	
	private String str;
	private String delim;
	
	public StringParser(String str, String delim) {
		this.str = str;
		this.delim = delim;
	}
	
	public String[] getParsedString() {
		String[] result = str.split(delim);
		return result;
	}
}
