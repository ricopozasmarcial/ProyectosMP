package uo.mp.s5.shapes.model;

import java.awt.Color;
import java.io.PrintStream;

/**
 * <p>
 * Title: Rectángulo
 * </p>
 * <p>
 * Description: Clase que modela un rectángulo
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018/p>
 * <p>
 * Escuela de Ingeniería Informática
 * </p>
 * <p>
 * Metodología de la Programación
 * </p>
 * 
 * @author Profesores de Metodología de la programación
 * @version 1.0
 */

public class Rectangle extends Shape {

	public static final int MIN_POS = 0; // mínima posición para el eje de coordenadas
	public static final int MAX_POS = 100; // máxima posición

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
	 * Modifica el valor del atributo posX con el nuevo recibido como parámetro
	 * 
	 * @param posX
	 */
	private void setPosX(int posX) {
		checkPosition(posX);

		this.posX = posX;
	}

	private void checkPosition(int pos) {
		if (pos < MIN_POS || pos > MAX_POS)
			throw new IllegalArgumentException("Posición X fuera de los límites");
	}

	public int getPosY() {
		return posY;
	}

	/**
	 * Modifica el valor del atributo posY con el nuevo recibido como parámetro
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
	 * Modifica el valor del atributo width con el nuevo recibido como parámetro
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
	 * Modifica el valor del atributo height con el nuevo recibido como parámetro
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
		out.print("Dibujando el rectángulo: ");
		out.print("(" + getPosX() + ", " + getPosY() + ")");
		out.print(" - Anchura: " + getWidth());
		out.println(" - Altura: " + getHeight());			
		
	}
}
