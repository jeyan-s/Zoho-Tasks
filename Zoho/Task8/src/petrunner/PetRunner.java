package petrunner;

import exceptions.InvalidInputException;
import pet.Pet;

public class PetRunner
{
	public static void main(String[] a)
	{
		try
		{
			Pet pet = new Pet("Snow Bell");
			System.out.println(pet);
		}
		catch (InvalidInputException e)
		{
			System.out.println(e.getMessage());
		}
	}
}