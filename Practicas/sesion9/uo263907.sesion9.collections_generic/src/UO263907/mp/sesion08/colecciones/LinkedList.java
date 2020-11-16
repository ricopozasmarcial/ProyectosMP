package UO263907.mp.sesion08.colecciones;

import java.util.Iterator;

import UO263907.mp.sesion09.Iterator.ListIterator;

public class LinkedList<T> implements List<T> {
	
	private Node head;
	private int numberOfElements;
	
	class Node{
		 Object element;
		 Node next;
		 
		 Node(Object element, Node next){
			 this.element = element;
			 this.next = next;
		 }
	}
	
	@Override
	public int size() {
		return numberOfElements;
		
	}

	@Override
	public boolean isEmpty() {
		return size()== 0;
	}

	@Override
	public boolean contains(T o) {
		for(int i = 0; i<size();i++) {
		}
		return false;
	}

	@Override
	public boolean add(T element) {
		boolean bool = false;
		this.add(element);
		for(int i=0; i< size(); i++) {
			if(get(i)== element)
				bool=true;
		}
		return bool;
	}

	@Override
	public boolean remove(T o) {
		boolean bool = false;
		for(int i= 0; i<size(); i++) {
			if(get(i)== o) {
				remove(i);
				bool = true;
			}
		}
		return bool;
	}

	@Override
	public Object get(int index) {
		return get(index);
	}

	@Override
	public Object set(int index, T element) {
		return null;
	}

	@Override
	public void add(int index, T element) {
		for(int i=0; i<size();i++) {
			if(i==index)
				add(element);
		}
	}

	@Override
	public Object remove(int index) {
		for(int i=0;i<size();i++) {
			if(get(i)==get(index))
				remove(i);
		}
		return remove(index);
	}

	@Override
	public void clear() {
		for(int i=0; i<size();i++) {
			remove(i);
		}
	}

	@Override
	public int indexOf(T o) {
		int contador = 0;
		for(int i = 0;i<size(); i++ ) {
			if(get(i)!= o)
				contador++;
		}
		return contador;
	}

	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		Node node = head;
		if (this.isEmpty()==false){
		     for ( int i = 0; i <size()-1; i ++){
			     sb.append(node.element.toString()).append(", ");
			     node=node.next;}
		sb.append(node.element.toString());
		}
		sb.append("]");
		return sb.toString();	
		
	}
	
	@Override
	public int hashCode(){
		int hashCode = 1;
	      for(Node node = head ; node!= null; node= node.next)
	          hashCode = 31 * hashCode + (node == null ? 0 : node.hashCode());
		return  hashCode;
	}
	
	@Override
	public boolean equals(Object o){
		List aux = (List) o;
		if(o == this)
			return true;
		if(!(o instanceof List) || this.size() != aux.size())
			return false;
		int index= 0;
		for (Node node = head ; node!= null; node= node.next) {
			if (!(node.element.equals(aux.get(index))))
				return false;
			index ++;
		}
		return true;
	}

	@Override
	public Iterator<Object> iterator() {
		return new ListIterator(this);
	}
	
	
}
