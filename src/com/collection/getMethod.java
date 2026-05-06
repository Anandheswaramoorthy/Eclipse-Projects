package com.collection;
import java.util.ArrayList;
import java.util.Scanner;

public class getMethod {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // Read the number of elements
		        int n = sc.nextInt();

		        // Create ArrayList
		        ArrayList<Integer> list = new ArrayList<>();

		        // Add elements to ArrayList
		        for (int i = 0; i < n; i++) {
		            list.add(sc.nextInt());
		        }

		        // Read index
		        System.out.println("Give index Number");
		        int index = sc.nextInt();

		        // Print element at given index
		        System.out.println("Element at index " + index + ": " + list.get(index));

		        sc.close();
		    }

	}

