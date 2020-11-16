package uo.mp.pdc.fleet;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.runner.manipulation.Sorter;



import uo.mp.pdc.parcel.ApplicationException;
import uo.mp.pdc.vehicle.Vehicle;
import uo.mp.sort.BrandComparator;
import uo.mp.sort.YearComparator;


/**
 * Represent a collection of vehicles: a fleet.
 * 
 * Its responsibility is to maintain that collection
 * avoiding repeated vehicles, also is able to list them
 * sorted with different criteria.
 */
public class Fleet {
	private List<Vehicle> vehicles = new ArrayList<>();

	/**
	 * @return o list of vehicles sorted by brand
	 */
	public List<Vehicle> getVehiclesByBrand() { //PREGUNTAR EN CLASE
		Collections.sort(vehicles, new BrandComparator());
		return getVehicles();
		}
		
	/**
	 * @return o list of vehicles sorted by year
	 */
	public List<Vehicle> getVehiclesByYear() { //PREGUNTAR EN CLASE
		Collections.sort(vehicles, new YearComparator());
		return getVehicles();
	}

	/**
	 * Add all the vehicles contained in the argument list to the
	 * fleet's collection of vehicles
	 * None of the vehicles could be repeated. If any of them are
	 * repeated, none of them can be added in order to not have 
	 * inconsistencies.
	 * @param newVehicles
	 */
	public void add(List<Vehicle> newVehicles) {
		for(Vehicle v: newVehicles) {
			this.vehicles.add( v );
		}
	}

	/**
	 * Add the vehicle to the fleet.
	 * The plate number must be unique for the fleet
	 * @param v
	 * @throws ApplicationException 
	 */
	public void add(Vehicle v) throws ApplicationException {
		if (searchByPlate(v.getPlate())>=0) {
			throw new ApplicationException("El vehiculo ya existe");
		}
		vehicles.add(v);
	}


	private boolean existByPlate(String plate) {
		for(Vehicle vehicles : vehicles) {
			if(vehicles.getPlate().equals(plate)) {
				return true;
			}				
		}
		return false;
	}
	
	/**
	 * @return a copy of the private list of vehicles
	 */
	public List<Vehicle> getVehicles() {
		 List<Vehicle> vehiclesAux = new ArrayList<Vehicle>();
		 vehiclesAux = vehicles;
		 return vehiclesAux;
 
	}

	/**
	 * Remove the vehicle specified by its plate number from the fleet 
	 * @param the plate number
	 */
	public void remove(String plate) {
		int pos = searchByPlate( plate );
		vehicles.remove(pos);
	}

	private int searchByPlate(String plate) {
		for(int i = 0; i < vehicles.size(); i++) {
			Vehicle v = vehicles.get(i);
			if (v.getPlate().equals(plate) ) {
				return i;
			}
		}
		return -1;
	}

}
