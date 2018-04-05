package analysis.basics.random;

import java.util.Random;

public class RandomInteger {
	
	/**
	 * Variables
	 * */
	private int size = 0;
	private int lowerBoundary = 0;
	private int upperBoundary = Integer.MAX_VALUE - 1;
	private int[] randomNumber = null;
	
	/**
	 * Generate random number of "size"
	 * @param size
	 * */
	public RandomInteger(int size) {
		this.size = size;
		randomNumber = new int[size];
		generateRandomNumber();
	}
	
	/**
	 * Generate random number of "size" within the min/max boundary
	 * @param size, min_bound, max_bound
	 * */
	public RandomInteger(int size, int lowerBoundary, int upperBoundary) {
		this.size = size;
		randomNumber = new int[size];
		this.lowerBoundary = lowerBoundary;
		this.upperBoundary = upperBoundary;
		generateRandomNumber();
	}
	
	/**
	 * Generate random number
	 * */
	private void generateRandomNumber() {
		Random random = new Random();
		
		for(int i = 0; i < size; i++) {
			randomNumber[i] = random.nextInt((upperBoundary - lowerBoundary) + 1) + lowerBoundary;
		}
	}
	
	/**
	 * Get random number array;
	 * */
	public int[] getRandomNumber() {
		return randomNumber;
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
}
