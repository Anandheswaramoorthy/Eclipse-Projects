package BankExceptionHandling.java;

public class BankValidationException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage()
    {
        return "You made wrong attempt";
    }
}