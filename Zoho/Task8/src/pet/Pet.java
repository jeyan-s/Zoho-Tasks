package pet;

import utilitymethods.Utility;
import exceptions.InvalidInputException;

public class Pet
{
	String name = "Pet";
	
	public Pet() {}
	
	public Pet(String name) throws InvalidInputException
	{
		Utility.checkNull(name);
		this.name = name;
	}
	
	public String toString()
	{
		return this.name;
	}
}