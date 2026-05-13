package com.collection;
import java.util.*;

public class TreeSetString {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Read number of operations
	        int n = sc.nextInt();
	        sc.nextLine();

	        TreeSet<String> ts = new TreeSet<>();

	        System.out.println("Initial TreeSet: " + ts);

	        for (int i = 0; i < n; i++) {

	            System.out.println("\nOperation Number: " + (i + 1));

	            String str = sc.nextLine();

	            System.out.println("Input Command: " + str);

	            String[] strArray = str.split(" ");

	            System.out.println("Command = " + strArray[0]);

	            switch (strArray[0]) {

	                case "ADD":

	                    System.out.println("Before ADD: " + ts);

	                    ts.add(strArray[1]);

	                    System.out.println(strArray[1] + " added");

	                    System.out.println("After ADD: " + ts);

	                    break;

	                case "CHECK":

	                    System.out.println("Checking value: " + strArray[1]);

	                    if (ts.contains(strArray[1])) {

	                        System.out.println("YES");

	                    } else {

	                        System.out.println("NO");
	                    }

	                    break;

	                case "REMOVE":

	                    System.out.println("Before REMOVE: " + ts);

	                    ts.remove(strArray[1]);

	                    System.out.println(strArray[1] + " removed");

	                    System.out.println("After REMOVE: " + ts);

	                    break;

	                case "FIRST":

	                    System.out.println("Current TreeSet: " + ts);

	                    if (!ts.isEmpty()) {

	                        System.out.println("First Value: " + ts.first());

	                    } else {

	                        System.out.println("NO LANGUAGES");
	                    }

	                    break;

	                case "LAST":

	                    System.out.println("Current TreeSet: " + ts);

	                    if (!ts.isEmpty()) {

	                        System.out.println("Last Value: " + ts.last());

	                    } else {

	                        System.out.println("NO LANGUAGES");
	                    }

	                    break;

	                case "PRINT":

	                    System.out.println("Printing TreeSet");

	                    if (!ts.isEmpty()) {

	                        for (Object j : ts) {

	                            System.out.print(j + " ");
	                        }

	                        System.out.println();

	                    } else {

	                        System.out.println("NO LANGUAGES");
	                    }

	                    break;
	            }
	        }

	        System.out.println("\nFinal TreeSet: " + ts);

	        sc.close();
	    }
	}




