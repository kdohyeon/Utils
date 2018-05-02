package analysis.basics.strings;

public class Palindrome {
	
	public Palindrome() {
		
	}
	
	public String getPalindrome(String input) {
		String result = "";
		
		char[] parsedLine = input.toCharArray();
		
		int frontIdx = 0;
		int backIdx = parsedLine.length - 1;
		
		boolean isEnd = false;
		boolean isTrue = false;
		
		while(!isEnd) {
			
			if(parsedLine[frontIdx] == parsedLine[backIdx]) {
				frontIdx++;
				backIdx--;
			}else {
				isEnd = true;
			}
			
			// while loop end condition
			if(parsedLine.length % 2 == 0) { // if input is even length
				if(frontIdx == backIdx - 1) {
					isEnd = true;
					isTrue = true;
				}
			}else { // if input is odd length
				if(frontIdx == backIdx) {
					isEnd = true;
					isTrue = true;
				}
			}
		}
		
		if(isTrue) {
			result = "true";
		}else {
			result = "false";
		}
		return result;
	}
}
