/**
 * 
 */
package sesion1.plane.ui;

import sesion1.plane.model.Plane;
import sesion1.plane.model.Person;

/**
 * @author UO263907
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Application().run();
	}

	public void run()
	{
		Person pilot = new Person("pepe",18);
		Plane plane1 = new Plane(pilot,'x',200);
		System.out.println("volando avion"+ plane1.toString());
		
		plane1.fly();
		plane1.fly();
		
		System.out.println("avion despues del vuelo"+ plane1.toString());
		
	}
}
