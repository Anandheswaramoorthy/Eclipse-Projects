package com.java.ExceptionHandling;

public class Bank {

	public void bankAtm() {
         System.out.println("Connection established with Bank Server");
         
         try {
        	 Atm atm = new Atm();
        	 atm.withdraw();
         }
         catch(Exception e) {
        	 System.out.println("Warning message. There was a transaction made using your card.");
         }

         System.out.println("Connection terminated from bank server");
	}

}
