package uo.mp.pdc.parcel;


import java.util.LinkedList;
import java.util.List;

import uo.mp.pdc.vehicle.Vehicle;

public class VehicleSerializer {

	/**
	 * Returns a list of String out of a list of Vehicle
	 * @param vehicles
	 * @return
	 */
	public List<String> serialize(List<Vehicle> vehicles) {
		List<String> res = new LinkedList<>();
		for(Vehicle v: vehicles) {
			res.add( serialize( v )  );
		}
		return res;
	}

	private String serialize(Vehicle v) {
		return v.serialize();
	}

}
