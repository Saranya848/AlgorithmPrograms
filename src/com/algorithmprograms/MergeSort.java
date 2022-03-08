package com.algorithmprograms;

public class MergeSort {
	/**
	 * 
	 * @param arr
	 * @param l
	 * @param r
	 * @param left
	 * @param right
	 */
	public static void merge(int[] arr, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		/**
		 * check the conditions for merging
		 */
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}
		}
		while (i < left) {
			arr[k++] = l[i++];
		}
		while (j < right) {
			arr[k++] = r[j++];
		}
	}

	public static void mergeSort(int[] arr, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];
		/**
		 * Dividing array into two and copying into two separate arrays
		 */
		for (int i = 0; i < mid; i++) {
			l[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = arr[i];
		}
		/**
		 * calling the function to divide the subarrays
		 */
		mergeSort(l, mid);
		mergeSort(r, n - mid);
		/**
		 * Calling the merge method on each subdivision
		 */
		merge(arr, l, r, mid, n - mid);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 10, 15, 5, 25, 14 };
		System.out.println("Array Before Merge Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		/**
		 * calling Merge sort array elements
		 */
		mergeSort(arr, arr.length);

		System.out.println();

		System.out.println("Array After Merge Sort");
		/**
		 * printing after sorting method
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
