package uo.mp.marker;

import java.util.List;

public class StudentExam {

	private String Uo;
	private List<String> answers;
	
	public StudentExam(String uo, List<String> answers) {
		setUo(uo);
		this.answers =  answers;
	}

	public String getUo() {
		return Uo;
	}

	private void setUo(String uo) {
		this.Uo = uo;
	}

	public void addAnswers(String answer) {
		answers.add(answer);
	}
	
	public String getAnswer(int ln) {
		return answers.get(ln);
	}
	
	public List<String> getAnswers(){
		return answers;
	}
}
