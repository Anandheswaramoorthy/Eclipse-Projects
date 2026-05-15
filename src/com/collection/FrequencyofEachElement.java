package com.collection;
import java.util.*;

public class FrequencyofEachElement {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

	        for (int i = 0; i < n; i++) {

	            if (map.containsKey(arr[i])) {

	                int count = map.get(arr[i]);
	                map.put(arr[i], count + 1);

	            } else {

	                map.put(arr[i], 1);
	            }
	        }

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
		    sc.close();
	    }
	}

