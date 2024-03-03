package pojorunner;

import java.util.Scanner;

import exceptions.InvalidInputException;
import pojo.ContestDetails;

public class POJORunner2
{
	public static void main(String[] a)
	{
		String name;
		int score;
		
		Scanner input = new Scanner(System.in);
		try 
		{
			ContestDetails pojo = new ContestDetails();
			System.out.println("Enter Name: ");
			name = input.nextLine();
			System.out.println("Enter Score: ");
			score = input.nextInt();
			pojo.setName(name);
			pojo.setScore(score);
			System.out.println(pojo.getName());
			System.out.println(pojo.getScore());
		} 
		catch (InvalidInputException e) 
		{
			System.out.println(e.getMessage());
		}
		input.close();
	}
}