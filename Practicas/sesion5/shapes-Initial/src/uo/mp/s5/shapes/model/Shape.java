package uo.mp.s5.shapes.model;

import java.awt.Color;
import java.io.PrintStream;

public abstract class Shape implements Drawable {

	private Color color;

	public Shape() {
		super();
	}
	
	public Shape(Color color) {
		setColor(color);
	}

	protected void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	/**
	 * dibuja una figura
	 */
	public abstract void draw(PrintStream out);

}