package com.collection;
import java.util.TreeSet;

public class TreeSetConcept {

	    public static void main(String[] args)
	    {
	        TreeSet<Integer> ts = new TreeSet<>();

	        ts.add(100);
	        ts.add(175);
	        ts.add(125);
	        ts.add(50);
	        ts.add(25);
	        ts.add(75);

	        System.out.println(ts);
	        System.out.println(ts.contains(125));
	        System.out.println(ts.first());
	        System.out.println(ts.last());
	    }
	}

