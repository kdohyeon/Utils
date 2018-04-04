package analysis.basics.statistics;

import java.util.ArrayList;

public class Divider {
	public Divider() {
		
	}
	
	public ArrayList<Integer> getQuotientList(int num){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int quotient = num;
		result.add(quotient);
		System.out.println(quotient);
		
		while(true) {
			if(quotient == 1)
				break;
			
			quotient = quotient / 2;
			result.add(quotient);
			System.out.println(quotient);
		}
		
		return result;
	}
}
