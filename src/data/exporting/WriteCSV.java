package data.exporting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCSV {
	FileWriter writer = null;
	
	public WriteCSV(String path) throws IOException{
		File file = new File(path);
		writer = new FileWriter(file);

	}
	
	public WriteCSV(String path, ArrayList<String> header, ArrayList<ArrayList<String>> body) throws IOException{
		File file = new File(path);
		
		writer = new FileWriter(file);
		
		int rowSize = body.get(0).size();
		int colSize = body.size();
		
		
		
		// header
		for(int i = 0; i < colSize; i++){
			writer.append(header.get(i) + ",");
			
		}
		writer.append("\n");
		
		// body
		for(int i = 0; i < rowSize; i++){
			for(int j = 0; j < colSize; j++){
				writer.append(body.get(j).get(i));
		
			}
			writer.append("\n");
		}
		
		
	}
	
	public void closeCSV() throws IOException{
		writer.close();
	}
	
	public void appendCSV(String str) throws IOException{
		writer.append(str + ",");
	}
	
	public void newLineCSV() throws IOException{
		writer.append("\n");
	}
}
