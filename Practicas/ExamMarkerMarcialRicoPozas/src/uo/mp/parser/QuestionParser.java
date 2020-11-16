/**
 * 
 */
package uo.mp.parser;

import java.util.ArrayList;
import java.util.List;

import uo.mp.exception.InvalidLineFormatException;
import uo.mp.questions.Choice;
import uo.mp.questions.Gap;
import uo.mp.questions.Question;
import uo.mp.questions.Value;

/**
 * @author Power Service
 *
 */
public class QuestionParser {

	/**
	 * metodo que coge una lista de lineas y genera objetos en funcion de su contenido
	 * @param lines, las lineas en las que crea los objetos
	 * @return, un lista con las preguntas
	 */
	public List<Question> parse(List<String> lines){
		List<Question> questions = new ArrayList<Question>(); //creo la lista a devolver
		for(int ln=0; ln<lines.size();ln++) { //bucle que procesa las lineas
			try {
				String[] linea = getLines(lines, ln); //preparo la primera linea para crear un objeto
				Question q = parseLine(ln,linea); //creo objeto a partir de la linea
				questions.add(q); //añado objeto a la lista
			}
			catch(InvalidLineFormatException ile) {
				System.err.println("error en la linea" + ln);
			}
		}
		return questions;
	}
	
	
	/**
	 * metodo que parsea cada linea individualmente
	 */
	public Question parseLine(int linea, String[]line) throws IllegalArgumentException{
		Question q;
		if(line[0].equals("choice")) {
			double weight = Double.parseDouble(line[1]);
			q = new Choice(linea, weight, line[2]);
			return q;
		}
		else if(line[0].equals("gap")) {
			double weight = Double.parseDouble(line[1]);
			q = new Gap(linea, weight, line[2]);
			return q;
		}
		else if(line[0].equals("value")) {
			double weight = Double.parseDouble(line[1]);
			double value = Double.parseDouble(line[2]);
			q = new Value(linea, weight, value);
			return q;
		}
		else
			throw new IllegalArgumentException();
		
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
