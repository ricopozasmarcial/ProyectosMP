/**
 * 
 */
package uo.mp.sort;

import java.util.Comparator;

import uo.mp.pdc.vehicle.Vehicle;

/**
 * @author UO263907
 *
 */
public class YearComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		return o1.getYears()- o2.getYears();
	}

}
