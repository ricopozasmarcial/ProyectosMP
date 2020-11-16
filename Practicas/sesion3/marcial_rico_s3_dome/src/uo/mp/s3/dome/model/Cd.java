package uo.mp.s3.dome.model;

import java.io.PrintStream;

public class Cd extends Item {

	private String artist;
	private int numberOfTracks;
	public Cd(String theTitle, String theArtist, int tracks, int time) {
		super(theTitle, time);
		setArtist(theArtist);
		setNumberOfTracks(tracks);
	}

	/**
	 * Asigna artista al CD
	 * @param artist, de tipo String
	 */
	private void setArtist(String artist) {
		if (artist != null)
			this.artist = artist;
	}

	/**
	 * Asigna el número de pistas al atributo numberOfTracks
	 * @param numberOfTracks, de tipo int
	 */
	private void setNumberOfTracks(int numberOfTracks) {
		if (numberOfTracks > 0)
			this.numberOfTracks = numberOfTracks;
	}

	/**
	 * Devuelve el valor del atributo artist
	 * @return artista asignado, de tipo String
	 */
	public String getArtist() {
		return this.artist;
	}
	
	/**
	 * Devuelve el valor del atributo numberOfTracks, que indica el número de pistas
	 * @return número entero con el número de pistas
	 */
	public int getNumberOfTracks() {
		return this.numberOfTracks;
	}
	
	/**
	 * Imprime en el objeto out los valores de los atributos 
	 * @param out 
	 */
	public void print(PrintStream out) {
		out.print("CD:");
		super.print(out);
		out.println(" tracks: " + getNumberOfTracks());
		out.println(" " + getArtist());
	}
}