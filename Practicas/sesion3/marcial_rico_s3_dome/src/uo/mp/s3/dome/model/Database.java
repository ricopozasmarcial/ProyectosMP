package uo.mp.s3.dome.model;

import java.io.PrintStream;
import java.util.ArrayList;

public class Database {
	private ArrayList<Item> items;
	
	public Database() {
		items = new ArrayList<Item>();
	}
	
	/**
	 * añade un elemento a la base de datos
	 * @param elemento a añadir, de tipo item
	 */
	public void add(Item itemToAdd) {
		items.add(itemToAdd);
	}
	
	private void checkNotNull(Item item) {
		if(item == null)
			throw new IllegalArgumentException("parametro item null");
		}
	
	/**
	 * @return numero de items que tiene el propietario
	 */
	public int numberOfItemsOwned() {
		return 0; //completar
	}
	
	/**
	 * vuelca en el objeto out los datos de los atributos de todos los elementos de la BBDD
	 * @param out, objeto donde se vuelca la info.
	 */
	public void list(PrintStream out) {
		for(Item itemToList: items) {
			itemToList.print(out);
		}
	}
}
