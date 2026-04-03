package com.JavaBasics.Operators;

public class LoopSwitch {

	public static void main(String[] args) {
	 String nationality = "indian";
	 int age = 18;
	 
	 switch (nationality) {
	 case "indian":
		 
		 if (age>=18) {
			 System.out.println("vote");
		 } else { 
			 System.out.println("not vote");
		 } break;
		 
	 case "notindian":
		   System.out.println("not indian");
	 }
	 

	}

}
