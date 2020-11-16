package uo.mp.questions;

public abstract class Question {

	private int number;
	private double weight;

	public Question(int ln, double weight) {
		this.number = ln;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public int getNumber() {
		return number;
	}

	public abstract double getMarkForAnswer(String answer);

}
