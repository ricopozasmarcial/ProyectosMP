package uo.mp.util.file;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import uo.mp.util.NotYetImplementedException;

/**
 * A utility class to read/write text lines from/to a text file
 */
public class FileUtil {

	/**
	 * metodo que lee el fichero y convierte sus lineas en una lista de Strings
	 * @param inFileName, el archivo entrante
	 * @return la lista de Strings
	 * @throws FileNotFoundException 
	 */
	public List<String> loadFile(String inFileName) throws FileNotFoundException { 
		List<String> res = new LinkedList<>();
		//crear un flujo de lectura
		BufferedReader in = new BufferedReader(new FileReader(inFileName)); //monto cadena de lectura
		try {
			try {
				while(in.ready()) { //bucle que lee el fichero mientras este tenga lineas para leer
					String line = in.readLine(); //leo la linea
					res.add(line); //añado la linea a la lista
				}
			}
			finally {
				in.close(); //cierro fichero
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		return res;
	}

	/**
	 * metodo que convierte las lineas de texto y las escribe en un fichero
	 * @param outFileName, el nombre del fichero saliente
	 * @param lines, el nombre de la lista de lineas a escribir
	 */
	public void saveToFile(String outFileName, List<String> lines) {
		// 1 pasar de listaVehiculos a lista de lineas
		// 2 pasar de listaLineas a fichero
		throw new NotYetImplementedException();
	}
	

}
