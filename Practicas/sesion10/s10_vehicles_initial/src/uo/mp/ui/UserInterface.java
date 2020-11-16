package uo.mp.ui;

import java.util.List;

import uo.mp.pdc.parcel.ParcelDeliveryCompany;
import uo.mp.pdc.vehicle.Vehicle;
import uo.mp.util.Console;

/**
 * Solves the interaction of the user with the program.
 * 		- Shows the menu
 * 		- Process the option chosen by the user
 * 			- asking the user the extra option-related info needed 
 * 				to complete the option
 * 			- shows the result of the execution if pertinent, or
 * 				the error message produced if any
 */
public class UserInterface {
	private static final int EXIT = 0;

	private Menu menu = new Menu();
	private ParcelDeliveryCompany company = new ParcelDeliveryCompany();
	
	public void show() {
		int option = EXIT;
		do {
			menu.show();
			option = menu.readOption();
			processOption(option);
		} while (option != EXIT);
	}

	private void processOption(int option) {
		switch( option ) {
			case EXIT: return;
			case 1: loadFile(); break;
			case 2: addVehicle(); break;
			case 3: removeVehicle(); break;
			case 4: saveToFile(); break;
			case 5: importFromZip(); break;
			case 6: exportToZip(); break;
			case 7: showVehiclesByBrand(); break;
			case 8: showVehiclesByAge(); break;
			case 9: computeTotalFleetTaxes(); break;
		}
	}

	private void computeTotalFleetTaxes() {
		Console.printf("Total amount of taxes: %.2f\n", company.getTotalRoadTax());
	}

	private void showVehiclesByAge() {
		List<Vehicle> sorted = company.getVehiclesByYear();
		listVehicles( sorted );
	}

	private void showVehiclesByBrand() {
		List<Vehicle> sorted = company.getVehiclesByBrand();
		listVehicles( sorted );
	}

	private void exportToZip() {
		String fileName = Console.readString("output file name?");
		company.saveToZipFile( fileName );
	}

	private void importFromZip() {
		String fileName = Console.readString("input zip file name?");
		company.loadZipFile( fileName );
	}

	private void saveToFile() {
		String fileName = Console.readString("output file name?");
		company.saveToFile( fileName );
	}

	private void removeVehicle() {
		String plate = Console.readString("plate number?");
		company.removeVehicle( plate );
	}

	private void addVehicle() {
		Vehicle v = new VehicleForm().askForVehicle();
		company.addVehicle( v );
	}

	private void loadFile() {
		String fileName = Console.readString("File name?");
		company.loadFile( fileName );
	}

	private void listVehicles(List<Vehicle> vehicles) {
		Console.println("\nList of vehicles");
		Console.println("------------------");
		for (Vehicle v: vehicles) {
			System.out.println( v );
		}
	}

}
