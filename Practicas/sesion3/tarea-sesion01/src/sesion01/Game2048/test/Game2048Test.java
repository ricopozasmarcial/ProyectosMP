package sesion01.Game2048.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sesion01.model.Game2048;

public class Game2048Test {
	@Before
	public void setUp() {
	}
	
	/**
	 * test del constructor con parametros
	 */
	@Test
	public void testGame2048IntInt() {
		//caso1: se crea un tablero de dimensiones correctas y vacio
		Game2048 g1 = new Game2048(3,3);
		assertEquals(3, g1.getTablero().length);
		assertFalse(g1.isBoardFull());
		
		//caso2: el tablero se crea con dimensiones no cuadradas
		try {
			g1 = new Game2048(4,3);
			fail();
		}
		catch(RuntimeException rte) {
			assertEquals("parametros invalidos",rte.getMessage());
		}
		
		//caso2: el tablero se crea con dimensiones negativas
		try {
			g1 = new Game2048(-4,3);
			fail();
		}
		catch(RuntimeException rte) {
			assertEquals("parametros invalidos",rte.getMessage());
		}
		
		
	}
	
	/**
	 * test del metodo restart
	 */
	@Test
	public void testRestart() {
		//se crea un tablero vacio y se llama al metodo
		Game2048 g1 = new Game2048(3,3);
		g1.restart();
		int ceros = 0;
		int dos = 0;
		for(int i=0;i<g1.getTablero().length;i++) {       // el bucle recorre la matriz en busca de 8 0s y un 2
			for(int j=0;j<g1.getTablero()[i].length;j++) {
				if(g1.getTablero()[i][j]==0)
					ceros++;
				else
					dos++;
			}
		}
		assertEquals(8,ceros);
		assertEquals(1,dos);
	}
	
	/**
	 * test del metodo isBoardFull
	 */
	@Test
	public void testIsBoardFull() {
		//caso1: probamos en un tablero vacio
		Game2048 g1 = new Game2048(3,3);
		assertFalse(g1.isBoardFull());
		
		//caso2: probamos en un tablero lleno
		g1 = new Game2048(3,3);
		for(int i=0;i<g1.getTablero().length;i++) {       // el bucle recorre la matriz y la rellena de 1s
			for(int j=0;j<g1.getTablero()[i].length;j++) {
				g1.getTablero()[i][j]=1;
			}
		}
		assertTrue(g1.isBoardFull());
		
		//caso3: probamos con un tablero parcialmente lleno
		g1 = new Game2048(3,3);
		g1.restart();
		assertFalse(g1.isBoardFull());
	}
	
	/**
	 * test del metodo moveRight
	 */
	@Test
	public void testMoveRight() {
		//creamos un tablero con un dos en la posicion y movemos a la derecha
		Game2048 g1 = new Game2048(3,3);
		g1.getTablero()[0][0]=2;
		g1.moveRight();
		assertEquals(2,g1.getTablero()[0][2]);
		
		//movemos de nuevo a la derecha(no tendria que cambiar de posicion)
		g1.moveRight();
		assertEquals(2,g1.getTablero()[0][2]);
	}
	
	/**
	 * test del metodo moveLeft
	 */
	@Test
	public void testMoveLeft() {
		//movemos a la derecha y luego a la izquierda, su posicion tendria que ser la original
		Game2048 g1 = new Game2048(3,3);
		g1.getTablero()[0][0]=2;
		g1.moveRight();
		g1.moveLeft();
		assertEquals(2,g1.getTablero()[0][0]);
		//movemos de nuevo a la izquierda,
		g1.moveLeft();
		assertEquals(2,g1.getTablero()[0][0]);
		
		
	}
	/**
	 * test del metodo moveUp
	 */
	@Test
	public void testMoveUp() {
		//creamos un tablero con un numero en la ultima fila y lo movemos
		Game2048 g1 = new Game2048(3,3);
		g1.getTablero()[2][0]=2;
		g1.moveUp();
		assertEquals(2,g1.getTablero()[0][0]);
		
		//movemos otra vez arriba
		g1.moveUp();
		assertEquals(2,g1.getTablero()[0][0]);
		
	}
	
	/**
	 * test del metodo moveDown
	 */
	@Test
	public void testMoveDown() {
		//creamos un tablero con un numero en la primera fila y lo movemos 
		Game2048 g1 = new Game2048(3,3);
		g1.getTablero()[0][0]=2;
		g1.moveDown();
		assertEquals(2,g1.getTablero()[2][0]);
		
		//lo movemos de nuevo
		g1.moveDown();
		assertEquals(2,g1.getTablero()[2][0]);
		
	}

}
