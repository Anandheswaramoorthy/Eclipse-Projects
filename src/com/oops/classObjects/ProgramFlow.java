package com.oops.classObjects;

public class ProgramFlow {
	    
	    static {
	        System.out.println("static block is executed");
	    }

	    {
	        System.out.println("Instance block is executed");
	    }

	    public ProgramFlow() {
	        System.out.println("Constructor is executed");
	    }
 
	    public static void main(String[] args) {
	        new ProgramFlow();
	        new ProgramFlow();
	}

}
