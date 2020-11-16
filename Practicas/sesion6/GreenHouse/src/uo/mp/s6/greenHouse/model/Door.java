package uo.mp.s6.greenHouse.model;

import java.io.PrintStream;

/**
 * <p>Title: Door</p>
 * <p>Description: Clase que simula una puerta</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Escuela de Ingenier�a Inform�tica</p>
 * <p>Metodolog�a de la Programaci�n</p>
 * 
 * @author Profesores de Metodolog�a de la Programaci�n
 * @version 1.0
 */
public class Door {

	private boolean opened;
	
	public Door() {
		setOpened(false);
	}

	public boolean isOpened() {
		return opened;
	}
	
	public boolean open(PrintStream out){
		if (!isOpened()) {
			showOpenedMessage(out);
			setOpened(true);
			return true;
		}
		return false;
	}
	
	private void showOpenedMessage(PrintStream out) {
		out.println ("  La puerta se abre ");
		
	}

	
	private void showClosedMessage(PrintStream out) {
		out.println ("  La puerta se cierra ");
		
	}
	
	public boolean close(PrintStream out){
		if (isOpened()) {
			showClosedMessage(out);
			setOpened(false);
			return true;
		}
		return false;
	}

	protected void setOpened(boolean opened) {
		this.opened = opened;
	}
}
