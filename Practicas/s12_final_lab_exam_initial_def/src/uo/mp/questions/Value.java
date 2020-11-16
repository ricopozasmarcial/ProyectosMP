package uo.mp.questions;

public class Value extends Question {

	private double value;

	public Value(int ln, double weight, double value) {
		super(ln, weight);
		this.value = value;
	}

	@Override
	public double getMarkForAnswer(String answer) {
		double answerValue = toDouble( answer );
		return isValidValue( answerValue ) ? getWeight() : (getWeight() * -0.1);
	}

	private boolean isValidValue(double answerValue) {
		return (answerValue - 0.1) <= value && value < (answerValue + 0.1);
	}

	private double toDouble(String s) {
		return Double.parseDouble(s);
	}

}
