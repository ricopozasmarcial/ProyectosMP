package uo.mp.questions;

public class Choice extends Question {
	private String option;

	public Choice(int ln, double weight, String option) {
		super( ln, weight );
		this.option = option;
	}

	@Override
	public double getMarkForAnswer(String answer) {
		return option.equals( answer ) ? getWeight() : ( getWeight() * -0.2);
	}

}
