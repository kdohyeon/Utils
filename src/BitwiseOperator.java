
public class BitwiseOperator {
	/**
	Variables
	*/
	private String not_binary_number_error_message = "One of the parameters is a not binary number. Check your parameters";
	private String length_not_equal_error_message = "The two parameters are not equal in length. Check your parameters";
	
	/**
	Constructor
	*/
	public BitwiseOperator(){
		
	}
	
	/**
	Convert Decimal Number to Binary Number with Digit
	@param Decimal number, Digit
	@return Binary number
	*/
	public String convert_dec_to_binary_with_digit(int dec, int digit) {
		// convert dec to int
		// int decimal_number = Integer.parseInt(dec);
		int decimal_number = dec;
		
		// convert integer dec to binary string
		String result = "";
		for(int i = 0; i < digit; i++) {
			
			if(decimal_number == 1) {
				result = "1" + result;
				decimal_number--;
			}else if(decimal_number == 0){
				result = "0" + result;
			}else {
				if(decimal_number % 2 == 1) {
					result = "1" + result;
				}else {
					result = "0" + result;
				}
				
				decimal_number = decimal_number / 2;
			}
		}
		
		return result;
	}
	
	/**
	Convert Decimal Number to Binary Number
	@param Decimal number
	@return Binary number
	*/
	public String convert_dec_to_binary(int dec) {
		// convert dec to int
		// int decimal_number = Integer.parseInt(dec);
		int decimal_number = dec;
		
		// convert integer dec to binary string
		String result = "";
		while(true) {
			
			if(decimal_number == 1) {
				result = "1" + result;
				break;
			}else {
				if(decimal_number % 2 == 1) {
					result = "1" + result;
				}else {
					result = "0" + result;
				}
				
				decimal_number = decimal_number / 2;
			}
		}
		
		return result;
	}
	
	/**
	XOR operator
	If a and b are equal, return 1
	If a and b are different, return 0
	@param two binary Strings
	@return xor value of the two parameters
	@throws if one of the two Strings is not binary
	*/
	public String xor_operator(String a, String b) {
		assert(isBinary(a)): not_binary_number_error_message;
		assert(isBinary(b)): not_binary_number_error_message;
		assert(isLengthEqual(a, b)): length_not_equal_error_message;
		
		String result = "";
		
		int len = a.length();
		 
		String[] a_chars = new String[len];
		String[] b_chars = new String[len];
		
		a_chars = a.split("(?!^)");
		b_chars = b.split("(?!^)");
		
		for(int i = 0; i < len; i++) {
			if(a_chars[i].equals(b_chars[i])) {
				result = result + "0";
			}else {
				result = result + "1";
			}
		}
		
		return result;
	}
	
	/**
	OR operator
	If a or b is either 1, return 1
	else, return 0
	@param two binary Strings
	@return or value of the two parameters
	@throws if one of the two Strings is not binary
	*/
	public String or_operator(String a, String b) {
		assert(isBinary(a)): not_binary_number_error_message;
		assert(isBinary(b)): not_binary_number_error_message;
		assert(isLengthEqual(a, b)): length_not_equal_error_message;
		
		String result = "";
		
		int len = a.length();
		 
		String[] a_chars = new String[len];
		String[] b_chars = new String[len];
		
		a_chars = a.split("(?!^)");
		b_chars = b.split("(?!^)");
		
		for(int i = 0; i < len; i++) {
			if(a_chars[i].equals("1")) {
				result = result + "1";
			}else if(b_chars[i].equals("1")){
				result = result + "1";
			}else{
				result = result + "0";
			}
		}
		
		return result;
	}
	
	/**
	AND operator
	If a and b are both 1, return 1
	else, return 0
	@param two binary Strings
	@return and value of the two parameters
	@throws if one of the two Strings is not binary
	*/
	public String and_operator(String a, String b) {
		assert(isBinary(a)): not_binary_number_error_message;
		assert(isBinary(b)): not_binary_number_error_message;
		assert(isLengthEqual(a, b)): length_not_equal_error_message;
		
		String result = "";
		
		int len = a.length();
		 
		String[] a_chars = new String[len];
		String[] b_chars = new String[len];
		
		a_chars = a.split("(?!^)");
		b_chars = b.split("(?!^)");
		
		for(int i = 0; i < len; i++) {
			if(a_chars[i].equals("1") && b_chars[i].equals("1")) {
				result = result + "1";
			}else{
				result = result + "0";
			}
		}
		
		return result;
	}
	
	/**
	NOT operator
	If 1, then return 0
	If 0, then return 1
	@param one binary String
	@return not value of the two parameters
	@throws if one of the two Strings is not binary
	*/
	public String not_operator(String a) {
		assert(isBinary(a)): not_binary_number_error_message;
		
		String result = "";
		
		int len = a.length();
		 
		String[] a_chars = new String[len];
		
		a_chars = a.split("(?!^)");
		
		for(int i = 0; i < len; i++) {
			if(a_chars[i].equals("1")) {
				result = result + "0";
			}else{
				result = result + "1";
			}
		}
		
		return result;
	}
	
	private boolean isBinary(String bin) {
		boolean result = false;
		int len = bin.length();
		String[] chars = new String[len];
		chars = bin.split("(?!^)");
		
		for(int i = 0; i < len; i++) {
			if(chars[i].equals("1") || chars[i].equals("0")) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	private boolean isLengthEqual(String a, String b) {
		boolean result = false;
		int a_len = a.length();
		int b_len = b.length();
		
		if(a_len != b_len) {
			result = false;
		}else {
			result = true;
		}
		return result;
	}
}
