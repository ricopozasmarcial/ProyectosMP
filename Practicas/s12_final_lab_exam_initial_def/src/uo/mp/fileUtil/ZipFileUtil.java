/**
 * 
 */
package uo.mp.fileUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Power Service
 *
 */
public class ZipFileUtil {
	
	public List<String> loadLines(String inFileName) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(inFileName))));
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

		BufferedWriter out =  new BufferedWriter(new OutputStreamWriter (new GZIPOutputStream (new FileOutputStream(outFileName))));;
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
