package uo.mp.s3.dome.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.s3.dome.model.Dvd;

public class DvdTest {

	private Dvd dvd;
	
	@Before
	public void setUp()
	{
		dvd = new Dvd("La guerra de las Galaxias","George Lucas",125);
	}

	@Test
	public void testConstructor() {
		// caso 1 parametros correctos
		dvd = new Dvd("Star Wars","George Lucas",125);
	
		assertEquals("Star Wars", dvd.getTitle());
		assertEquals("George Lucas", dvd.getDirector());
		assertEquals(125, dvd.getPlayingTime());
		assertEquals(false, dvd.getOwn());
		assertEquals("OK", dvd.getComment());
		
		// caso 2 título incorrecto, resto bien
		
		
		// caso 3 director incorrecto, resto bien
		
		
		// caso 4 tiempo negativo, resto bien
		
		
	}
	
		
	
	@Test
	public void testSetOwn() {
	
		// caso 1 estando en false paso a true
		dvd.setOwn(true);
		assertEquals(true,dvd.getOwn());
		// caso 2 estando en true paso a false
		dvd.setOwn(false);
		assertEquals(false,dvd.getOwn());
	}
	@Test
	public void testSetComment() {
		
		// caso 1 introduzco un comentario correcto
		dvd.setComment("Excelente");
		assertEquals("Excelente",dvd.getComment());
		// caso 2 introduzco null
		dvd.setComment(null);
		assertEquals("Excelente",dvd.getComment());
	}


}
