package analysis.basics.statistics;

import java.util.ArrayList;


public class ManipulateArrayList_str {
	
	// Get distinct elements of input arraylist
	public ArrayList<String> getDistinctElements(ArrayList<String> input)
	{
		ArrayList<String> DistinctAL = new ArrayList<String>();
		
		boolean isDistinct = true;
		for(int i = 0; i < input.size(); i++)
		{
			for(int j = 0; j < DistinctAL.size(); j++)
			{
				if(input.get(i).equals(DistinctAL.get(j)))
				{
					isDistinct = false;
					break;
				}
				else
				{
					isDistinct = true;
				}
			}
			
			if(isDistinct)
				DistinctAL.add(input.get(i));
		}
		
		return DistinctAL;
	}
	
	// Get sorted elements of input arraylist
	public ArrayList<String> getSortedElements(ArrayList<String> input)
	{
		
		
		for(int i = 0; i < input.size(); i++)
		{
			for(int j = i+1; j < input.size(); j++)
			{
				if(input.get(i).compareTo(input.get(j)) > 0)
				{
					String temp = input.get(j);
					input.set(j, input.get(i));
					input.set(i, temp);
				}
			}
		}
		
		return input;
	}
	
	// Search and return the index if exist
	public String getIndex(ArrayList<String> input, String search)
	{
		String result = "";
		
		for(int i = 0; i < input.size(); i++)
		{
			if(input.get(i).equals(search))
			{
				result = input.get(i);
				return result;
			}
		}
		
		return null;
	}
	
	// Get most frequent string element of input arraylist
	public String getMostFrequentElement(ArrayList<String> input)
	{
		// Get frequency of each element
		ArrayList<Integer> Count = new ArrayList<Integer>();
		
		for(int i = 0; i < input.size(); i++)
		{
			int count = 0;
			for(int j = 0; j < input.size(); j++)
			{
				if(input.get(i).equals(input.get(j)))
				{
					count++;
				}
			}
			
			Count.add(count);
		}
		
		// Get the index of the most frequent element
		int value = Count.get(0);
		int index = 0;
				
		for(int i = 1; i < Count.size(); i++)
		{
			if(value < Count.get(i))
			{
				value = Count.get(i);
				index = i;
			}
		}
		String result = input.get(index);
		
		return result;
	}
}
