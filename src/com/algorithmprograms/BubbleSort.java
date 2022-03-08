package com.algorithmprograms;

public class BubbleSort {
	/**
	 * sort - sorting of array items by Bubble sort
	 * calling sorting method
	 * printing before and after sorting
	 */
	/**
	 * Sorting of array items
	 * 
	 * @param arr - presenting element of array
	 * @return array
	 */
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					
					/**
					 * swap elements of array items
					 */
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 15, 30, 5 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


		/**
		 *  calling bubble sort array elements 
		 */
		bubbleSort(arr);
		
		System.out.println();
		
		System.out.println("Array After Bubble Sort");
		/**
		 * printing after sorting method
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}