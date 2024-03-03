package pojo;

import exceptions.InvalidInputException;
import utilitymethods.Utility;

public class ContestDetails
{
	private String name;
	private int score;
	
	public ContestDetails() {}
	
	public ContestDetails(String name, int score) throws InvalidInputException
	{
		setName(name);
		setScore(score);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name) throws InvalidInputException
	{
		Utility.checkNull(name);
		this.name = name;
	}
	
	public int getScore()
	{
		return this.score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public String toString()
	{
		return "Name: " + this.name + "\n" + "Score: " + this.score;
	}
}