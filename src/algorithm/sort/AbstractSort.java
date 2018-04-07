package algorithm.sort;

public abstract class AbstractSort {
	private int[] input;
	private int maxSize;
	
	public AbstractSort(int[] input) {
		System.out.println("AbstractSort.java");
		maxSize = input.length;
		
		this.input = new int[maxSize];
		for(int i = 0; i < maxSize; i++) {
			this.input[i] = input[i]; 
		}
	}
	
	public abstract void print();
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public int[] getInput() {
		return input;
	}
}
