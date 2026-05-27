package BankExceptionHandling.java;
import java.util.Scanner;

	public class Atm
	{
	    int AccNo = 1111;
	    int pin = 1234;
	    int p;

	    public void collectInput()
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your pin");
	        p = sc.nextInt();
	        sc.close();
	    }

	    public void validate() throws BankValidationException
	    {
	        if(p == pin)
	        {
	            System.out.println("Collect your cash");
	        }
	        else
	        {
	            BankValidationException be =
	                    new BankValidationException();

	            throw be;
	            
	        }

	    }

	}

