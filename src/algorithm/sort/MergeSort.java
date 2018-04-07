package algorithm.sort;

/**
 * @author kdohyeon
 * @name Merge Sort
 * @description Time complexity: nlog(n)
 * @category Sorting Algorithm
 * @since 2018. 04. 04
 * */

public class MergeSort extends AbstractSort{
	
	private int[] sorted = null;
	private int len = 0;
	
	//private int cnt = 0;
	
	public MergeSort(int[] input) {
		super(input);
		System.out.println("MergeSort.java");
		
		len = this.getMaxSize();
		sorted = new int[len];
		sort(input, 0, len - 1);
	}
	
	/**
	 * @param arr[]: array, m: start index, n: end index
	 * */
	public void sort(int arr[], int m, int n) {
		//System.out.println("Cycle: " + cnt);
		int middle = 0;
		if(m < n) {
			middle = (m + n) / 2;
			
			//System.out.println("middle: " + middle);
			
			sort(arr, m, middle);
			sort(arr, middle + 1, n);
			merge(arr, m, middle, n);
		}
		//cnt++;
	}
	
	/**
	 * @param arr[]: array, m: start index, middle: middle index, n: end index
	 * */
	public void merge(int arr[], int m, int middle, int n) {
		int i, j, k, t;
		
		i = m;
		j = middle + 1;
		k = m;
		
		while(i <= middle && j <= n) {
			if(arr[i] <= arr[j]) {
				sorted[k] = arr[i++];
			}else {
				sorted[k] = arr[j++];
			}
			k++;
		}
		
		if(i > middle) {
			for(t = j; t <= n; t++, k++) {
				sorted[k] = arr[t];
			}
		}else {
			for(t = i; t <= middle; t++, k++) {
				sorted[k] = arr[t];
			}
		}
		
		for(t = m; t <= n; t++) {
			arr[t] = sorted[t];
		}
	}
	
	@Override
	public void printSort() {
		// TODO Auto-generated method stub
		this.abstractPrint(sorted);
	}

	@Override
	public int getElem(int index) {
		// TODO Auto-generated method stub
		return this.abstractGetElem(sorted, index);
	}
}
