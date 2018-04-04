package analysis.datastructure.stack;

/**
 * Use template
 * */

public class Stack<T> {
	/**
	 * Variables
	 * */
	private Node top;
	private int stackSize;
	
	/**
	 * Constructor
	 * */
	public Stack(){
		top = null;
		stackSize = 0;
	}
	
	/**
	 * Push
	 * Put the parameter in the stack
	 * */
	public void push(T elem) {
		System.out.println("Push: " + elem);
		stackSize++;
		Node newNode = new Node(elem);
		newNode.nextNode = top;
		top = newNode;
	}
	
	/**
	 * Pop
	 * Remove the top element, and print the top element
	 * Print -1 if there is no element in the stack
	 * */
	public void pop() {
		System.out.println("Pop: " + top.elem);
		stackSize--;
		top = top.nextNode;
	}
	
	/**
	 * Empty
	 * Return 1 if the stack is empty, 0 if the stack is not empty
	 * */
	public boolean empty() {
		System.out.print("IsEmpty?");
		
		boolean result = false;
		if(stackSize == 0) {
			result = true;
		}else {
			result = false;
		}
		
		System.out.print(" " + result);
		System.out.println("");
		return result;
	}
	
	/**
	 * Size
	 * Return the number of element in the stack
	 * */
	public int size() {
		System.out.println("Current Size: " + stackSize);
		return stackSize;
	}
	
	/**
	 * Top
	 * Return the top element, and print the top element
	 * */
	public T top() {
		System.out.println("Top: " + top.elem);
		T elem = top.elem;
		return elem;
	}
	
	/**
	 * Print all the element in the stack
	 * */
	public void printAll() {
		
		Node tempNode = top;
		Node pointerNode = top;
		
		int size = size();
		for(int i = 0; i < size; i++) {
			System.out.print(tempNode.elem);
			
			if(pointerNode.nextNode != null) {
				System.out.print(" > ");
				tempNode.elem = pointerNode.nextNode.elem;
				pointerNode = pointerNode.nextNode;	
			}
		}
		System.out.println("");
	}
	
	/**
	 * Get string
	 * */
	public String getString() {
		return top.toString();
	}
	
	/**
	 * Node
	 * */
	private class Node{
		private T elem;
		private Node nextNode;
		
		/**
		 * Constructor
		 * */
		Node(T elem){
			this.elem = elem;
			this.nextNode = null;
		}
	}
}
