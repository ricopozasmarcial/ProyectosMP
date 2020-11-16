/**
 * 
 */
package main;

import java.util.Iterator;

import UO263907.mp.sesion08.colecciones.LinkedList;
import UO263907.mp.sesion08.colecciones.List;

/**
 * @author UO263907
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    List myList = new LinkedList();
	    myList.add("uno");
	    myList.add("dos");
	    myList.add("tres");
	    myList.add("cuatro");
	    Iterator<Object> it = myList.iterator();
	    while(it.hasNext())
	    	System.out.println(it.next());
	    for(Object myListObject : myList)
	    	System.out.println(myListObject);
	}

}
