import algorithm.sort.HeapSort;
import algorithm.sort.MergeSort;
import analysis.basics.random.RandomInteger;
import data.structure.queue.Queue;

public class Main {
	public static void main(String args[]) {
		int elemSize = 20;
		RandomInteger rn = new RandomInteger(elemSize, 1, 500);
		rn.printRandomNumber();
		int[] unsorted = rn.getRandomNumber();
		
		MergeSort ms = new MergeSort(unsorted);
		ms.print();
		
		HeapSort hs = new HeapSort(unsorted);
		hs.print();
		
		Queue queue = new Queue(elemSize);
		for(int i = 0; i < elemSize; i++) {
			queue.insert(i);
		}
		queue.print();
		queue.remove();
		queue.print();
		
	}
}
