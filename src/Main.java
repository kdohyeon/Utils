import algorithm.sort.HeapSort;
import analysis.basics.random.RandomInteger;
import data.structure.queue.Queue;
import data.structure.stack.Stack;

public class Main {
	public static void main(String args[]) {
		int elemSize = 20;
		RandomInteger rn = new RandomInteger(elemSize, 1, 500);
		rn.printRandomNumber();
		int[] unsorted = rn.getRandomNumber();
		
		Stack stack = new Stack();
		HeapSort hs = new HeapSort(unsorted);
		
		for(int i = 0; i < elemSize; i++) {
			stack.push(hs.getElem(i));
		}
		
		stack.print();
		stack.pop();
		stack.print();
		
		Queue queue = new Queue();
		for(int i = 0; i < elemSize; i++) {
			queue.insert(hs.getElem(i));
		}
		queue.print();
	}
}
