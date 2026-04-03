package com.JavaBasics.Operators;

import java.util.Scanner;

public class CountDigitsinNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		  int num = scanner.nextInt();
		  int f = 0;
		  while (num > 0 )
		  {
			  int add = num % 10 ;
			  
			  if (add > 0 ) 
			  {
				  int n = 1;
				  f += n;
			  }  
			 num = num/10;
		  }
		   System.out.println(f);
		   scanner.close();
    }
}

