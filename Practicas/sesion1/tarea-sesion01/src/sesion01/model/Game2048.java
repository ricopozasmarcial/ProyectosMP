package sesion01.model;

/**
 * <p>
 * Título: Clase Game2048
 * </p>
 * <p>
 * Descripción: A partir de un array bidimensional de números y a través de
 * diferentes operaciones se simula un juego llamado "2048"
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018
 * </p>
 * <p>
 * Empresa: Escuela de Ingeniería Informática - Uiversidad de Oviedo
 * </p>
 * 
 * @author Profesores-MP
 * @version 1.0
 */
public class Game2048 {

	

//	
//	 * Constructor sin parámetros para crear un tablero de 3x3, inicialmente todas las posiciones de la matriz
//	 * valen 0
	 
	// HACER
//	
//	 * Constructor sin parámetros para crear un tablero con las dimensiones especificadas por los parámetros,
//	 */
	
	// HACER
	

	
//	 * Añade un nuevo número 2 y pinta el tablero

	public void next() {
		
		//COMPLETAR
	}

	
//	 * Permite restablecer el tablero. Vacía el tablero colocando en todas las
//	 * celdas (posiciones) un cero y llama al método next.
//	
	public void restart() {
		//COMPLETAR
	}
	
//	
//	 * Comprueba si el tablero está lleno. Esto ocurre cuando todas las
//	 * celdas o posiciones del tablero tienen un número distinto de cero
//		 
	public boolean isBoardFull() {
		//COMPLETAR
	}

//	
//	 * Desplaza todos los números a la derecha teniendo en cuenta que:
//	 * - Mientras las celdas estén libres, se continua hasta el final de la fila
//	 * - Si una celda está ocupada:
//	 *     1. Si el valor de la celda es igual al de la celda en desplazamiento, 
//	 *        se suman y se continua con el mismo algoritmo.
//	 *     2. Si el valor es distinto, se detiene el desplazamiento.
//	 *  
//	 * Para desplazar todos los números serán necesarios tres bucles. En Pseudo-código sería:
//	 *        Recorrer columnas, desde tamaño-1 hasta 1
//     *           Recorrer coordenada X, desde 1 hasta tamaño
//     *                 Recorrer coordenada Y, desde columna hasta tamaño-1
//	 
	public void moveRight() {
		//COMPLETAR
	}
	
//	
//	 * Desplaza todos los números a la izquierda teniendo en cuenta que este desplazamiento es una combinación de:
//	 * rotar, rotar, mover a la derecha, rotar, rotar
//	 
	public void moveLeft() {
		//COMPLETAR	
	}
	
	
//	 * Desplaza todos los números hacia arriba 
//		
	public void moveUp() {
		//COMPLETAR	
	}
	
//	 * Desplaza todos los números hacia abajo 
//	 
//	 
	public void moveDown() {
		//COMPLETAR	
	}
	
	
//	 * Permite representar el tablero de números en la interfaz
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
//	 * Coloca un 2 en una posición aleatoria del tablero. La posición debe estar vacía.
//	 * Para que esta operación se pueda realizar, el tablero no debe estar lleno
//	 
	private void newNumber() {
		//COMPLETAR
	}

}
