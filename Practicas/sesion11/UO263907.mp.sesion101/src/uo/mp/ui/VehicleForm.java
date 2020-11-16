package uo.mp.ui;

import uo.mp.pdc.parcel.ApplicationException;
import uo.mp.pdc.vehicle.Car;
import uo.mp.pdc.vehicle.Motorbike;
import uo.mp.pdc.vehicle.Truck;
import uo.mp.pdc.vehicle.Vehicle;
import uo.mp.util.Console;

/**
 * Asks the user for all the data needed to build a new Vehicle object
 */
public class VehicleForm {

	/**
	 * @return the vehicle built form the user provided data
	 */
	public Vehicle askForVehicle(){
		String type = Console.readString("Type of vehicle? (car | truck | moto)");
		switch( type ) {
			case "car": return askForCar();
			case "truck": return askForTruck();
			case "moto": return askForMoto();
		}
		
		return null;
 		
	}

	private Vehicle askForMoto() {
		String plate = askForPlate();
		int cc = askForCC();
		int hp = askForHp();
		int years = askForYears();
		String brand = askForBrand();

		return new Motorbike(plate, cc, hp, years, brand);
	}

	private Vehicle askForTruck() {
		String plate = askForPlate();
		int cc = askForCC();
		int hp = askForHp();
		int years = askForYears();
		String brand = askForBrand();
		int axles = askForAxles();
		int tare = askForTare();

		return new Truck(plate, cc, hp, years, brand, axles, tare);
	}

	private Vehicle askForCar() {
		String plate = askForPlate();
		int cc = askForCC();
		int hp = askForHp();
		int years = askForYears();
		String brand = askForBrand();

		return new Car(plate, cc, hp, years, brand);
	}

	private String askForBrand() {
		return askForAnString("Brand?");
	}

	private int askForYears() {
		return askForAnInteger("Age in years?");
	}

	private int askForHp() {
		return askForAnInteger("Horse power?");
	}

	private int askForCC() {
		return askForAnInteger("Cubic centimeters?");
	}

	private String askForPlate() {
		return askForAnString("Plate number?");
	}

	private int askForTare() {
		return askForAnInteger("Tare?");
	}

	private int askForAxles() {
		return askForAnInteger("Number of axles?");
	}

	private int askForAnInteger(String prompt) {
		//int aux = Integer.parseInt(prompt);
		//while(aux<0) {
			askForAnInteger(new String());
		//}
		return Console.readInteger( prompt );
	}

	private String askForAnString(String prompt) {
		//while(prompt.equals(null)||prompt.length()>20) {
			askForAnString(new String() );
		//}
		return Console.readString( prompt );
	}

}
