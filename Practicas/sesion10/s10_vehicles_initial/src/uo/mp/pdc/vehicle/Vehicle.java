package uo.mp.pdc.vehicle;

public abstract class Vehicle {
	private String plate;
	private int cc;
	private int horsePower;
	private int years;
	private String brand;

	public Vehicle(String plate, int cc, int horsePower, int years, String brand) {
		checkValidString( plate );
		checkValidString( brand );
		checkPositive( cc );
		checkPositive( horsePower );
		checkPositive( years );
		
		this.plate = plate;
		this.cc = cc;
		this.horsePower = horsePower;
		this.years = years;
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plate == null) ? 0 : plate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (plate == null) {
			if (other.plate != null)
				return false;
		} else if (!plate.equals(other.plate))
			return false;
		return true;
	}

	public String getPlate() {
		return plate;
	}

	public int getCc() {
		return cc;
	}

	public int getHorsepower() {
		return horsePower;
	}

	public int getYears() {
		return years;
	}

	public String getBrand() {
		return brand;
	}

	/**
	 * Computes the tax to be paid for this vehicle due to the Road Tax
	 * @return
	 */
	public abstract double getRoadTax();

	/**
	 * Returns a line of text formatted according to the file format for a vehicle
	 * @return
	 */
	public abstract String serialize();

	private void checkValidString(String string) {
		if (string != null && ! string.isEmpty()) return;
		throw new IllegalArgumentException("Not a valid string");
	}

	private void checkPositive(int integer) {
		if (integer >= 0 ) return;
		throw new IllegalArgumentException("Not a valid integer value");
	}
}
