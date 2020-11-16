package uo.mp.s3.dome.model;

import java.io.PrintStream;

public class Item {

	private String title;
	private int playingTime;
	private boolean gotIt;
	private String comment;

	public Item() {
		super();
	}
	
	public Item(String theTitle, int time) {
		setPlayingTime(time);
		setOwn(false);
		setComment("OK");
		setTitle(theTitle);
	}
	/**
	 * Asigna el título al CD
	 * @param title, de tipo String
	 */
	protected void setTitle(String title) {
		if (title != null)
			this.title = title;
	}

	/**
	 * Asigna la duración al atributo playingTime
	 * @param playingTime, de tipo int
	 */
	protected void setPlayingTime(int playingTime) {
		if (playingTime > 0)
			this.playingTime = playingTime;
	}

	/**
	 * Asigna true o false para indicar si este CD se posee o no
	 * @param ownIt, de tipo boolean
	 */
	protected void setOwn(boolean ownIt) {
		gotIt = ownIt;
	}

	/**
	 * Asigna un comentario 
	 * @param comment, de tipo String
	 */
	protected void setComment(String comment) {
		if (comment != null)
			this.comment = comment;
	}

	/**
	 * Devuelve el valor del atributo Comment
	 * @return comentario asignado
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Devuelve el valor del atributo gotIt, que indica si se posee o no
	 * @return true si se posee
	 */
	public boolean getOwn() {
		return gotIt;
	}

	/**
	 * Devuelve el valor del atributo Title
	 * @return Título, de tipo String
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Duración en minutos
	 * @return número entero con la duración en minutos
	 */
	public int getPlayingTime() {
		return this.playingTime;
	}
	
	/**
	 * metodo print vacio
	 */
	public void print(PrintStream out) {
		out.print( getTitle() + " (" + getPlayingTime() + " mins)");
		if (getOwn()) {
			out.println("*");
		} else {
			out.println();
		}
		out.println(" " + getComment());
	}
}