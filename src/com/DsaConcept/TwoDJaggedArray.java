package com.DsaConcept;

import java.util.Scanner;

public class TwoDJaggedArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classes");
		int c = sc.nextInt();
		
		int[][] marks = new int[c][];
		
		
		for(int i = 0; i < marks.length; i++) {
		    System.out.println("Enter the number of students in class " + (i+1));
		    int s = sc.nextInt();
		    marks[i] = new int[s];
		}
	    sc.close();
	}
}
