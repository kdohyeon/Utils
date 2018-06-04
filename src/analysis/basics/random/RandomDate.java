package analysis.basics.random;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class RandomDate {
	
	/**
	 * Variables
	 * */
	private int size = 0;
	private Date lowerBoundary;
	private Date upperBoundary;
	private int minSecond;
	private int maxSecond;
	private Date[] randomNumber = null;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * Generate random number of "size"
	 * @param size
	 * */
	public RandomDate(int size) {
		init(size);
		generateRandomDate();
	}
	
	/**
	 * Generate random number of "size" within the min/max boundary
	 * @param size, min_bound, max_bound
	 * */
	public RandomDate(int size, Date lowerBoundary, Date upperBoundary, int minSecond, int maxSecond) {
		init(size);
		this.lowerBoundary = lowerBoundary;
		this.upperBoundary = upperBoundary;
		this.setMinSecond(minSecond);
		this.setMaxSecond(maxSecond);
		
		generateRandomDate();
	}
	
	/**
	 * Initiate
	 * */
	public void init(int size) {
		this.size = size;
		randomNumber = new Date[size];
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	}
	
	/**
	 * Generate random number
	 * */
	private void generateRandomDate() {
		long temp = upperBoundary.getTime() - lowerBoundary.getTime();
		
		Random rand = new Random();
		rand.nextGaussian();
		
		RandomInteger randomInt = new RandomInteger(1,minSecond,maxSecond);
		int randomValue = randomInt.getRandomNumber()[0];
		
		
	}
	
	/**
	 * Get random number array;
	 * */
	public Date[] getRandomNumber() {
		return randomNumber;
	}
	
	/**
	 * Get random number element;
	 * */
	public Date getRandomNumberElement(int i) {
		return randomNumber[i];
	}
	
	/**
	 * Print
	 * */
	public void printRandomNumber() {
		for(int i = 0; i < size; i++) {
			System.out.print(randomNumber[i] + ", ");
		}
		
		System.out.println("");
	}

	public int getMinSecond() {
		return minSecond;
	}

	public void setMinSecond(int minSecond) {
		this.minSecond = minSecond;
	}

	public int getMaxSecond() {
		return maxSecond;
	}

	public void setMaxSecond(int maxSecond) {
		this.maxSecond = maxSecond;
	}
}
