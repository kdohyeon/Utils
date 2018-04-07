package data.structure.stack;

import data.structure.node.Node;

/**
 * Use template
 * */

public class Stack<T> {
	/**
	 * Variables
	 * */
	private Node<T> top;
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
		Node<T> newNode = new Node<T>(elem);
		newNode.setNextNode(top);
		top = newNode;
	}
	
	/**
	 * Pop
	 * Remove the top element, and print the top element
	 * Print -1 if there is no element in the stack
	 * */
	public void pop() {
		System.out.println("Pop: " + top.getElem());
		stackSize--;
		top = top.getNextNode();
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
		System.out.println("Top: " + top.getElem());
		T elem = (T) top.getElem();;
		return elem;
	}
	
	/**
	 * Print all the element in the stack
	 * */
	public void print() {
		
		Node<T> tempNode = top;
		Node<T> pointerNode = top;
		
		int size = size();
		for(int i = 0; i < size; i++) {
			System.out.print(tempNode.getElem());
			
			if(pointerNode.getNextNode() != null) {
				System.out.print(" > ");
				tempNode.setElem(pointerNode.getNextNode().getElem());
				pointerNode = pointerNode.getNextNode();
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
}
