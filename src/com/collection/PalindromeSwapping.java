package com.collection;
import java.util.Scanner;

public class PalindromeSwapping {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        // Read input string
		        String str = scanner.nextLine();

		        int[] freq = new int[256];

		        // Count frequency of each character
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            freq[ch]++;
		        }

		        int oddCount = 0;

		        // Count characters with odd frequency
		        for (int i = 0; i < 256; i++) {

		            if (freq[i] % 2 != 0) {
		                oddCount++;
		            }
		        }

		        // Check palindrome possibility
		        if (oddCount <= 1) {

		            System.out.println("The string '" + str +
		                    "' can be rearranged to form a palindrome.");

		        } else {

		            System.out.println("The string '" + str +
		                    "' cannot be rearranged to form a palindrome.");
		        }

		        scanner.close();
		    }
	   }


