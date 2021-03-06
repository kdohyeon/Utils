package algorithm.sort;

import data.structure.heap.Heap;

/**
 * @author kdohyeon
 * Time complexity: nlog(n)
 * */

public class HeapSort extends AbstractSort{
	private int maxHeapSize;
	private int[] input;
	
	public HeapSort(int[] input) {
		super(input);
		System.out.println("HeapSort.java");
		
		this.maxHeapSize = input.length;
		this.input = new int[maxHeapSize];
		for(int i = 0; i < maxHeapSize; i++) {
			this.input[i] = input[i];
		}
		
		sort();
	}
	
	private void sort() {
		Heap heap = new Heap(maxHeapSize);
		for(int i = 0; i < maxHeapSize; i++) {
			heap.insertHeap(input[i]);
		}
		
		for(int i = maxHeapSize - 1; i >= 0; --i) {
			input[i] = heap.deleteHeap();
		}
	}

	@Override
	public void printSort() {
		// TODO Auto-generated method stub
		this.abstractPrint(input);
	}

	@Override
	public int getElem(int index) {
		// TODO Auto-generated method stub
		return this.abstractGetElem(input, index);
	}
	
	
}
