package sesion01.model;
import java.util.*;

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
	
//   * Constantes
	public final static int Rows = 3;
	public final static int Collumns = 3;
	
//   * Atributos	
	private int[][] tablero;
	
//	 * Constructor sin parámetros para crear un tablero de 3x3, inicialmente todas las posiciones de la matriz
//	 * valen 0
	 
	public Game2048() {
		
		tablero = new int[Rows][Collumns];
		for(int i=0;i<tablero.length;i++){
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j] =0;
			}			
		}
	}
	
//	 * Constructor sin parámetros para crear un tablero con las dimensiones especificadas por los parámetros,
//	 */
	
	public Game2048(int altura, int anchura) {
	if(altura!=anchura || altura<0 ||anchura <0) {
		throw(new RuntimeException("parametros invalidos"));
	}
		tablero = new int[altura][anchura];
		for(int i=0;i<tablero.length;i++){
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j] =0;
			}
		}
	}
/**
 * metodo next, que añade un nuevo número 2 y pinta el tablero		
 */
//	 * Añade un nuevo número 2 y pinta el tablero

	public void next() {
		newNumber();
		paint();
		
	}

/**
 * metodo restart, reinicia todos los valores a 0 y llama al metodo next	
 */
//	 * Permite restablecer el tablero. Vacía el tablero colocando en todas las
//	 * celdas (posiciones) un cero y llama al método next.
//	
	public void restart() {
		for(int i=0;i<tablero.length;i++){
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j] =0;
			}
		}
		next();
	}
	
/**
 * metodo isBoardFull, indica si el tablero esta lleno o no	
 * @return true si el tablero tiene posiciones libres
 * @return false si no hay mas huecos libres
 */
//	 * Comprueba si el tablero está lleno. Esto ocurre cuando todas las
//	 * celdas o posiciones del tablero tienen un número distinto de cero
//		 
	public boolean isBoardFull() {
		int contador =0;
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				if(tablero[i][j]==0) {
					contador++;
				}
			}
		}
		if(contador>0) {
			return false;
		}
		else {
			return true;
		}
	}

	/**
	 * metodo moveLeft, se encarga de desplazar los números hacia la derecha 
	 */
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
		for(int i=0;i<tablero.length;i++) {
			moveRowToTheRight(i);
		}
	}
	
	/**
	 * metodo moveLeft, se encarga de desplazar los números hacia la izquierda 
	 */	
//	 * Desplaza todos los números a la izquierda teniendo en cuenta que este desplazamiento es una combinación de:
//	 * rotar, rotar, mover a la derecha, rotar, rotar
//	 
	public void moveLeft() {
		rotateBoard();
		rotateBoard();
		moveRight();
		rotateBoard();
		rotateBoard();
	}
	
	/**
	 * metodo moveUp, se encarga de desplazar los números hacia arriba 
	 */	
//	 * Desplaza todos los números hacia arriba 
//		
	public void moveUp() {
		rotateBoard();
		rotateBoard();
		rotateBoard();
		moveRight();
		rotateBoard();
	}

/**
 * metodo moveDown, se encarga de desplazar los números hacia abajo 
 */
//	 * Desplaza todos los números hacia abajo 
//	 
//	 
	public void moveDown() {		
		rotateBoard();
		moveRight();
		rotateBoard();
		rotateBoard();
		rotateBoard();
	}
	
/**
 * metodo paint, se encarga de representar el tablero por pantalla	
 */
//	 * Permite representar el tablero de números en la interfaz
//	 
	private void paint() {
		for(int i=0; i<tablero.length;i++) {
			for(int j=0; j<tablero[i].length;j++) {
				if(j<tablero.length-1) {
					System.out.print(tablero[i][j] + "  ");
				}
				else {
					System.out.println(tablero[i][j]);
				}
			}
		}
	}
	
/**
 * metodo rotateBoard, se encarga de rotar el tablero a la izquierda
 */
//	 * Rota el tablero a la izquierda (contrario a las agujas del reloj)
//	 
	private void rotateBoard(){
		
	        int[][] aux = new int[tablero.length][tablero.length];
	        for(int i = 0;i<tablero.length;i++)
	            for(int j = 0;j<tablero[i].length;j++)
	                aux[tablero.length-1-j][i] = tablero[i][j];
	        tablero = aux;
	    }
	
	
/**
 * metodo newNumber, que coloca un 2 en una posicion aleatoria del tablero	
 */
//	 * Coloca un 2 en una posición aleatoria del tablero. La posición debe estar vacía.
//	 * Para que esta operación se pueda realizar, el tablero no debe estar lleno
//	 
	private void newNumber() {
		Random r = new Random();
		int posicion = tablero[r.nextInt(tablero.length)][r.nextInt(tablero.length)];
		if(isBoardFull()== false) {
			while(posicion!=0) {
			posicion = tablero[r.nextInt(tablero.length)][r.nextInt(tablero.length)];
			}
			tablero[r.nextInt(tablero.length)][r.nextInt(tablero.length)]=2;
		}
	}
	
/**
 * metodo eraseSpaces del proyecto Game2048. se encarga de mover elementos a la derecha siempre y 
 * cuando haya un espacio en blanco al cual moverlos
 * @param fila, un entero que indica la fila donde se realiza la accion
 */
	private void eraseSpaces(int fila) {
		for(int i=tablero[0].length-1;i>0;i--) {
			if(tablero[fila][i]==0) {
				for(int j=i-1;j>=0;j--) {
					if(tablero[fila][j]!=0) {
						tablero[fila][i]=tablero[fila][j];
						tablero[fila][j]=0;
					}
				}
			}
		}
	}
	
/**
 * metodo addFirstCouple. suma dos posiciones de una fila determinada si 
 * estas tienen el mismo valor y almacena su valor a la derecha
 * @param fila, un entero que indica la fila donde se realiza la accion
 */
	private void addFirstCouple(int fila) {
		for(int j=tablero[0].length-1;j>0;j--) {
			if(tablero[fila][j]==tablero[fila][j-1]) {
				tablero[fila][j]+=tablero[fila][j-1];
				tablero[fila][j-1]=0;
			}
		}
	}
/**
 * metodo moveRowToTheRight, metodo que ejecta los metodos declarados anteriormente sobre una fila
 * @param fila, un entero que indica la fila donde se realiza la accion
 */
	private void moveRowToTheRight(int fila) {
		eraseSpaces(fila);
		addFirstCouple(fila);
		eraseSpaces(fila);
	}
	
	/**
	 * metodo getTablero de la clase Game2048
	 */
	public int[][] getTablero(){
		return tablero;
	}
}
