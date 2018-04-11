package analysis.basics.statistics;

public class Divisor {
	private int num;
	
	public Divisor(int n) {
		this.num = n;
	}
	
	public void printDivisor() {
		int i = 0;
		while(i != num) {
			i++;
			boolean isDivisor = false;
			if(num % i == 0) {
				isDivisor = true;
			}
			
			if(isDivisor) {
				System.out.print(i + " ");
			}
		}
	}
}
