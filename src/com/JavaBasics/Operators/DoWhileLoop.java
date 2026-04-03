package com.JavaBasics.Operators;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);
		        int N = scanner.nextInt(); 
		        int multiplier = 1;
				do {
		        	
		        	if (N>0)
		        	{
		             multiplier *= N;
		             N--;
		            }
		        } 
		        while (N>2);
		        System.out.println(multiplier);
                scanner.close();
	}

}
