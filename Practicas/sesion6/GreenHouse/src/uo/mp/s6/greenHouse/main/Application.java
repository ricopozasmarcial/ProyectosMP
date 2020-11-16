package uo.mp.s6.greenHouse.main;

import uo.mp.s6.greenHouse.model.Door;
import uo.mp.s6.greenHouse.model.Electrician;
import uo.mp.s6.greenHouse.model.Greenhouse;
import uo.mp.s6.greenHouse.model.Sensor;
import uo.mp.s6.greenHouse.model.AutomaticDoors;

/**
 * <p>Title: Application</p>
 * <p>Description: Clase que ejecuta el programa</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Escuela de Ingenier�a Inform�tica</p>
 * <p>Metodolog�a de la Programaci�n</p>
 * 
 * @author Profesores de Metodolog�a de la Programaci�n
 * @version 1.0
 */
public class Application {
	
	/**
	 * M�todo principal que lanza la aplicaci�n
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Application().run();
	}

	/**
	 * M�todo que ejecuta la aplicaci�n
	 */
	public void run() {
		Greenhouse greenhouse = new Greenhouse();

		for(int i=0; i<10; i++) {
			greenhouse.add(new Sensor());
			greenhouse.add(new Door());
			greenhouse.add(new AutomaticDoors());
		}

		greenhouse.operatorLooksThru(System.out);
		greenhouse.operatorLooksThru(System.out);
		greenhouse.operatorLooksThru(System.out);
		Electrician electrician = new Electrician();
		electrician.check(greenhouse.getElectronicDevice(),System.out);
	}
}
