package uo.mp.s5.shapes.model;

import java.awt.Color;
import java.io.PrintStream;

/**
 * <p>
 * Title: Rect�ngulo
 * </p>
 * <p>
 * Description: Clase que modela un rect�ngulo
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018/p>
 * <p>
 * Escuela de Ingenier�a Inform�tica
 * </p>
 * <p>
 * Metodolog�a de la Programaci�n
 * </p>
 * 
 * @author Profesores de Metodolog�a de la programaci�n
 * @version 1.0
 */

public class Rectangle extends Shape {

	public static final int MIN_POS = 0; // m�nima posici�n para el eje de coordenadas
	public static final int MAX_POS = 100; // m�xima posici�n

	private int posX;
	private int posY; // Coordenadas de la esquina superior izquierda
	private int width;
	private int height;
	/**
	 * Constructor que recibe todos los datos
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param color
	 */

	public Rectangle(int x, int y, int width, int height, Color color) {
		super(color);
		setPosX(x);
		setPosY(y);
		setWidth(width);
		setHeight(height);
		
	}

	/**
	 * 
	 * @return valor del atributo PosX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * Modifica el valor del atributo posX con el nuevo recibido como par�metro
	 * 
	 * @param posX
	 */
	private void setPosX(int posX) {
		checkPosition(posX);

		this.posX = posX;
	}

	private void checkPosition(int pos) {
		if (pos < MIN_POS || pos > MAX_POS)
			throw new IllegalArgumentException("Posici�n X fuera de los l�mites");
	}

	public int getPosY() {
		return posY;
	}

	/**
	 * Modifica el valor del atributo posY con el nuevo recibido como par�metro
	 * 
	 * @param posY
	 */
	private void setPosY(int posY) {
		checkPosition(posY);
		this.posY = posY;
	}

	/**
	 * 
	 * @return valor del atributo width, de tipo int
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Modifica el valor del atributo width con el nuevo recibido como par�metro
	 * 
	 * @param width
	 */
	private void setWidth(int width) {
		if (width <= 0)
			throw new IllegalArgumentException("Valor ancho fuera de limites");
		this.width = width;
	}

	/**
	 * 
	 * @return valor del atributo height, de tipo int
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Modifica el valor del atributo height con el nuevo recibido como par�metro
	 * 
	 * @param height
	 */
	private void setHeight(int height) {
		if (height <= 0)
			throw new IllegalArgumentException("Valor alto fuera de limites");
		this.height = height;
	}

	@Override
	public void draw(PrintStream out) {
		out.print("Dibujando el rect�ngulo: ");
		out.print("(" + getPosX() + ", " + getPosY() + ")");
		out.print(" - Anchura: " + getWidth());
		out.println(" - Altura: " + getHeight());			
		
	}
}
