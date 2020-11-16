package UO263907.mp.sesion08.colecciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import UO263907.mp.sesion08.colecciones.ArrayList;
import UO263907.mp.sesion08.colecciones.List;

public class ArrayListTest  extends ListTest{

	@Override
	public List createList() {
		 return new ArrayList();
	}
	
	

}
