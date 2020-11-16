package uo.mp.s3.dome.model;

import java.io.PrintStream;

public class Dvd extends Item  {
	private String director;
	public Dvd(String theTitle, String theDirector, int time) {		
		super(theTitle, time);
		setDirector(theDirector);
	}

	/**
	 * Asigna valor al atributo director
	 * @param nombre del director, de tipo String
	 */
	public void setDirector(String director) {
		if (director != null)
			this.director = director;
	}

	/**
	 * Devuelve el valor del atributo Director
	 * @return nombre del director, de tipo String
	 */
	public String getDirector() {
		return this.director;
	}
	
	/**
	 * Imprime en el objeto out los valores de los atributos 
	 * @param out 
	 */
	public void print(PrintStream out) {
		out.print("DVD:");
		super.print(out);
		out.println(" " + getDirector());
		
	}

}
