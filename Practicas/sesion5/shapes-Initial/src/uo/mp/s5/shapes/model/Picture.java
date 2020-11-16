/**
 * 
 */
package uo.mp.s5.shapes.model;

import java.io.PrintStream;

/**
 * @author UO263907
 *
 */
public class Picture implements Drawable {
	private int posX;
	private int posY;
	private String fileName;
	private int width;
	private int height;
	
	/**
	 * constructor
	 */
	public Picture(int posX, int posY, String filename, int width, int height) {
		setPosX(posX);
		setPosY(posY);
		setFileName(filename);
		setWidth(width);
		setHeight(height);
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public String getFileName() {
		return fileName;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	private void setPosX(int posX) {
		this.posX = posX;
	}

	private void setPosY(int posY) {
		this.posY = posY;
	}

	private void setFileName(String fileName) {
		this.fileName = fileName;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	private void setHeight(int height) {
		this.height = height;
	}
	
	public void draw(PrintStream out) {
		out.println("imagen: " + getFileName());
	}
}
