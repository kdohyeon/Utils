package data.structure.node;

public class Node<T> {
	private T elem;
	private Node nextNode;
	
	
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
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public void setElem(T elem) {
		this.elem = elem;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
