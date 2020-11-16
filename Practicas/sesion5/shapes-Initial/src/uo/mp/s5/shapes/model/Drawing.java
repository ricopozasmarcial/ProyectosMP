package uo.mp.s5.shapes.model;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * <p>Title: Dibujo</p>
 * <p>Description: Clase que contiene las figuras que serán dibujadas.</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Escuela de Ingeniería Informática</p>
 * <p>Metodología de la Programación</p>
 * 
 * @author Profesores de Metodología de la programación
 * @version 1.0
 */
public class Drawing {

	private ArrayList<Drawable> drawables;
	
	public Drawing(){
		drawables = new ArrayList<Drawable>();		
	}	
	

	public void add(Drawable drawable) {
		drawables.add(drawable);
	}

	/**
	 * Muestra por consola los rectángulos como coordenadas de una esquina y la longitud de los lados
	 */
	public void draw(PrintStream out) {
		for(Drawable drawable: drawables) {
			drawable.draw(out);
		}
	}
}
