package uo.mp.ui;

import uo.mp.util.Console;

/**
 * Prints a menu of option onto the standard output and returns the 
 * option chosen but the user 
 */
public class Menu {
	private String[] options = {
			"Load a file",
			"Add vehicle",
			"Remove vehicle",
			"Save to file",
			"Import from zip",
			"Export to zip",
			"",
			"Show vehicles by brand",
			"Show vehicles by age",
			"",
			"Compute total taxes",
		};
		
	public int readOption() {
		return Console.readInteger("Option");
	}

	public void show() {
		int i = 1;
		for(String line: options) {
			if ( "".equals(line) ) {
				Console.println("");
				continue;
			}
			
			Console.printf("\t%2d- %s\n", i++, line);
		}
		Console.printf("\n\t%2d- %s\n", 0, "Exit");
	}

}
