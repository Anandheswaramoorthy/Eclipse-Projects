package com.collection;
import java.util.ArrayList;

public class ArrayListCode {

	public static void main(String[] args) {


		ArrayList<Object> all = new ArrayList<>();
		
		        all.add(1);
		        all.add("Ajay");
		        all.add('K');
		        all.add(true);
		        all.add(73.46);

	   ArrayList<Object> al2 = new ArrayList<>();

		        al2.add(10);
		        al2.add(20);
		        al2.add(30);
		        al2.add(40);
		        al2.add(50);

		        System.out.println(all);
		        System.out.println(al2);

		        all.addAll(al2);

		        System.out.println(all);
		        System.out.println(al2);

		        all.addAll(3, al2);

		        System.out.println(all);

		        all.set(1, 1000);

		        System.out.println(all);

		        System.out.println(all.contains(10));

		        all.remove(1);
		        all.remove(73.46);

		        System.out.println(all);
		    }
	}

