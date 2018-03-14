package data.importing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {
	
	private String path = "";
	private ArrayList<String> header = new ArrayList<String>();
	private ArrayList<ArrayList<String>> body = new ArrayList<ArrayList<String>>();
	
	public ReadCSV(String path) throws IOException{
		this.path = path;
		
		File f = new File(path);		
		
		if(f.isFile()){
			BufferedReader inputStream = null;
			String line;
			String[] parseLine;
			String[] inputHeader;
			try{
				inputStream = new BufferedReader(new FileReader(f));
									
				line = inputStream.readLine();
				inputHeader = line.split(",");
				
				for(int i = 0; i < inputHeader.length; i++){
					header.add(inputHeader[i]);
					body.add(new ArrayList<String>());
				}
				
				//System.out.println(header.size());
				int cnt = 0;
				while((line = inputStream.readLine()) != null){
					
					parseLine = line.split(",");
					
					//System.out.println(line);
					
					//System.out.println(parseLine.length);
					for(int i = 0; i < header.size(); i++){
						//System.out.print(parseLine[i] + " ");
						
						if(i >= parseLine.length){
							//System.out.println("hi" + parseLine[i]);
							body.get(i).add("");
						}else if(parseLine[i].equals("")){
							body.get(i).add("");
						}
						else{
							//System.out.println("hi22" + parseLine[i]);
							body.get(i).add(parseLine[i]);	
						}
						
						
					}
					cnt++;
					/*
					if(cnt == 1)
						break;
					*/
					//System.out.println("");
				}
				
			}finally{
				inputStream.close();
			}
		}
	}
	
	public void printBody(){
		System.out.println(body.get(0).size() + ", " + header.size());
		
		for(int i = 0; i < body.get(0).size(); i++){
			for(int j = 0; j < header.size(); j++){
				System.out.print(body.get(j).get(i));
			}
			System.out.println("");
		}
	}
	
	public ArrayList<ArrayList<String>> getBody(){
		return body;
	}
	
	public ArrayList<String> getHeader(){
		return header;
	}
	
	public String getPath(){
		return path;
	}
}
