import algorithm.sort.InsertionSort;
import analysis.basics.random.RandomInteger;

public class Main {
	public static void main(String args[]) {
		int elemSize = 20;
		RandomInteger rn = new RandomInteger(elemSize, 1, 500);
		rn.printRandomNumber();
		int[] unsorted = rn.getRandomNumber();
		
		InsertionSort is = new InsertionSort(unsorted);
		is.printSort();
	}
}
