package pojorunner;

import java.util.Scanner;

import exceptions.InvalidInputException;
import pojo.ContestDetails;

public class POJORunner1
{
	public static void main(String[] a)
	{
		String name;
		int score;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = input.nextLine();
		System.out.println("Enter Score: ");
		score = input.nextInt();
		
		try 
		{
			ContestDetails contestDetails = new ContestDetails(name, score);
			System.out.println(contestDetails);
		} 
		catch (InvalidInputException e) 
		{
			System.out.println(e.getMessage());
		}
		input.close();
	}
}