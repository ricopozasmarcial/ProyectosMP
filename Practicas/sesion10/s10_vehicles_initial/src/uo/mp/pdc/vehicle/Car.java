package uo.mp.pdc.vehicle;

import uo.mp.util.NotYetImplementedException;

public class Car extends Vehicle {

	public Car(String plate, int cc, int horsepower, int years, String brand) {
		super(plate, cc, horsepower, years, brand);
	}

	@Override
	public double getRoadTax() {
		return 60 + getHorsepower() + 7 * getYears() + getCc() / 12;
	}

	@Override
	public String toString() {
		return "Car [getPlate()=" + getPlate() 
				+ ", getCc()=" + getCc() 
				+ ", getHorsepower()=" + getHorsepower()
				+ ", getYears()=" + getYears() 
				+ ", getBrand()=" + getBrand() 
				+ ", getRoadTax()=" + getRoadTax() 
			+ "]";
	}

	@Override
	public String serialize() {
		throw new NotYetImplementedException();
	}

}
