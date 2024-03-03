package utilitymethods;

import exceptions.InvalidInputException;

public class Utility
{
	public static void checkNull(Object string) throws InvalidInputException
	{
		if (string == null)
		{
			throw new InvalidInputException("Input Cannot be Null");
		}
	}
	
	public static void checkRequiredLength(int start, int end) throws InvalidInputException
	{
		if (start >= end) 
		{	
			throw new InvalidInputException("String Length is Smaller than Required Length !");
		}
	}
}
