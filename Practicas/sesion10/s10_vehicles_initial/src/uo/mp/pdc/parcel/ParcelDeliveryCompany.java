package uo.mp.pdc.parcel;

import java.util.List;

import uo.mp.pdc.fleet.Fleet;
import uo.mp.pdc.vehicle.Vehicle;
import uo.mp.util.file.FileUtil;
import uo.mp.util.file.ZipFileUtil;

public class ParcelDeliveryCompany {
	private Fleet fleet = new Fleet();

	/**
	 * @return the vehicles sorted by brand
	 */
	public List<Vehicle> getVehiclesByBrand() {
		return fleet.getVehiclesByBrand();
	}

	/**
	 * @return the vehicles sorted by year
	 */
	public List<Vehicle> getVehiclesByYear() {
		return fleet.getVehiclesByYear();
	}

	/**
	 * Load the vehicles contained in the specified file name
	 * @param inFileName
	 */
	public void loadFile(String inFileName) {
		List<String> lines = new FileUtil().loadFile( inFileName );
		List<Vehicle> vehicles = new VehicleParser().parse( lines );
		fleet.add( vehicles );
	}

	/**
	 * Load the vehicles contained in the specified compressed file name
	 * @param inFileName
	 */
	public void loadZipFile(String inZippedFileName) {
		List<String> lines = new ZipFileUtil().loadFile( inZippedFileName );
		List<Vehicle> vehicles = new VehicleParser().parse( lines );
		fleet.add( vehicles );
	}

	/**
	 * Save all the vehicles to the specified text file
	 * @param inFileName
	 */
	public void saveToFile(String outFileName) {
		List<Vehicle> vehicles = fleet.getVehiclesByYear();
		List<String> lines = new VehicleSerializer().serialize( vehicles );
		new FileUtil().saveToFile( outFileName, lines );
	}

	/**
	 * Save all the vehicles to the specified compresses (.gz) file
	 * @param inFileName
	 */
	public void saveToZipFile(String outZippedFileName) {
		List<Vehicle> vehicles = fleet.getVehiclesByYear();
		List<String> lines = new VehicleSerializer().serialize( vehicles );
		new ZipFileUtil().saveToFile( outZippedFileName, lines );
	}

	/**
	 * Computes the road taxes to be paid for the company
	 * @return the total amount to be paid as taxes by the company
	 */
	public double getTotalRoadTax() {
		double total = 0.0;
		List<Vehicle> vehicles = fleet.getVehicles();
		for(int i = 0; i < vehicles.size(); i++) {
			Vehicle v = vehicles.get(i); 
			total += v.getRoadTax();
		}
		return total;
	}

	public List<Vehicle> getVehicles() {
		return fleet.getVehicles();
	}

	/**
	 * Removes the vehicle specified by its plate number.
	 * Special case if the plate number does not exist
	 * @param plate
	 */
	public void removeVehicle(String plate) {
		fleet.remove( plate );
	}

	/**
	 * Adds the vehicle to the fleet
	 * @param v
	 */
	public void addVehicle(Vehicle v) {
		fleet.add( v );
	}

}
