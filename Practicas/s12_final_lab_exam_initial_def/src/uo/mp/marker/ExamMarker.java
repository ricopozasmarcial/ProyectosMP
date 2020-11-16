package uo.mp.marker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uo.mp.comparator.MarkComparator;
import uo.mp.comparator.StudentComparator;
import uo.mp.fileUtil.FileUtil;
import uo.mp.fileUtil.ZipFileUtil;
import uo.mp.parser.QuestionParser;
import uo.mp.parser.StudentParser;
import uo.mp.questions.Question;
import uo.mp.serializer.MarkSerializer;




public class ExamMarker {
	private List<Question> questions = new ArrayList<>();
	private List<StudentExam> studentExams = new ArrayList<>();
	private List<StudentMark> marks = new ArrayList<>();

	public void loadQuestions(String examModelFile) throws IOException {
		List<String> lines = new FileUtil().loadLines( examModelFile );
		List<Question> questions = new QuestionParser().parse( lines );
		addQuestions( questions );
	}

	private void addQuestions(List<Question> quests) {
		for ( Question d : quests){
			   questions.add(d);
		}	}
	

	public void loadStudentExams(String answersFile) throws FileNotFoundException {
		List<String> lines = null;
		try {
			lines = new ZipFileUtil().loadLines( answersFile );
		} catch (IOException e) {
			System.err.println("error en el cierre del archivo");
		}
		List<StudentExam> exams = new StudentParser().parse(lines);
		addExams( exams );
	}

	private void addExams(List<StudentExam> exams) {
		for ( StudentExam d : exams){
			   studentExams.add(d);
		}
		
	}

	public List<StudentMark> getMarksByStudent() {
		Collections.sort(marks, new StudentComparator());
		return marks;
	}

	public List<StudentMark> getMarksByMark() {
		Collections.sort(marks, new MarkComparator());
		return marks;
	}

	public void mark() {
		String id = "";
		String respuesta;
		Double finalnote=0.0;
		Question pregunta;		
		List<String> res = new ArrayList<>();
		for (StudentExam d : studentExams) {
			finalnote=0.0;
			id = d.getUo();
			copyFromTo(d.getAnswers(), res);
			for (int i = 0; i < res.size(); i++) {
				respuesta = res.get(i);				
				pregunta = questions.get(i);
				finalnote = finalnote+ pregunta.getMarkForAnswer(respuesta);}
			marks.add(new StudentMark(id, finalnote));}
	}

	public void saveResults(String resultsFile) {
		List<StudentMark> marks = getMarks();
		List<String> lines = new MarkSerializer().serialize( marks );
		try {
			new FileUtil().saveToFile( resultsFile, lines);
		} catch (IOException e) {
			System.err.println("error en el cierre del archivo. Pongase en contacto con su administrador");
		}
	}

	private List<StudentMark> getMarks() {
		return new ArrayList<>( marks );
	}

	private static void copyFromTo(List<String> fromInitial, List<String> toFinal) {
		toFinal.clear();
		for(String s: fromInitial) {
			toFinal.add( s );}
	}
}
