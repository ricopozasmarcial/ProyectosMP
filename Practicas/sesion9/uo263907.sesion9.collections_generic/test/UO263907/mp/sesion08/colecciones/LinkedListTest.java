package UO263907.mp.sesion08.colecciones;

import static org.junit.Assert.*;

import UO263907.mp.sesion08.colecciones.LinkedList;
import UO263907.mp.sesion08.colecciones.List;

public class LinkedListTest extends ListTest {

	@Override
	public List createList() {
		return new LinkedList();
	}

}
