package com.JavaBasics.Operators;

public class Typecasting {

	public static void main(String[] args) {
		
		char  a = 'A';
		
		byte   b = (byte)a;
		short  c = (short)a;
		int    d = a;
		long   e = a;
		float  f = a;
		double g = a;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println("-----------");
		
		byte i = 100;
		char j = (char) i;
		System.out.println(i);
		System.out.println(j);
		
		short k = 65;
		char l = (char) k;
		System.out.println(k);
		System.out.println(l);
		
		int m= 2949;
		char n =(char) m;
		System.out.println(m);
		System.out.println(n);
		
		

	}

}
