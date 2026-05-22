package com.collection;
import java.util.Scanner;
import java.util.ArrayList;
public class AddingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList <String> str1 = new ArrayList<>();
		
		
		for( int i = 0; i < n; i++) {
			str1.add(sc.next());
		}
		
		int value = sc.nextInt();
		sc.nextLine();

		
		String str2 = sc.nextLine();
		
		str1.add(value, str2);
		
		System.out.println("Updated ArrayList: ");
		
		for(int i = 0; i < str1.size(); i++) {
			System.out.print(str1.get(i)  + " ");
		}
		
		 sc.close();
	}
  
}
