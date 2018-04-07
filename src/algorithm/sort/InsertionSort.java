package algorithm.sort;

public class InsertionSort extends AbstractSort {

	/**
	 * Time complexity: n^2
	 * */
	
	private int[] input;
	private int maxSize;
	private int minIndex;
	
	public InsertionSort(int[] input) {
		super(input);
		this.input = input;
		maxSize = input.length;
		minIndex = 0;
		// TODO Auto-generated constructor stub
		
		sort();
	}
	
	private void sort() {
		int temp = 0;
		
		for(int i = 0; i < maxSize-1; i++) {
			minIndex = i;
			for(int j = i+1; j < maxSize; j++) {
				if(input[minIndex] > input[j]) {
					minIndex = j;
				}
			}
			
			temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
		}
	}

	@Override
	public int getElem(int index) {
		// TODO Auto-generated method stub
		return this.abstractGetElem(input, index);
	}

	@Override
	public void printSort() {
		// TODO Auto-generated method stub
		this.abstractPrint(input);
	}


}
