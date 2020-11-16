package uo.mp.util.file;


import java.util.LinkedList;
import java.util.List;

import uo.mp.util.NotYetImplementedException;

/**
 * A utility class to read/write text lines 
 * from/to a compressed text file (.txt.gz) 
 */
public class ZipFileUtil {

	public List<String> loadFile(String inFileName) {
		List<String> res = new LinkedList<>();
		
		res.add("car	1234ABC	307	110	5	Ford-Focus");
		res.add("motorbike	2345BCD	48	50	2	Honda"); 
		res.add("truck	3456CDE	1900	310	4	Pegaso	2	9500"); 
		res.add("car	4567DEF	307	140	3	Mercedes");
		res.add("motorbike	5678EFG	50	75	1	Yamaha"); 
		res.add("car	6789FGH	80	206	1	Renault-Twingo");
		res.add("motorbike	7890GHI	48	80	4	Suzuki");
		res.add("truck	8901HIJ	1300	150	7	Iveco	1	3500");
		
		return res;
	}

	public void saveToFile(String outZippedFileName, List<String> lines) {
		throw new NotYetImplementedException();
	}

}
