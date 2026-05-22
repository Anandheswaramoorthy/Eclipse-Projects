package com.collection;
import java.util.*;
public class RotateArray {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        
	        int[] arr = new int[n];

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int n2 = sc.nextInt();
	        
	        int[] rotate = new int[n];

	        for (int i = n2 + 1; i < n; i++) {
	            	
	                rotate[i] = arr[i];
	 
	              System.out.print(rotate[i] + " ");
	             
	      }
	        for (int k = 0; k <= n2; k++ ) {
          	  
          	  System.out.print(arr[k] + " ");
	            	 
        }
             sc.close();

	 }
 }
	 

