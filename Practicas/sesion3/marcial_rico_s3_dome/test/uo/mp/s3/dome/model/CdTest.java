package uo.mp.s3.dome.model;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uo.mp.s3.dome.model.Cd;

public class CdTest {
	private Cd cd;
	@Before
	public void setUp()
	{
		cd = new Cd("Come Together","Beatles",4,70);
	}

	@Test
	public void testConstructor() {
		// caso 1 parametros correctos
		cd = new Cd("Come Together","Beatles",4,70);
	
		assertEquals("Come Together", cd.getTitle());
		assertEquals("Beatles", cd.getArtist());
		assertEquals(70, cd.getPlayingTime());
		assertEquals(4, cd.getNumberOfTracks());
		assertEquals(false, cd.getOwn());
		assertEquals("OK", cd.getComment());
		
				
		// caso 2 título incorrecto, resto bien
		
		
		// caso 3 artista incorrecto, resto bien
		
		
		// caso 4 tiempo negativo, resto bien
		
		
		// caso 5 número pistas negativo, resto bien
		
	}
	
	

	@Test
	public void testSetOwn() {
		
		// caso 1 estando en false paso a true
		cd.setOwn(true);
		assertEquals(true,cd.getOwn());
		// caso 2 estando en true paso a false
		cd.setOwn(false);
		assertEquals(false,cd.getOwn());
	}

	
	@Test
	public void testSetComment() {
		
		// caso 1 introduzco un comentario correcto
		cd.setComment("Excelente");
		assertEquals("Excelente",cd.getComment());
		// caso 2 introduzco null
		cd.setComment(null);
		assertEquals("Excelente",cd.getComment());
	}

}
