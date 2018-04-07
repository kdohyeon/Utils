package data.structure.queue;

public class Queue {
	private int front;
	private int end;
	private int maxSize;
	private int currSize;
	private Object[] queue;
	
	public Queue(int maxSize) {
		this.front = 0;
		this.end = -1;
		this.maxSize = maxSize;
		this.currSize = 0;
		this.queue = new Object[maxSize];
	}
	
	public boolean empty() {
		boolean result = false;
		if(front == end + 1) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	public boolean full() {
		boolean result = false;
		if(currSize == maxSize) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	public void insert(Object item) {
		assert !full(): "Queue Full";
		System.out.println("Insert: " + item);
		queue[++end] = item;
	}
	
	public Object peek() {
		assert !empty(): "Queue Empty";
		return queue[front];
	}
	
	public Object remove() {
		
		Object item = peek();
		System.out.println("Remove: " + item);
		front++;
		return item;
	}
	
	public void print() {
		for(int i = 0; i < maxSize; i++) {
			System.out.print(queue[i] + ", ");
		}
	}
}
