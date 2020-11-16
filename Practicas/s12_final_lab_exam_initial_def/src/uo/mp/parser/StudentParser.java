package uo.mp.parser;

import java.util.ArrayList;
import java.util.List;
import uo.mp.exception.InvalidLineFormatException;
import uo.mp.marker.StudentExam;

public class StudentParser {

	/**
	 * metodo que procesa las lineas individualmente
	 * @param lines
	 * @return
	 */
	public List<StudentExam> parse (List<String> lines){
		List<StudentExam> answers = new ArrayList<StudentExam>(); //creo la lista a devolver
		for(int ln=0; ln<lines.size();ln++) { //bucle que procesa las lineas
			try {
				String[] linea = getLines(lines, ln);
				StudentExam s = parseLine(linea);
				answers.add(s);
			}
			catch(InvalidLineFormatException ile) {
				System.err.println("error en la linea" + ln);
			}
		}
		return answers;
	}
	
	/**
	 * metodo que parsea las lineas individualmente
	 */
	public StudentExam parseLine(String[] line) {
		String uo = line[0];
		List<String> answers = new ArrayList<String>();
		for(int i=1;i<line.length;i++) {
			answers.add(line[i]);
			}
		return new StudentExam(uo, answers);
		}
	
	
	/**
	 * metodo que separa las lineas de un array en subArrays
	 */
	public String[] getLines(List<String> lines, int ln) throws InvalidLineFormatException{
		String[] ret = new String[lines.size()];
		for(int i=0;i<lines.size();i++) {
			if(i==ln) {
				ret = lines.get(ln).split("\t");
			}
		}
		if(ret.equals(null) || lines.get(ln).length()==0) {
			throw new InvalidLineFormatException();
		}
		else
			return ret;	
	}
}

