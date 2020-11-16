/**
 * 
 */
package uo.mp.fileUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Power Service
 *
 */
public class FileUtil {
	public List<String> loadLines(String inFileName) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(inFileName));
		List<String> res = new ArrayList<String>();

		try {
		while (in.ready()) {
			res.add(in.readLine());	}
		}
		catch (IOException e) {
			throw new RuntimeException(e);	
		} 
		finally 
		{
			in.close();}
		
		return res;
	}

	public void saveToFile(String outFileName, List<String> lines) throws IOException{

		BufferedWriter out =  new BufferedWriter(new FileWriter(outFileName));
		try {
			for (String line : lines) {				
				out.write(line);
				out.newLine();	
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			out.close();
		}
	}
}
