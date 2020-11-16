package UO263907.mp.sesion08.colecciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import UO263907.mp.sesion08.colecciones.LinkedList;
import UO263907.mp.sesion08.colecciones.List;

public abstract class ListTest {

	private List list;

	public ListTest() {
		super();
	}

	@Before
	public void setUp() {
		list = new LinkedList();
	}

	@Test
	public void testSize() {
		//caso1: lista vacia
		assertEquals(0,list.size());
		//caso2: lista con elementos
		list.add("cadena1");
		assertEquals(1,list.size());
		list.add("cadena2");
		assertEquals(2,list.size());
		list.add("cadena3");
		assertEquals(3,list.size());
	}

	@Test
	public void testIsEmpty() {
		
		//caso1: lista vacia
		assertTrue(list.isEmpty());
		//caso2: lista con elementos
		list.add("cadena1");
		assertFalse(list.isEmpty());
		
	}

	@Test
	public void testContains() {
		//caso1: lista contiene al objeto en primera posicion
		//caso2: lista contiene al objeto en posicion intermedia
		//caso3: lista contiene al objeto en posicion ultima
		//caso4: lista no contiene al objeto
		//caso5: recibe y contiene al objeto null
		//caso6: recibe objeto null y no lo contiene
		
	}

	@Test
	public void testAddObject() {
		
		//caso1: se añade el objeto en cuestion al final de la lista con elementos
		list.add("Hola");
		assertEquals(1, list.size());
		assertEquals("Hola", list.get(0));
		list.add("que tal");
		assertEquals(2, list.size());
		assertEquals("que tal", list.get(0));
		list.add("estas");
		assertEquals(3, list.size());
		assertEquals("estas", list.get(0));
		assertEquals("[Hola, que tal, estas", list.toString());
		//caso2: se añade null al final de la lista con elementos
		//caso3: se añade el objeto en cuestion al final de la lista vacia
		//caso4: se añade null al final de la lista vacia
		//caso5: se intenta añadir el mismo objeto una segunda vez
		
	}

	@Test
	public void testRemoveObject() {
		//caso1: se elimina un objeto de una lista con elementos
		//caso2: se elimina un objeto repetido
		//caso3: se elimina un objeto de una lista con un elemento
		//caso4: se elimina un objeto que no existe en la lista
		//caso5: se elimina un elemento de una lista vacia
		//caso6: se elimina el primer objeto de la lista
		//caso7: se elimina un objeto situado en una posicion intermedia
		//caso8: se elimina el ultimo objeto de la lista
		//caso9: se elimina null y existe
		//caso10: se elimina null y no existe
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
	List list = new LinkedList();
	//caso1: devuelve objeto en la primera posicion en una lista con varios elementos
	//caso2: devuelve objeto en la ultima posicion en una lista con varios elementos
	//caso3: devuelve objeto en posicion intermedia en una lista con varios elementos
	//caso4: intenta devolver objeto en posicion negativa 
	try {
		list.get(-1);
		fail();
	}
	catch(IndexOutOfBoundsException e) {
		assertEquals("Esperaba excepcion IndexOutOfBounds", e.getMessage());
	}
	//caso5: intenta devolver objeto en posicion superior al numero de elementos
	//caso6: intenta devolver objeto en lista vacia
	//caso7: devuelve elemento null
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddIntObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}
	
	public abstract List createList();
}