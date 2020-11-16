package UO263907.mp.sesion08.colecciones;

import java.util.Iterator;

import UO263907.mp.sesion09.Iterator.ListIterator;

public class ArrayList<T> implements List<T>{
	
	
	public int numberOfElements;
	public ArrayList list;
	
	/**
	 * metodo que indica el tamaño del ArrayList
	 */
	@Override
	public int size() {
		return size();
	}

	/**
	 * metodo que indica si el array esta vacio o no
	 */
	@Override
	public boolean isEmpty() {
		return size()==0;
	}

	/**
	 * metodo que indica si un Array contiene el objeto
	 * 
	 * @param o, un Object que indica el objeto que se quiere saber si esta en la coleccion o no
	 */
	@Override
	public boolean contains(T o) {
		boolean bool = false;
		for(int i= 0; i<size();i++) {
			if(get(i)==o)
				bool = true;
		}
		return bool;
	}

	/**
	 * metodo que añade un elemento
	 * 
	 * @param element, un object que indica el objeto a introducir
	 */
	@Override
	public boolean add(T element) {
		boolean bool = false;
		add(element);
		for(int i=0; i< size(); i++) {
			if(get(i)== element)
				bool=true;
		}
		return bool;
	}

	/**
	 * metodo que borra un elemento
	 * 
	 * @param o, un object que indica el objeto a borrar
	 */
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

	/**
	 * metodo que obtiene el objeto indicado por el index
	 * 
	 * @param index, un int que indica la posicion del objeto a devolver
	 */
	@Override
	public Object get(int index) {
		return get(index);
	}

	/**
	 * metodo que establece un determinado objeto en una posicion determinada
	 * 
	 * @param index, un int que indica el indice donde introducir el objeto
	 * @param element, un object que indica el elemento a introducir
	 */
	@Override
	public Object set(int index, T element) {
		return null;
	}

	/**
	 * metodo que añade un determinado objeto en una posicion determinada
	 * 
	 * @param index, un int que indica el indice donde introducir el objeto
	 * @param element, un objetc que indica el elemento a introducir
	 */
	@Override
	public void add(int index, T element) {
		for(int i=0; i<size();i++) {
			if(i==index)
				add(element);
		}
	}

	
	/**
	 * metodo que elimina un elemento en la posicion pasada como parametro
	 * 
	 * @param index, un int que indica el indice en el que eliminar el objeto
	 * @return 
	 */
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

	/**
	 * metodo que devuelve la posicion del objeto pasado como parametro
	 * 
	 * @param o, un Object que expresa el elemento del que queremos saber su posicion
	 */
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
	public Iterator<Object> iterator() {
		return new ListIterator(this);
	}

}
