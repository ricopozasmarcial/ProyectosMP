/**
 * 
 */
package uo.mp.comparator;

import java.util.Comparator;
import uo.mp.marker.StudentMark;

/**
 * @author Power Service
 *
 */
public class StudentComparator implements Comparator<StudentMark> {

	@Override
	public int compare(StudentMark mark1, StudentMark mark2) {
		return (mark1.getStudent().compareTo(mark2.getStudent()));
	}

}
