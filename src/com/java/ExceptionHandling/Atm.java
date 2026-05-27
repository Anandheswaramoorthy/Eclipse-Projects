package com.java.ExceptionHandling;

import java.util.Scanner;

public class Atm {

	public void  withdraw() throws Exception {
		
       System.out.println("Atm transaction started");
       
       try {
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.println("Enter Pin");
    	   int pin = sc.nextInt();
    	   
    	   if(pin == 1234) {
    		   System.out.println("Enter the amount");
    		   
    		   int amount = sc.nextInt();

    		   System.out.println("Withdraw amount: " + amount);

    		   System.out.println("Collect your Cash");
    		   
    		   sc.close();
    	   }
         } catch(Exception e) {
    	   
        	System.out.println("Incorrect pin or invalid. Collect your card.");
        	
        	throw e;
        	
       }
       
       finally {
    	   System.out.println("Atm transaction ended");
       }
	}

}
