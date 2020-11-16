/**
 * 
 */
package uo.mp.s6.greenHouse.model;

import java.io.PrintStream;

/**
 * @author UO263907
 *
 */
public class AutomaticDoors extends Door implements ElectronicDevice{
	
	public boolean open(PrintStream out){
		if (!isOpened()) {
			showOpenedMessage(out);
			setOpened(true);
			return true;
		}
		return false;
	}
	
	private void showOpenedMessage(PrintStream out) {
		out.println ("  La puerta AUTOMATICA se abre ");
		
	}

	
	private void showClosedMessage(PrintStream out) {
		out.println ("  La puerta AUTOMATICA se cierra ");
		
	}
	
	public boolean close(PrintStream out){
		if (isOpened()) {
			showClosedMessage(out);
			setOpened(false);
			return true;
		}
		return false;
	}
	
	@Override
	public void check(PrintStream out) {
		out.println("Comprobando puerta automatica");
	}
}
