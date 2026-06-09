package com.Bank.ExceptionHandling;

public class Bank {
	
		    void atmBanking()
		    {
		        System.out.println(
		                "Connection established to bank server");

		        Atm atm = new Atm();

		        try
		        {
		            atm.collectInput();
		            atm.validate();
		        }

		        catch(BankValidationException e)
		        {
		            System.out.println(
		                    "You entered a wrong pin. You are left with 2 more attempts.");

		            try
		            {
		                atm.collectInput();
		                atm.validate();
		            }

		            catch(Exception f)
		            {
		                System.out.println(
		                        "You entered a wrong pin. You are left with 1 more attempt.");

		                try
		                {
		                    atm.collectInput();
		                    atm.validate();
		                }

		                catch(Exception g)
		                {
		                    System.out.println(
		                            "You entered a wrong pin. You finished all the attempts. Your card is blocked. Contact Bank.");
		                }
		            }
		        }

		        System.out.println(
		                "Connection terminated from bank server");
		    }
		
    }
