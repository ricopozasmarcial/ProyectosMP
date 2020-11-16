package sesion1.SeatManager.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sesion1.plane.model.Person;
import sesion1.plane.model.SeatManager;

public class SeatManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBookSeat() {
		//caso1: reservamos un asiento a una persona en un avion vacio
		SeatManager sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
		Person p1 = new Person ("marco",18);
		Person p2 = new Person("marci", 17);
		Person p3 = new Person("marci", 70);
		assertTrue(sm.bookSeat(p1, 0, 0));
		
		//caso2: sienta a un adulto en un sitio ocupado por un adulto no jubilado
		sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
		p1 = new Person ("marco",18);
		p2 = new Person("marci", 27);
		p3 = new Person("marci", 70);
		assertTrue(sm.bookSeat(p1, 0, 0));
		assertTrue(sm.bookSeat(p2, 0, 0));
		
		//caso3: sienta a un adulto en un sitio ocupado por un menor
		sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
		p1 = new Person ("marco",18);
		p2 = new Person("marci", 17);
		p3 = new Person("marci", 70);
		assertTrue(sm.bookSeat(p2, 0, 0));
		assertFalse(sm.bookSeat(p1, 0, 0));
		
		//caso4: sienta a un adulto en un sitio ocupado por un jubilado
		sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
		p1 = new Person ("marco",18);
		p2 = new Person("marci", 17);
		p3 = new Person("marci", 70);
		assertTrue(sm.bookSeat(p3, 0, 0));
		assertFalse(sm.bookSeat(p1, 0, 0));
		
		//caso5: se intenta sentar a una persona null
		try{
			sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
			sm.bookSeat(null, 0, 0);
			fail();
		}
		catch(RuntimeException rte) {
			assertEquals("Error: parametros incorrectos", rte.getMessage());
		}
		
		//caso6: las filas son invalidas
		try{
			sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
			p1 = new Person ("marco",18);
			sm.bookSeat(p1, -8, 0);
			fail();
		}
		catch(RuntimeException rte) {
			assertEquals("Error: parametros incorrectos", rte.getMessage());
		}
		
		//caso6: las columnas son invalidas
		try{
			sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
			p1 = new Person ("marco",18);
			sm.bookSeat(p1, 0, -90);
			fail();
		}
		catch(RuntimeException rte) {
			assertEquals("Error: parametros incorrectos", rte.getMessage());
		}
	}

	@Test
	public void testFindPassengersByAge() {
		SeatManager sm = new SeatManager(SeatManager.MAX_ROWS, SeatManager.MAX_COLUMNS);
		Person p1 = new Person ("marco",18);
		Person p2 = new Person("marci", 17);
		Person p3 = new Person("marci", 70);
		Person p4 = new Person("marci", 40);
		
		//caso1: sentamos a dos personas en filas pares y a otras dos en filas impares y ejecutamos el metodo
		sm.bookSeat(p4, 0, 0);
		sm.bookSeat(p3, 1, 1);
		sm.bookSeat(p2, 3, 3);
		sm.bookSeat(p1, 4, 3);
		sm.findPassengersByAge(75, 10);
		assertEquals(p4,sm.findPassengersByAge(75,10).get(0));
		assertEquals(p1,sm.findPassengersByAge(75,10).get(1));
	}

}
