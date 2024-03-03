package scross;

import exceptions.InvalidInputException;
import utilitymethods.Utility;

import car.Car;

public class SCross extends Car
{
	private int seats;
	private int airbags;
	private String model;
	private String color;
	
	public int getSeats()
	{
		return seats;
	}
	
	public void setSeats(int seats)
	{
		this.seats = seats;
	}
	
	public int getAirbags()
	{
		return airbags;
	}
	
	public void setAirbags(int airbags)
	{
		this.airbags = airbags;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model) throws InvalidInputException
	{
		Utility.checkNull(model);
		this.model = model;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color) throws InvalidInputException
	{
		Utility.checkNull(color);
		this.color = color;
	}
	
	public void maintainance()
	{
		System.out.println("Maruthi SCross under maintainance");
	}
}
