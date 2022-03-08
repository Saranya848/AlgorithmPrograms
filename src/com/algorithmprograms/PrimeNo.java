package com.algorithmprograms;

public class PrimeNo {
	public static boolean isPrimeorNot(int num) {
		boolean flag = false;
		if (0 <= num && num <= 1000) {
			for (int i = 2; i <= num / 2; ++i) {
				// condition for nonprime number
				if (num % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(num + " is a prime number.");
			else
				System.out.println(num + " is not a prime number.");
		}
		return flag;

	}

	public static void main(String[] input) {
		int n = 23;
		for (int i = 0; i <= 1000; i++) {
			if (PrimeNo.isPrimeorNot(i)) {
				System.out.print(i + " ");
			}

		}

	}
}