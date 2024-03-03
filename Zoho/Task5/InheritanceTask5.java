package task5;

import java.util.Scanner;

import car.Car;
import swift.Swift;
import xuv.XUV;
import scross.SCross;
import birdabstract.BirdAbstract;
import parrotmod.ParrotMod;
import bird.Bird;
import duck.Duck;
import exceptions.InvalidInputException;

public class InheritanceTask5
{
	public static void acceptSwift(Swift swift)
	{
		System.out.println("Successfully Accepted!" + swift.toString());
	}
	
	public static void acceptCar(Car car)
	{
		if (car instanceof Swift)
		{
			System.out.println("Hatch");
		}
		else if (car instanceof XUV)
		{
			System.out.println("SUV");
		}
		else if (car instanceof SCross)
		{
			System.out.println("Sedan");
		}	
	}
	
	public static void main(String[] a)
	{
		Scanner input = new Scanner(System.in);
		int option = 0, seats, airbags, yearOfMake;
		String model, color, type, engineNumber;
		
		while (option != 10)
		{
			System.out.println("1. Run SubTask 2");
			System.out.println("2. Run SubTask 3");
			System.out.println("3. Run SubTask 4 and 5");
			System.out.println("4. Run SubTask 6");
			System.out.println("5. Run SubTask 7");
			System.out.println("6. Run SubTask 8");
			System.out.println("7. Run SubTask 9");
			System.out.println("8. Run SubTask 10");
			System.out.println("9. Exit");
			
			System.out.println("Enter your Option: ");
			option = input.nextInt();
			input.nextLine();
			
			if (option == 1)
			{
				try
				{
					Swift swift = new Swift();
					
					System.out.println("Enter Number of Seats: ");
					seats = input.nextInt();
					swift.setSeats(seats);
					
					System.out.println("Enter Number of Airbags: ");
					airbags = input.nextInt();
					swift.setAirbags(airbags);
					input.nextLine();
					
					System.out.println("Enter Model: ");
					model = input.nextLine();
					swift.setModel(model);
					
					System.out.println("Enter Color: ");
					color = input.nextLine();
					swift.setColor(color);
					
					System.out.println("Swift Object created with, ");
				
					System.out.println("Number of Seats: " + swift.getSeats());
					
					System.out.println("Number of Airbags: " + swift.getAirbags());
					
					System.out.println("Model: " + swift.getModel());
					
					System.out.println("Color: " + swift.getColor());
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
				
			else if (option == 2)
			{
				try
				{
					SCross scross = new SCross();
					
					System.out.println("Enter Year of Make: ");
					yearOfMake = input.nextInt();
					scross.setYearOfMake(yearOfMake);
					input.nextLine();
					
					System.out.println("Enter Engine Number: ");
					engineNumber = input.nextLine();
					scross.setEngineNumber(engineNumber);
					
					System.out.println("Enter Type: ");
					type = input.nextLine();
					scross.setType(type);
					
					System.out.println("Enter Number of Seats: ");
					seats = input.nextInt();
					scross.setSeats(seats);
					
					System.out.println("Enter Number of Airbags: ");
					airbags = input.nextInt();
					scross.setAirbags(airbags);
					input.nextLine();
					
					System.out.println("Enter Model: ");
					model = input.nextLine();
					scross.setModel(model);
					
					System.out.println("Enter Color: ");
					color = input.nextLine();
					scross.setColor(color);
					
					System.out.println("Swift Object created with, ");
					
					System.out.println("YearOfMake: " + scross.getYearOfMake());
					
					System.out.println("EngineNumber: " + scross.getEngineNumber());
					
					System.out.println("Type: " + scross.getType());
				
					System.out.println("Number of Seats: " + scross.getSeats());
					
					System.out.println("Number of Airbags: " + scross.getAirbags());
					
					System.out.println("Model: " + scross.getModel());
					
					System.out.println("Color: " + scross.getColor());
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 3)
			{
				try
				{
					Swift swift = new Swift();
					SCross scross = new SCross();
					XUV xuv = new XUV();
					acceptCar(swift);
					acceptCar(scross);
					acceptCar(xuv);
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 4)
			{
				try
				{
					Swift swift = new Swift();
					SCross scross = new SCross();
					XUV xuv = new XUV();
					Car car = new Swift();
					acceptSwift(swift);
					acceptSwift((Swift) car);
					//acceptSwift(xuv);
					//acceptSwift(scross);
				}
				catch (Exception e)
				{
					System.out.println("Error " + e.getMessage());
				}
			}
			
			else if (option == 5)
			{
				try
				{
					SCross scross = new SCross();
					scross.maintainance();
					
					Car swiftcar = new SCross();
					swiftcar.maintainance();
					
					Car car = new Car();
					car.maintainance();
					
					Swift swift = new Swift();
					swift.maintainance();
				}
				catch (Exception e)
				{
					System.out.println("Error " + e.getMessage());
				}
			}
			
			else if (option == 6)
			{
				try
				{
					XUV xuv = new XUV();
					//xuv = new XUV("HI");
				}
				catch (Exception e)
				{
					System.out.println("Error " + e.getMessage());
				}
			}
			
			else if (option == 7)
			{
				//BirdAbstract bird = new BirdAbstract();
				ParrotMod parrot = new ParrotMod();
				parrot.fly();
				parrot.speak();
			}
			
			else if (option == 8)
			{
				Duck duck = new Duck();
				duck.fly();
				duck.speak();
			}
			
			else if (option == 9)
			{
				System.exit(0);
			}
			
			else
			{
				System.out.println("Invalid Choice");
			}
				
		}
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
