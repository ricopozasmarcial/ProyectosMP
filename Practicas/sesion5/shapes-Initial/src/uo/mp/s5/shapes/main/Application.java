package uo.mp.s5.shapes.main;

import java.awt.Color;

import uo.mp.s5.shapes.model.Circle;
import uo.mp.s5.shapes.model.Drawing;
import uo.mp.s5.shapes.model.Picture;
import uo.mp.s5.shapes.model.Rectangle;

/**
 * <p>Title: Aplicaci�n</p>
 * <p>Description: Clase para ejecutar la aplicaci�n.</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Escuela de Ingenier�a Inform�tica</p>
 * <p>Metodolog�a de la Programaci�n</p>
 * 
 * @author  Profesores de Metodolog�a de la programaci�n
 * @version 1.0
 */
public class Application {
	
	/**
	 * M�todo principal para la ejecuci�n del programa
	 * 
	 * @param args No son usados
	 */
	public static void main(String[] args) {
		new Application().run();
	}
	
	/**
	 * Ejecuta la aplicaci�n
	 */
	public void run (){
		Drawing drawing = new Drawing();
		
		Rectangle rectantle1 = new Rectangle(1,2,3,6,Color.BLACK);
		drawing.add(rectantle1);
		
		Rectangle rectangle2 = new Rectangle(3,4,7,8,Color.BLUE);
		drawing.add(rectangle2);
		
		int[] centre = {3,7};
		Circle circle1 = new Circle(centre, 30, Color.black);
		drawing.add(circle1);
		
		Picture picture1 = new Picture(5, 5, "mi imagen.jpg", 8, 9);
		drawing.add(picture1);
		
		drawing.draw(System.out);
	}

}
