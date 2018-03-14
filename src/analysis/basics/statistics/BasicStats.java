package analysis.basics.statistics;

/*
 * Author: Dohyeon Kim
 * Date: 2015-12-28
 * Updated: 1
 * Description: basic stats using an arraylist
 * Input: an arraylist with double data type elements
 * Output: basic stats, i.e. avg, stddev, max, min, so on...
 * */

import java.util.*;

public class BasicStats {
	ArrayList<Double> doubleAL = new ArrayList<Double>();
	
	public BasicStats(ArrayList<Double> arraylist)
	{
		doubleAL = arraylist;
	}

	public Double getMaxNum()
	{
		double result = 0.0;
		
		result = doubleAL.get(0);
		for(int i = 1; i < doubleAL.size(); i++)
		{
			if(result < doubleAL.get(i))
			{
				result = doubleAL.get(i);
			}
		}
		
		return result;
	}
	
	public int getMaxNumIndex()
	{
		int result = 0;
		double value = 0.0;
		
		value = doubleAL.get(0);
				
		for(int i = 1; i < doubleAL.size(); i++)
		{
			if(value < doubleAL.get(i))
			{
				value = doubleAL.get(i);
				result = i;
			}
		}
		
		
		return result;
	}
	
	public Double getMinNum()
	{
		double result = 0.0;
		
		result = doubleAL.get(0);
		for(int i = 1; i < doubleAL.size(); i++)
		{
			if(result > doubleAL.get(i))
			{
				result = doubleAL.get(i);
			}
		}
		
		return result;
	}
	
	/* Get standard deviation of an arraylist */
	public Double getStddev(){
		double result = 0.0;
		double avg = getAvg();
		
		for(int i = 0; i < doubleAL.size(); i++){
			result = result + Math.pow((doubleAL.get(i) - avg), 2);
		}
		
		result = result / doubleAL.size();
		
		return Math.sqrt(result);
	}
	
	/* Get average of an arraylist */
	public Double getAvg(){
		double result = 0.0;
		result = getSum();
		
		return result / doubleAL.size();
	}
	
	/* Get sum of an arraylist */
	public Double getSum(){
		double result = 0.0;
		for(int i = 0; i < doubleAL.size(); i++){
			result = result + doubleAL.get(i);
		}
		
		return result;
	}
	
}
