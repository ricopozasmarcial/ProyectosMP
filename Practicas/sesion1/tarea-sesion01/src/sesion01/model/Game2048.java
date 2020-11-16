package sesion01.model;

/**
 * <p>
 * T�tulo: Clase Game2048
 * </p>
 * <p>
 * Descripci�n: A partir de un array bidimensional de n�meros y a trav�s de
 * diferentes operaciones se simula un juego llamado "2048"
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018
 * </p>
 * <p>
 * Empresa: Escuela de Ingenier�a Inform�tica - Uiversidad de Oviedo
 * </p>
 * 
 * @author Profesores-MP
 * @version 1.0
 */
public class Game2048 {

	

//	
//	 * Constructor sin par�metros para crear un tablero de 3x3, inicialmente todas las posiciones de la matriz
//	 * valen 0
	 
	// HACER
//	
//	 * Constructor sin par�metros para crear un tablero con las dimensiones especificadas por los par�metros,
//	 */
	
	// HACER
	

	
//	 * A�ade un nuevo n�mero 2 y pinta el tablero

	public void next() {
		
		//COMPLETAR
	}

	
//	 * Permite restablecer el tablero. Vac�a el tablero colocando en todas las
//	 * celdas (posiciones) un cero y llama al m�todo next.
//	
	public void restart() {
		//COMPLETAR
	}
	
//	
//	 * Comprueba si el tablero est� lleno. Esto ocurre cuando todas las
//	 * celdas o posiciones del tablero tienen un n�mero distinto de cero
//		 
	public boolean isBoardFull() {
		//COMPLETAR
	}

//	
//	 * Desplaza todos los n�meros a la derecha teniendo en cuenta que:
//	 * - Mientras las celdas est�n libres, se continua hasta el final de la fila
//	 * - Si una celda est� ocupada:
//	 *     1. Si el valor de la celda es igual al de la celda en desplazamiento, 
//	 *        se suman y se continua con el mismo algoritmo.
//	 *     2. Si el valor es distinto, se detiene el desplazamiento.
//	 *  
//	 * Para desplazar todos los n�meros ser�n necesarios tres bucles. En Pseudo-c�digo ser�a:
//	 *        Recorrer columnas, desde tama�o-1 hasta 1
//     *           Recorrer coordenada X, desde 1 hasta tama�o
//     *                 Recorrer coordenada Y, desde columna hasta tama�o-1
//	 
	public void moveRight() {
		//COMPLETAR
	}
	
//	
//	 * Desplaza todos los n�meros a la izquierda teniendo en cuenta que este desplazamiento es una combinaci�n de:
//	 * rotar, rotar, mover a la derecha, rotar, rotar
//	 
	public void moveLeft() {
		//COMPLETAR	
	}
	
	
//	 * Desplaza todos los n�meros hacia arriba 
//		
	public void moveUp() {
		//COMPLETAR	
	}
	
//	 * Desplaza todos los n�meros hacia abajo 
//	 
//	 
	public void moveDown() {
		//COMPLETAR	
	}
	
	
//	 * Permite representar el tablero de n�meros en la interfaz
//	 
	private void paint() {
		//COMPLETAR
	}
	
//	
//	 * Rota el tablero a la izquierda (contrario a las agujas del reloj)
//	 
	private void rotateBoard(){
		//COMPLETAR
	}
	
//	
//	 * Coloca un 2 en una posici�n aleatoria del tablero. La posici�n debe estar vac�a.
//	 * Para que esta operaci�n se pueda realizar, el tablero no debe estar lleno
//	 
	private void newNumber() {
		//COMPLETAR
	}

}
