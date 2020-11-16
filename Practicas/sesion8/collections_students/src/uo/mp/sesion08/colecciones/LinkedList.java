package uo.mp.sesion08.colecciones;

public class LinkedList implements List {
	
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
	public boolean contains(Object o) {
		
		return false;
	}

	@Override
	public boolean add(Object element) {
		
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public Object get(int index) {
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		return null;
	}

	@Override
	public void add(int index, Object element) {

	}

	@Override
	public Object remove(int index) {
		return null;
	}

	@Override
	public void clear() {

	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	//redefinir equals, hashCode y toString
	
}
