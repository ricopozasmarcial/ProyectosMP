package uo.mp.s6.greenHouse.model;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * <p>Title: GreenHouse</p>
 * <p>Description: Clase que simula un invernadero</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Escuela de Ingenier�a Inform�tica</p>
 * <p>Metodolog�a de la Programaci�n</p>
 * 
 * @author Profesores de Metodolog�a de la Programaci�n
 * @version 1.0
 */
public class Greenhouse {
	
	private final static byte MAX_TEMPERATURE = 22;
	private final static byte MIN_TEMPERATURE = 19;

	private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
	private ArrayList<Door> doors = new ArrayList<Door>();

	public void add(Sensor sensor) {
		sensors.add(sensor);
	}

	public void add(Door door) {
		doors.add(door);
	}

	
	
	/**
	 * Simula el trabajo de un operador que abre o cierra las puertas teniendo en cuenta la temperatura
	 * 
	 */
	public void operatorLooksThru(PrintStream out) {
		out.println("****OPERADOR****");
		checkTemperature(out);
	}
	
		
		/*
		 * Fuera hace fr�o, por lo que la apertura de las puertas siempre implica enfriar el interior.
		 * 
		 * Cuando getAverageTemperature() es mayor que MAX_TEMPERATURE) 
				�	Deber�an abrirse algunas puertas para bajar la temperatura (si es posible)
				�	Cada grado de diferencia (getAverageTemperature()-MAX_TEMPERATURE)) implica la apertura del 10% de las puertas (si es posible)
				�	Imprimir un mensaje que indique cu�ntas puertas est�n a punto de abrirse (si es posible)
				
		 * Cuando getAverageTemperature() es menor que MIN_TEMPERATURE 
				�	Deber�an cerrarse algunas puertas para aumentar la temperatura (si es posible)
				�	Cada grado de diferencia (MIN_TEMPERATURE-getAverageTemperature()) implica el cierre del 10% de las puertas (si es posible)
				�	Devolver un mensaje que indique cu�ntas puertas est�n a punto de cerrarse (si es posible)
				
		 * En caso contrario, se devolver� un mensaje  que indique simplemente la temperatura media.
		 */
	private void checkTemperature(PrintStream out){
	   double averageTemperature = getAverageTemperature();
		   if (averageTemperature > MAX_TEMPERATURE) {
			  //calcular numero de puertas a abrir
			   double difference = averageTemperature - MAX_TEMPERATURE;
			   int doorsToOpen = (int) (doors.size()* 0.1 * difference);
			   //abrir las puertas
			   int openedDoors = openDoors(doorsToOpen, out);
			   // imprimir en el out puertas a abrir y puertas que se han abierto
			   out.println("puertas a abrir: " + doorsToOpen + " puertas que se han abierto: " + openedDoors);
		    }
		   else if (averageTemperature < MIN_TEMPERATURE) {
			    	//Completar en casa
			      
		    }
		   else {
			   out.printf("La temperatura %f es correcta.\n", averageTemperature);
		   }
		   
   }

		private int openDoors(int doorsToOpen, PrintStream out) {
			int counter = 0;
			int openedDoors = 0;
			while (openedDoors < doorsToOpen && counter < doors.size()) {
				if(!doors.get(counter).isOpened()) {
					doors.get(counter).open(out);
					openedDoors ++;
				}
				counter++;
			}
			return openedDoors;
		}
	
	
	/**
	 * Calcula la temperatura media del invernadero
	 * 
	 * @return La temperatura media del invernadero
	 */
	private double getAverageTemperature() {
		double addition = 0;
		for(Sensor sensor: sensors)
			addition += sensor.getTemperature();
		return addition / sensors.size();
	}
	
	/**
	 * @return lista de dispositivos electronicos
	 */
	public ArrayList<ElectronicDevice> getElectronicDevice(){
		ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
		for(Sensor sensor : sensors) {
			devices.add(sensor);
		}
		for(Door door : doors) {
			if(door instanceof ElectronicDevice) {
				devices.add((ElectronicDevice) door);
			}
		}
		return devices;
	}
}
