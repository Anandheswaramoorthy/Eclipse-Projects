package com.collection;
import java.util.*;
public class LongestSubstring {

  public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        String str = scanner.nextLine();

		        HashSet<Character> set = new HashSet<>();

		        int left = 0;
		        int maxLength = 0;

		        for (int i = 0; i < str.length(); i++) {

		            while (set.contains(str.charAt(i))) {
		                set.remove(str.charAt(left));
		                left++;
		            }

		            set.add(str.charAt(i));

		            maxLength = Math.max(maxLength, i - left + 1);
		        }

		        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);

		        scanner.close();
		    }
	}

