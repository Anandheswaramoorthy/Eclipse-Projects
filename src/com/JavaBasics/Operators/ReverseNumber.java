package com.JavaBasics.Operators;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int R = 0;
	    while (N > 0) {
	        int digit = N % 10;
	        R = R*10 + digit;
	        N = N/10;
	    }
	        System.out.print(R);
	        sc.close();
	}

}
