package com.JavaBasics.Operators;

import java.util.Scanner;

public class CountDigitsinNumberWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		   long num = scanner.nextLong();
	       long count = 0;   // counter declared outside loop

		while (num > 0) {
		    count++;                // increase count
		    num = num / 10;         // remove last digit
		}

		System.out.println(count);  // print after loop
		scanner.close();
	}

}
