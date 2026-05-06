package com.DsaConcept;

public class BasicString {

	public static void main(String[] args) {
		
		    String s1 = "JAVA";
	        String s2 = "java";

	        System.out.println(s1.equals(s2));
	        System.out.println(s1.equalsIgnoreCase(s2));
	        System.out.println(s1.length());
	        System.out.println(s1.charAt(1));
	        System.out.println(s1.indexOf('A'));
	        System.out.println(s1.lastIndexOf('A'));
	        System.out.println(s1.toLowerCase());
	        System.out.println(s2.toUpperCase());

	        String s3 = "technology";
	        char[] arr1 = s3.toCharArray();
	        for (int i = 0; i < arr1.length; i++) {
	            System.out.println(arr1[i]);
	        }

	        String s4 = "Java full stack tech";
	        String[] arr2 = s4.split(" ");
	        for (int i = 0; i < arr2.length; i++) {
	            System.out.println(arr2[i]);
	        }
	  }

}
