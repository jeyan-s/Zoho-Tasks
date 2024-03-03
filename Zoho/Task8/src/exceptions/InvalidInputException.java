package exceptions;

public class InvalidInputException extends Exception
{
	private static final long serialVersionUID = 1L;
	public InvalidInputException(String message)
	{
		super(message);
	}
	public InvalidInputException(String message, Throwable cause)
	{
		super(message, cause);
	}
}


//"Position Out of Bounds !"
//"Target not found in the Iterable !"
//"String Length is Smaller than Required Length !"
//"Delimiter cannot be Empty !"




