package data.structure.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractTree<E> implements Tree<E> {
	public boolean isInternal(Position<E> p) {
		return numChildren(p) > 0;
	}
	
	public boolean isExternal(Position<E> p) {
		return numChildren(p) == 0;
	}
	
	public boolean isRoot(Position<E> p) {
		return p == root();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int depth(Position<E> p) {
		if(isRoot(p)) {
			return 0;
		}else {
			return 1 + depth(parent(p));
		}
	}
	
	public int height(Position<E> p) {
		int h = 0;
		for(Position<E> c : children(p)) {
			h = Math.max(h,  1 + height(c));
		}
		
		return h;
	}
	
	private void preorderSubtree(Position<E> p, List<Position<E>> snapshot) {
		snapshot.add(p);
		for(Position<E> c : children(p)) {
			preorderSubtree(c, snapshot);
		}
	}
	
	public Iterable<Position<E>> preorder(){
		List<Position<E>> snapshot = new ArrayList<>();
		if(!isEmpty()) {
			preorderSubtree(root(), snapshot);
		}
		return snapshot;
	}

	private class ElementIterator implements Iterator<E>{
		
		Iterator<Position<E>> posIterator = positions().iterator();
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return posIterator.hasNext();
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return posIterator.next().getElement();
		}
		
		public void remove() {
			posIterator.remove();
		}
		
	}
	
	public Iterator<E> iterator(){
		return new ElementIterator();
	}
	
	public Iterable<Position<E>> positions(){
		return preorder();
	}
}

