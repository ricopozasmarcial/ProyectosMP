package uo.mp;

import java.io.IOException;
import java.util.List;

import uo.mp.marker.ExamMarker;
import uo.mp.marker.StudentMark;

public class Main {

	private static final String EXAM_MODEL_FILE = "exam.model.txt";
	private static final String ANSWERS_FILE = "answers.txt.gz";
	private static final String RESULTS_FILE = "results.txt";

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
			execute();
	}

	private void execute() {
		ExamMarker ex = new ExamMarker();
		try {
			ex.loadQuestions( EXAM_MODEL_FILE );
			ex.loadStudentExams( ANSWERS_FILE );
		} catch (IOException e) {
			System.err.print("Error al cargar el fichero, pongase en contacto con su adminsitrador");
		}
		ex.mark();
		showMarks( ex.getMarksByMark() );
		showMarks( ex.getMarksByStudent() );
		ex.saveResults( RESULTS_FILE );
	}

	private void showMarks(List<StudentMark> marks) {
		System.out.println("---------------------------------------------");
		System.out.println("List of marks ");
		for(StudentMark mark: marks) {
			System.out.println( mark.getStudent() + " " + mark.getValue() );
		}
	}

}
