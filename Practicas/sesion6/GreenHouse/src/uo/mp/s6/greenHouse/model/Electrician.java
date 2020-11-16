/**
 * 
 */
package uo.mp.s6.greenHouse.model;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * @author UO263907
 *
 */
public class Electrician {
	
	public void check (ArrayList<ElectronicDevice> list, PrintStream out) {
		for(ElectronicDevice device: list) {
			device.check(out);
		}
	}
}
