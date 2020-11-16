package uo.mp.pdc.fleet;


import java.util.ArrayList;
import java.util.List;

import uo.mp.pdc.parcel.ApplicationException;
import uo.mp.pdc.vehicle.Vehicle;
import uo.mp.util.NotYetImplementedException;


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
	public List<Vehicle> getVehiclesByBrand() {
		// sort vehicles list by brand
		return getVehicles();
	}

	/**
	 * @return o list of vehicles sorted by year
	 */
	public List<Vehicle> getVehiclesByYear() {
		// sort vehicles list by year
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
	 */
	public void add(Vehicle v) {
		if(existByPlate(v.getPlate())) {
			throw new ApplicationException("el vehiculo a añadir ya existe");
		}
		vehicles.add(v);
	}

	/**
	 * devuelve la posicion del vehiculo cuya matricula se recibe como parametro
	 * @return
	 */
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
		throw new NotYetImplementedException();
		// return a copy of the vehicles list to not break the encapsulation
		// It is handy to add a copy constructor to our lists 
//		return new ArrayList<Vehicle>( vehicles ); 
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
			if ( false /* compare the two plate numbers */ ) {
				return i;
			}
		}
		return -1;
	}

}
