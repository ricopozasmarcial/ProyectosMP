/**
 * 
 */
package helloworld;

/**
 * @author UO263907
 *
 */
public class helloworld {
	private int number;
	

	/**
	 * @param number the number to set
	 */
	private void setNumber(int number) {
		this.number = number;
	}


	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hola mundo ");
		System.out.println("hola" + args[0] + args[1]);
		System.out.println("adios");

	}

}
