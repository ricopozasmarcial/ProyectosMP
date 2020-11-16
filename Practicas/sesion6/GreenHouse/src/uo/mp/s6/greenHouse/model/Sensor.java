package uo.mp.s6.greenHouse.model;

import java.io.PrintStream;
import java.util.Random;

/**
 * <p>Title: Sensor</p>
 * <p>Description: Clase que simula un sensor de temperatura</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Escuela de Ingenier�a Inform�tica</p>
 * <p>Metodolog�a de la Programaci�n</p>
 * 
 * @author Profesores de Metodolog�a de la Programaci�n
 * @version 1.0
 */
public class Sensor implements ElectronicDevice{

	/**
	 * Simula una medicci�n de temperatura
	 * 
	 * @return La temperatura medida por el sensor
	 */
	public int getTemperature() {
		// n�mero aleatorio [5-40]
		return 26;
		
	}
	
	@Override
	public void check(PrintStream out) {
		out.println("Comprobando sensor");
	}
	
}
