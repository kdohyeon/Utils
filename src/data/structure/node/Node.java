package data.structure.node;

public class Node<T> {
	private T elem;
	private Node<T> nextNode;
	
	
	/**
	 * Constructor
	 * */
	public Node(T elem) {
		this.elem = elem;
		this.nextNode = null;
	}
	
	public T getElem() {
		return elem;
	}
	
	public Node<T> getNextNode() {
		return nextNode;
	}
	
	public void setElem(T elem) {
		this.elem = elem;
	}
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
}
