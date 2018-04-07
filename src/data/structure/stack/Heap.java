package data.structure.stack;

public class Heap {
	private int maxHeapSize;
	private int[] itemHeap;
	private int currHeapSize;
	
	public Heap(int maxHeapSize) {
		this.maxHeapSize = maxHeapSize;
		itemHeap = new int[maxHeapSize+1];
		currHeapSize = 0;
	}
	
	public void insertHeap(int item) {
		int i = ++currHeapSize;
		
		while( (i != 1) && (item > itemHeap[i / 2])){
			itemHeap[i] = itemHeap[i / 2];
			i /= 2;
		}
		
		itemHeap[i] = item;
	}
	
	public int getHeapSize() {
		return this.currHeapSize;
	}
	
	public int deleteHeap() {
		int parent, child;
		int item, temp;
		
		item = itemHeap[1];
		temp = itemHeap[currHeapSize--];
		parent = 1;
		child = 2;
		
		while( child <= currHeapSize ) {
			if((child < currHeapSize) && (itemHeap[child] < itemHeap[child + 1])) {
				child++;
			}
			
			if(temp >= itemHeap[child]) {
				break;
			}
			
			itemHeap[parent] = itemHeap[child];
			parent = child;
			child *= 2;
		}
		
		itemHeap[parent] = temp;
		
		return item;
	}
	
	public int getMaxHeapSize() {
		return maxHeapSize;
	}
}
