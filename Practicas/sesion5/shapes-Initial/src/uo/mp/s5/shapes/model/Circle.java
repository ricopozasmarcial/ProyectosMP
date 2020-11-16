/**
 * 
 */
package uo.mp.s5.shapes.model;

import java.awt.Color;
import java.io.PrintStream;

/**
 * @author UO263907
 *
 */
public class Circle extends Shape {
	
	//atributos
	private int[] centre;
	private int radius;
	/**
	 * constructor
	 */
	public Circle(int[] centre, int radius, Color color) {
		super(color);
		setCentre(centre);
		setRadius(radius);
		
	}

	private void setCentre(int[] centre) {
		this.centre = centre;
	}

	private void setRadius(int radius) {
		this.radius = radius;
	}

	public int[] getCentre() {
		return centre;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public void draw(PrintStream out) {
		out.println("centro del circle : (" + getCentre()[0] + ", " + getCentre()[1] + ") radio de la circunferencia : " + getRadius());
		
	}
}
