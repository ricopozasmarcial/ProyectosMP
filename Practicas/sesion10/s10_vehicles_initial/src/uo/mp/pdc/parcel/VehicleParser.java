package uo.mp.pdc.parcel;


import java.util.ArrayList;
import java.util.List;

import com.sun.media.sound.InvalidFormatException;

import uo.mp.pdc.vehicle.Car;
import uo.mp.pdc.vehicle.Motorbike;
import uo.mp.pdc.vehicle.Truck;
import uo.mp.pdc.vehicle.Vehicle;
import uo.mp.util.NotYetImplementedException;
import uo.mp.util.log.AppLog;

public class VehicleParser {

	/**
	 * Returns a list of Vehicles out of a list of string
	 * Each line in the list represents a vehicle
	 * Wrong lines are ignored and do not produce new vehicles
	 * @param lines
	 * @return
	 */
	public List<Vehicle> parse(List<String> lines) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		for(int i= 0; i< lines.size(); i++) {
			if(lines.get(i).trim().length()==0 || lines.get(i).equals(null)) {
				AppLog.logger.log("La linea "+i+" esta en blanco" );
				continue;
			}
			Vehicle vehicle = null;
			try {
				vehicle = crearVehiculo(lines.get(i));
				vehicles.add(vehicle);
			}
			catch(InvalidFormatException e) {
				AppLog.logger.log("Error en linea" + (i+1)+ e.getMessage());
			}		
		}
		return vehicles;
	}
	/**
	 * metodo auxiliar crearVehiculo que crea un vehiculo a partir de una linea
	 * @param line
	 * @return
	 * @throws InvalidFormatException 
	 */
	private Vehicle crearVehiculo(String line) throws InvalidFormatException {
		Vehicle vehicle = null;
		String[] lineas = line.split("\t");
		if(lineas.length!= 6 && lineas.length!= 8) {
			throw new InvalidFormatException("numero de datos incorrecto");
		}
		int cc;
		int hp;
		int years;
		try {
			cc = Integer.parseInt(lineas[2]);
			hp = Integer.parseInt(lineas[3]);
			years = Integer.parseInt(lineas[4]);
		} catch (NumberFormatException e) {
			throw new InvalidFormatException("Error en el formato del número");
		}
		if(lineas[0].equals("car")) {
			vehicle = new Car(lineas[1], cc, hp, years, lineas[5]);
		}
		else if (lineas[0].equals("motorbike")) {
			vehicle= new Motorbike(lineas[1], cc, hp, years, lineas[5]);
		}
		else if (lineas[0].equals("truck")){
			int na = Integer.parseInt(lineas[6]);
			int tare = Integer.parseInt(lineas[7]);
			vehicle = new Truck(lineas[1], cc, hp, years, lineas[5], na, tare);
		}
		return vehicle;
	}
	
	
}
