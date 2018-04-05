import algorithm.sort.MergeSort;
import analysis.basics.random.RandomInteger;
import analysis.basics.strings.ASCIICode;

public class Main {
	public static void main(String args[]) {
		RandomInteger rn = new RandomInteger(20, 1, 500);
		int[] unsorted = rn.getRandomNumber();
		MergeSort ms = new MergeSort(unsorted);
		
		ms.print();
		
		ASCIICode asciiCode = new ASCIICode("abcd");
		asciiCode.printAsciiInChar();
		
		ASCIICode asciiCode2 = new ASCIICode(97);
		System.out.println(asciiCode2.getAsciiInChar());
		
		ASCIICode asciiCode3 = new ASCIICode('a');
		System.out.println(asciiCode3.getAsciiInInt());
	}
}
