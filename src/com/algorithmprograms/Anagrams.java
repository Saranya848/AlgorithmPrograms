package com.algorithmprograms;

import java.util.*;

public class Anagrams {
	public void checking(int len1, int len2, String str1, String str2) {
		int len;
		int Invalid = 0;
		int valid = 0;
		if (len1 == len2) {
			len = len1;
			for (int i = 0; i < len; i++) {
				valid = 0;
				for (int j = 0; j < len; j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						valid = 1;
						break;
					}
				}
				if (valid == 0) {
					Invalid = 1;
					break;
				}
			}
			if (Invalid == 1) {
				System.out.print("Strings are not Anagrams");
			} else {
				System.out.print("Strings are Anagrams");
			}
		} else {
			System.out.print("Both Strings Must have the same number of Character to be an Anagram");
		}
	}

	public static void main(String[] input) {
		String str1, str2;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter First String : ");
			str1 = scan.nextLine();
			System.out.print("Enter Second String : ");
			str2 = scan.nextLine();
		}
		int len1 = str1.length();
		int len2 = str2.length();

	}
}
