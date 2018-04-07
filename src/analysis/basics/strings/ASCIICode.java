package analysis.basics.strings;

public class ASCIICode {
	
	private String str = "";
	private char ch;
	private int in;
	private char[] asciiInChar = null;
	private int[] asciiInInt = null;
	
	
	/**
	 * Constructor for String input (parsing each char)
	 * Use 'getAsciiCodeInChar()' and 'getAsciiCodeInInt()'
	 * @param String
	 * */
	public ASCIICode(String str) {
		this.str = str;
		parseAsciiCodeInChar();
		convertAsciiCodeInInt();
	}
	
	/**
	 * Constructor for Char input (converting to corresponding Integer)
	 * @param Char
	 * */
	public ASCIICode(char ch) {
		this.ch = ch;
		in = (int) ch;
	}
	
	/**
	 * Constructor for Int input (converting to corresponding Char)
	 * @param Int
	 * */
	public ASCIICode(int in) {
		this.in = in;
		ch = (char)in;
	}
	
	private void parseAsciiCodeInChar() {
		asciiInChar = str.toCharArray();
	}
	
	private void convertAsciiCodeInInt() {
		asciiInInt = new int[asciiInChar.length];
		
		for(int i = 0; i < asciiInChar.length; i++){
			asciiInInt[i] = (int)asciiInChar[i];
		}
	}
	
	public char[] getAsciiInCharArray() {
		return asciiInChar;
	}
	
	public int[] getAsciiInIntArray() {
		return asciiInInt;
	}
	
	public int getAsciiInInt() {
		return in;
	}
	
	public char getAsciiInChar() {
		return ch;
	}
	
	public void printAsciiInChar() {
		for(int i = 0; i < asciiInChar.length; i++) {
			System.out.print(asciiInChar[i] + " (" + asciiInInt[i] + "), ");
		}
		System.out.println("");
	}
}
