package uo.mp.serializer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import uo.mp.marker.StudentMark;

public class MarkSerializer implements Serializable{

	private static final long serialVersionUID = 1L; //constante de serializacion

	public List<String> serialize(List<StudentMark> lista){
		List<String> ret = new ArrayList<String>();
		for(StudentMark nota: lista) {
			ret.add(nota.serialize());
		}
		return ret;
	}
}
