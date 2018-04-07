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
	
	public abstract int getElem(int index);
	
	public abstract void printSort();
	
	public int abstractGetElem(int[] arr, int index) {
		return arr[index]; 
	}
	
	public void abstractPrint(int[] arr) {
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			if(i == size - 1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("");
	};
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public int[] getInput() {
		return input;
	}
}
