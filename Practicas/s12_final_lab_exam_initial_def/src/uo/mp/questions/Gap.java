package uo.mp.questions;

public class Gap extends Question {

	private String word;

	public Gap(int ln, double weight, String word) {
		super(ln, weight);
		this.word = word;
	}

	@Override
	public double getMarkForAnswer(String answer) {
		return word.equals( answer ) ? getWeight() : 0;
	}

}
