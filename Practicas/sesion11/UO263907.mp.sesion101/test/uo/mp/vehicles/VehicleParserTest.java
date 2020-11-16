/**
 * 
 */
package uo.mp.vehicles;

import static org.junit.Assert.*;

import java.util.List;

import java.util.LinkedList;

import org.junit.*;

import uo.mp.pdc.parcel.VehicleParser;

/**
 * @author Marcial Rico Pozas
 *
 */
public class VehicleParserTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ParseTest() {
		
		//creamos una lista de Strings para los casos
		List<String> res = new LinkedList<>();	
		res.add("car	1234ABC	307	110	5	Ford-Focus");
		res.add("motorbike	2345BCD	48	50	2	Honda"); 
		res.add("truck	3456CDE	1900	310	4	Pegaso	2	9500"); 
		
		//caso1: creamos una lista de vehiculos con todos los parámetros correctos
		VehicleParser vh1 = new VehicleParser();
		assertEquals(3,vh1.parse(res).size());//la lista ha creado 3 vehiculos nuevos
		
		
		//caso2: llamamos al metodo con una lista vacia
		List<String> vacia = new LinkedList<>();
	    assertEquals(0,vh1.parse(vacia).size());//la lista ha creado 0 vehiculos nuevos
	    
	    //caso3: llamamos al metodo con una linea incorrecta en la lista
	    List<String> res2 = new LinkedList<>();
		res2.add("car	1234ABC	307	110	5	Ford-Focus");
		res2.add("motorbikes	2345BCD	48	50	2	Honda"); 
		res2.add("truck	3456CDE	1900	310	4	Pegaso	2	9500");
		
		assertEquals(2,vh1.parse(res2).size()); //la lista solo crea dos vehiculos
		
		

		
	}

}
