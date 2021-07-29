package Exceptions;
public class CustomeException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomeException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}