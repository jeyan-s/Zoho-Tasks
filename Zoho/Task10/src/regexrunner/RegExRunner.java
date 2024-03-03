package regexrunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.InvalidInputException;
import regexmethods.RegExMethods;

public class RegExRunner
{
	public static void main(String[] a)
	{
		int option = 0, low, high, size;
		String string, pattern;
		RegExMethods regExMethods = new RegExMethods(); 
		Scanner input = new Scanner(System.in);
		
		while (option != 10)
		{
			System.out.println("");
			System.out.println("1. Validate Mobile Number");
			System.out.println("2. Check a String, is Alpha Numeric");
			System.out.println("3. To check a pattern starts with, ends with, contains and exact match of a string");
			System.out.println("4. Check if a Pattern is same as given Strings (Case Insensitive)");
			System.out.println("5. Validate Email");
			System.out.println("6. Check given Strings are in Given range of Length");
			System.out.println("7. Return a Map of Pattern as Key & their index value in a List as Values.");
			System.out.println("8. Extract HTML Tags");
			System.out.println("9. Validate Password");
			System.out.println("");
			
			System.out.println("Enter your option: ");
			option = input.nextInt();
			input.nextLine();
			
			if (option == 1)
			{
				System.out.println("Mobile Number to be validated: ");
				string = input.nextLine();
				try 
				{
					System.out.println(regExMethods.isValidMobileNumber(string));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 2)
			{
				System.out.println("Enter a string to check if it is Alpha Numeric: ");
				string = input.nextLine();
				try 
				{
					System.out.println(regExMethods.isAlphaNumeric(string));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 3)
			{
				System.out.println("Enter a String: ");
				string = input.nextLine();
				System.out.println("Enter a Pattern String: ");
				pattern = input.nextLine();
				
				try 
				{
					System.out.println(string + " starts with " + pattern + ": " + regExMethods.isStartsWith(string, pattern));
					System.out.println(pattern + " present in " + string + ": " + regExMethods.isPresent(string, pattern));
					System.out.println(string + " ends with " + pattern + ": " + regExMethods.isEndsWith(string, pattern));
					System.out.println(string + " is an exact match of " + pattern + ": " + regExMethods.isExactMatch(string, pattern));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 4)
			{
				List<String> list = new ArrayList<>();
			
				System.out.println("Enter the Number of Strings: ");
				size = input.nextInt();
				input.nextLine();
				
				for (int x = 0; x < size; x++)
				{
					System.out.println("Enter String" + (x + 1) + ": ");
					string = input.nextLine();
					list.add(string);
				}

				System.out.println("Enter a Pattern String: ");
				pattern = input.nextLine();
				
				try 
				{
					System.out.println("All Strings are same as " + pattern + " (Case Insensitive): " + regExMethods.isListContainsIgnoreCase(list, pattern));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			if (option == 5)
			{
				System.out.println("Enter Email to be validated: ");
				string = input.nextLine();
				try 
				{
					System.out.println(regExMethods.isValidEmail(string));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 6)
			{
				List<String> list = new ArrayList<>();
			
				System.out.println("Enter the Number of Strings: ");
				size = input.nextInt();
				input.nextLine();
				
				for (int x = 0; x < size; x++)
				{
					System.out.println("Enter String" + (x + 1) + ": ");
					string = input.nextLine();
					list.add(string);
				}

				System.out.println("Enter Low Range: ");
				low = input.nextInt();
				
				System.out.println("Enter High Range: ");
				high = input.nextInt();
				input.nextLine();
				
				try 
				{
					System.out.println("Strings Length are in given Range: " + regExMethods.isStringsLengthInRange(list, low, high));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 7)
			{
				List<String> strings = new ArrayList<>();
				List<String> patterns = new ArrayList<>();
			
				System.out.println("Enter the Number of Strings: ");
				size = input.nextInt();
				input.nextLine();
				
				for (int x = 0; x < size; x++)
				{
					System.out.println("Enter String" + (x + 1) + ": ");
					string = input.nextLine();
					strings.add(string);
				}

				System.out.println("Enter the Number of Pattern Strings: ");
				size = input.nextInt();
				input.nextLine();
				
				for (int x = 0; x < size; x++)
				{
					System.out.println("Enter Pattern String" + (x + 1) + ": ");
					string = input.nextLine();
					patterns.add(string);
				}
				
				try 
				{
					System.out.println("Strings Length are in given Range: " + regExMethods.mapMatchingStrings(strings, patterns));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 8)
			{
				System.out.println("Enter the HTML String: ");
				string = input.nextLine();
				
				try 
				{
					System.out.println(regExMethods.getHtmlTags(string));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 9)
			{
				System.out.println("Enter the Password: ");
				string = input.nextLine();
				
				try 
				{
					System.out.println(regExMethods.isValidPassword(string));
				} 
				catch (InvalidInputException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 10)
			{
				System.exit(0);
			}
		}
		input.close();
	}
}