package analysis.basics.random;

import java.util.Random;

public class RandomFloat {
	
	/**
	 * Variables
	 * */
	private int size = 0;
	private float lowerBoundary = 0;
	private float upperBoundary = Integer.MAX_VALUE - 1;
	private float[] randomNumber = null;
	
	/**
	 * Generate random number of "size"
	 * @param size
	 * */
	public RandomFloat(int size) {
		this.size = size;
		randomNumber = new float[size];
		generateRandomNumber();
	}
	
	/**
	 * Generate random number of "size" within the min/max boundary
	 * @param size, min_bound, max_bound
	 * */
	public RandomFloat(int size, float lowerBoundary, float upperBoundary) {
		this.size = size;
		randomNumber = new float[size];
		this.lowerBoundary = lowerBoundary;
		this.upperBoundary = upperBoundary;
		generateRandomNumber();
	}
	
	/**
	 * Generate random number
	 * */
	private void generateRandomNumber() {
		Random random = new Random();
		
		float distance = Math.abs(Math.abs(upperBoundary) - Math.abs(lowerBoundary));
		
		for(int i = 0; i < size; i++) {
			randomNumber[i] = lowerBoundary + (random.nextFloat() * distance);
		}
	}
	
	/**
	 * Get random number array;
	 * */
	public float[] getRandomNumber() {
		return randomNumber;
	}
	
	/**
	 * Get random number element;
	 * */
	public float getRandomNumberElement(int i) {
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
}
