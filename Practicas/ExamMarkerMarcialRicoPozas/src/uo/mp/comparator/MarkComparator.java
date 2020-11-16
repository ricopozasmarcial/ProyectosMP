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
public class MarkComparator implements Comparator<StudentMark> {

	@Override
	public int compare(StudentMark mark1, StudentMark mark2) {
		if(mark1.getValue() > mark2.getValue()) {
			return 1;
		}
		else if(mark1.getValue() < mark2.getValue()) {
			return -1;
		}
	return mark1.getStudent().compareTo(mark2.getStudent());
	}

}
