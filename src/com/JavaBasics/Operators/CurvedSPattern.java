package com.JavaBasics.Operators;

import java.util.Scanner;

public class CurvedSPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <=n; i ++) {
			for (int j = 1; j <= n;  j++) {
				
				if (    i == 1 && i != j ||
						
						i == n && i != j || 
						
						j == 1 && i <= (n/2) && i != j ||
						
						i == ((n+1)/2) && j != 1 && j != n ||
						
						j == n && i > ((n+1)/2) && i != j ) {
					
					System.out.print("* "); 
				} else { 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		scanner.close();


	}

}
