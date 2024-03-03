package car;

import exceptions.InvalidInputException;
import utilitymethods.Utility;

public class Car
{
	private int yearOfMake;
	private String engineNumber;
	private String type;
	
	public Car() {}
	
	public Car(String string)
	{
		System.out.println(string);
	}
	
	public int getYearOfMake()
	{
		return yearOfMake;
	}
	
	public void setYearOfMake(int yearOfMake)
	{
		this.yearOfMake = yearOfMake;
	}
	
	public String getEngineNumber()
	{
		return engineNumber;
	}
	
	public void setEngineNumber(String engineNumber) throws InvalidInputException
	{
		Utility.checkNull(engineNumber);
		this.engineNumber = engineNumber;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type) throws InvalidInputException
	{
		Utility.checkNull(type);
		this.type = type;
	}
	
	public void maintainance()
	{
		System.out.println("Car under maintainance");
	}
}
