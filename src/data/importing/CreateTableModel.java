package data.importing;


/*
 * Author: Dohyeon Kim
 * Date: 2015-06-07
 * Updated: 1
 * Description: create a table model of a csv file
 * Input: physical path of the csv file
 * Output: table model of the csv file
 * */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class CreateTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6547947463417776310L;
	JTable table;
	DefaultTableModel model;
	ArrayList<ArrayList<String>> arrayListTable = new ArrayList<ArrayList<String>>();
	ArrayList<String> arrayListTable_ColNames = new ArrayList<String>();
	
	
	public CreateTableModel(String path) throws IOException{
		readCSVFile(path);
	}

	public ArrayList<ArrayList<String>> getTable()
	{
		return arrayListTable;
	}
	
	public JTable getTableModel()
	{
		//String[row][column]
		String[] colName = new String[arrayListTable_ColNames.size()];
		String[][] rowData = new String[arrayListTable.size()][arrayListTable.get(0).size()];
		
		
		for(int i = 0; i < arrayListTable_ColNames.size(); i++)
			colName[i] = arrayListTable_ColNames.get(i);
		
		for(int i = 0; i < arrayListTable.get(0).size(); i++)
			rowData[0][i] = arrayListTable.get(1).get(i);
		
		for(int i = 0; i < arrayListTable.size(); i++)
		{
	    	for(int j = 0; j < arrayListTable.get(i).size(); j++)
	    	{
	    		//arrayListTable.get(row).get(col)
	    		rowData[i][j] = arrayListTable.get(i).get(j);
	    	}
		}
		
		JTable a = new JTable(rowData, colName);
		return a;
	}

	public ArrayList<String> getColNames()
	{
		return arrayListTable_ColNames;
	}
	
	public int getColumnIndex(String name)
	{
		for(int i = 0; i < arrayListTable_ColNames.size(); i++)
		{
			if(arrayListTable_ColNames.get(i).equals(name))
				return i;
		}
		
		return -1;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return arrayListTable.get(0).size();
	}


	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return arrayListTable.size();
	}


	@Override
	public String getValueAt(int i, int j) {
		// TODO Auto-generated method stub
		
		return arrayListTable.get(i).get(j);
	}
	
	public void printTable()
	{
		// display contents of matrix
		for(int i = 0; i < arrayListTable.size(); i++)
		{
	    	for(int j = 0; j < arrayListTable.get(i).size(); j++)
	    	{
	    		System.out.print( arrayListTable.get(i).get(j) + " _ ");
	    	}
	    	System.out.println();
		}
	}
	
	public void printColumn(){
		for(int i = 0; i < arrayListTable_ColNames.size(); i++)
			System.out.println(arrayListTable_ColNames.get(i));
	}
	
	private void readCSVFile(String path) throws IOException
	{
		File f = new File(path);
		//File f = new File("E:\\portallog\\securedDocument.csv");
		
		if(f.isFile())
		{
			BufferedReader inputStream = null;
			String line;
			String[] parseLine;
			try{
				inputStream = new BufferedReader(new FileReader(f));
				line = inputStream.readLine();
				parseLine = line.split(",");
				for(int i = 0; i < parseLine.length; i++)
					arrayListTable_ColNames.add(parseLine[i]);
				
				while((line = inputStream.readLine()) != null)
				{
					ArrayList<String> temp = new ArrayList<String>();
					parseLine = line.split(",");
					
					for(int i = 0; i < parseLine.length; i++)
						temp.add(parseLine[i]);
					
					arrayListTable.add(temp);
					
				}

			}finally{
				
				inputStream.close();
			}
		}
	}
	
}
