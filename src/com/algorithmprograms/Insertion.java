package com.algorithmprograms;

//import java.util.*;

public class Insertion {
	/**
	 * sort - sorting of array items by insertion calling sorting method printing
	 * before and after sorting
	 */
	/**
	 * Sorting of array items
	 * 
	 * @param arr
	 * @return
	 */
	public static String[] sort(String[] arr) {
		String key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String arr[] = sc.nextLine();
		System.out.println("Before sort");
		String arr[] = { "Ram", "is", "playing", "cricket" };

		/**
		 * printing array items
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		/**
		 * calling sort method
		 */
		sort(arr);
		System.out.println("\n");
		System.out.println("After insertion sort");
		/**
		 * printing array items after sorting
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
