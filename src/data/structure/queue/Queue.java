package data.structure.queue;

import data.structure.node.Node;

public class Queue<T> {
	
	private Node front;
	private Node rear;
	
	public Queue() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean empty() {
		boolean result = false;
		
		if(front == null) {
			result = true;
		}
		
		return result;
	}
	
	public void insert(T item) {
		System.out.println("Insert: " + item);
		Node node = new Node(item);
		node.setNextNode(null);
		
		if(empty()) {
			rear = node;
			front = node;
		}else {
			rear.setNextNode(node);
			rear = node;
		}
	}
	
	public T peek() {
		return (T) front.getElem();
	}
	
	public T remove() {
		T item = peek();
		System.out.println("Remove: " + item);
		front = front.getNextNode();
		
		if(front == null) {
			rear = null;
		}
		
		return item;
	}
	
	public void print() {
		Node tempNode = front;
		while(tempNode != null) {
			System.out.print(tempNode.getElem() + " > ");
			tempNode = tempNode.getNextNode();
		}
	}
}
