package com.JavaBasics.Operators;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    int N = scanner.nextInt();
		    if((N % 4 == 0 && N % 100 != 0) || (N % 400 == 0)) {
		        System.out.println("Leap year");
		        
		    } else {
		        System.out.println("Not a Leap Year");
		    }
        scanner.close();
	}

}
