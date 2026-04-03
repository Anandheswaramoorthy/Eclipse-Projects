package com.JavaBasics.Operators;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int num = scanner.nextInt();
	  int total = 0;
	  while (num > 0 ) {
		  int add = num % 10 ;
		  total += add;
		   num = num/10;
		  
	  }
	  System.out.println(total);
	  scanner.close();
	}
}
