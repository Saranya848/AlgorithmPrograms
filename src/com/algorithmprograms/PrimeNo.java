package com.algorithmprograms;

import java.util.ArrayList;

public class PrimeNo {
	static ArrayList<Integer> arrayList = new ArrayList<>();

	/**
	 * Method for prime numbers
	 * 
	 * @param num - number of range
	 * @return
	 */
	public static boolean isPrimeorNot(int num) {
		if (num == 0 || num == 1)
			return false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println("The Prime numbers of range 0 to 1000");
		for (int i = 0; i <= 1000; i++) {
			/**
			 * calling and checking number is prime or not
			 */
			if (isPrimeorNot(i)) {
				arrayList.add(i);
			}
		}
		/**
		 * Print the prime numbers of range
		 */
		System.out.println(arrayList);
	}

}