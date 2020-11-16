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
public class BrandComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle arg0, Vehicle arg1) {
		if (arg0.getBrand().compareTo(arg1.getBrand())==0)
			return arg0.getYears()-arg1.getYears();
		return arg0.getBrand().compareTo(arg1.getBrand());
		
	}

}
