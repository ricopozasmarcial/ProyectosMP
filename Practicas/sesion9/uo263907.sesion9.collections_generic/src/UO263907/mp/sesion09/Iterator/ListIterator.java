/**
 * 
 */
package UO263907.mp.sesion09.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import UO263907.mp.sesion08.colecciones.List;



/**
 * @author UO263907
 *
 */
public class ListIterator implements Iterator<Object>{

	private List list;
	private int position;
	private boolean mayRemove;
	
	public ListIterator(List lista) {
	list = lista;
	mayRemove = false;
	}
	
	@Override
	public boolean hasNext() {
		return position< list.size();
	}

	@Override
	public Object next() {
		if(hasNext()==true) {
			mayRemove = true;
			return list.get(position++);
		}
		else
			throw new NoSuchElementException("no hay un elemento a continuacion");
		
	}
	
	/**
	 * se borra el elemento que se encuentra en la posicion anterior a position y no permite hacer dos removes consecutivos
	 * para hacer un removes, el usuario debe hacer previamente un next
	 */
	@Override
	public void remove() {
		if(mayRemove == true) {
			list.remove(position-1);
			position = position-1;
			mayRemove = false;
		}
		else
			throw new IllegalStateException("no se pueden borrar objetos");
		
	}

}
