/**
 * 
 */
package uo.mp.marker;

import java.io.Serializable;

/**
 * @author Power Service
 *
 */
public class StudentMark implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String student;
	private Double value;
	
	public StudentMark(String student, Double value) {
		setStudent(student);
		setValue(value);
	}

	public String getStudent() {
		return student;
	}

	private void setStudent(String student) {
		this.student = student;
	}

	public Double getValue() {
		return value;
	}

	private void setValue(Double value) {
		this.value = value;
	}

	public String serialize() {
		return (getStudent() + " - " + getValue());
		
	}

	
}
