package algorithm.sort;

public class InsertionSort extends AbstractSort {

	/**
	 * Time complexity: n^2
	 * */
	
	private int[] input;
	private int maxSize;
	
	public InsertionSort(int[] input) {
		super(input);
		this.input = input;
		maxSize = input.length;
		
		// TODO Auto-generated constructor stub
		
		sort();
	}
	
	private void sort() {
		int temp = 0;
		int j = 0;
		for(int i = 1; i < maxSize; i++) {
			temp = input[i];
			for(j = i-1; j >= 0 && temp < input[j]; j--) {
				input[j+1] = input[j];
			}
			input[j+1] = temp;
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
