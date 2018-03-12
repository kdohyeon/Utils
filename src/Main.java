
public class Main {
	public static void main(String args[]) {
		
		BitwiseOperator bitwise_operator = new BitwiseOperator();
		
		String a = "1010";
		String b = "0101";
		
		int digit = 5;
		
		System.out.println(bitwise_operator.xor_operator(a, b));
		System.out.println(bitwise_operator.or_operator(a, b));
		System.out.println(bitwise_operator.and_operator(a, b));
		System.out.println(bitwise_operator.not_operator(a));
		
		System.out.println(" === ");
		
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(9, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(20, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(28, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(18, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(11, digit));
		
		System.out.println(" === ");
		
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(30, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(1, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(21, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(17, digit));
		System.out.println(bitwise_operator.convert_dec_to_binary_with_digit(28, digit));
		
	}
}
