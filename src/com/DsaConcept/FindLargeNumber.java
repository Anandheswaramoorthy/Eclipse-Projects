package com.DsaConcept;

import java.util.Scanner;

public class FindLargeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		
		System.out.println();

		
		if (a > b) {
			System.out.println(a + " is Largest Number");
		} else {
			System.out.println(b + " is Largest Number");
		}
     sc.close();
	}

}
