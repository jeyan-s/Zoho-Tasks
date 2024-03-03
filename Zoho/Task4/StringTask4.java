package stringtask4;

import stringbuildermethods.StringBuilderMethods;
import exceptions.InvalidInputException;
import java.util.Scanner;


public class StringTask4
{
	public static void main(String[] a)
	{
		int option = 0, builderLength, size, position, fromIndex, toIndex;
		StringBuilder strBuilder;
		String string, separator;
		char toBeReplaced, replacedBy;
		Scanner input = new Scanner(System.in);
		StringBuilderMethods stringBuilderMethods = new StringBuilderMethods();
		
		while (option != 11)
		{
			System.out.println("1. Create a empty StringBuilder, then print length & Add a string, then Print length & String: ");
			
			System.out.println("2. Create a StringBuilder, then print length & Add strings with a separator, then Print length & String: ");
			
			System.out.println("3. Create a StringBuilder with strings with a separator & print length and insert a string, then Print length and String: ");
			
			System.out.println("4. Create a StringBuilder with strings with a separator & print length and delete a string, then Print length and String: ");
			
			System.out.println("5. Create a StringBuilder with strings with a separator & print length and replace a character, then Print length and String: ");
			
			System.out.println("6. Create a StringBuilder with strings with a separator & print length and reverse the string, then Print length and String: ");
			
			System.out.println("7. Create a StringBuilder with strings with a separator & print length and delete a sequence of indices, then Print length and String: ");
			
			System.out.println("8. Create a StringBuilder with strings with a separator & print length and replace a sequence of indices, then Print length and String: ");
			
			System.out.println("9. Create a StringBuilder with strings with a separator & print length, then get the first index of the given string: ");
			
			System.out.println("10. Create a StringBuilder with strings with a separator & print length, then get the last index of the given string: ");
			
			
			System.out.println("11. Exit");
			
			System.out.println();
			System.out.println();
			
			System.out.println("Enter your Option: ");
			option = input.nextInt();
			input.nextLine();
			
			if (option == 1)
			{
				try 
				{
					strBuilder = stringBuilderMethods.createStringBuilder("");
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("StringBuilder created !");
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Enter a String to be Added: ");
					string = input.nextLine();
					stringBuilderMethods.addString(strBuilder, string);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("String added to StringBuilder !");
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Final String: " + stringBuilderMethods.getString(strBuilder));
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
					System.out.println("Enter a String to create a StringBuilder: ");
					string = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder(string);
					System.out.println("StringBuilder created with String! ");
					System.out.println("Enter Number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					String[] strings = new String[size];
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						strings[x] = input.nextLine();
					}
					System.out.println("Enter separator: ");
					separator = input.nextLine();
					strBuilder = stringBuilderMethods.addStringsBySeparator(strBuilder, strings, separator);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Final String: " + stringBuilderMethods.getString(strBuilder));
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
					System.out.println("Enter Number of Strings to create a StringBuilder: ");
					size = input.nextInt();
					input.nextLine();
					String[] strings = new String[size];
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						strings[x] = input.nextLine();
					}
					System.out.println("Enter separator: ");
					separator = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.addStringsBySeparator(strBuilder, strings, separator);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Enter a String to be inserted: ");
					string = input.nextLine();
					System.out.println("Enter the position of the String to be inserted: ");
					position = input.nextInt();
					strBuilder = stringBuilderMethods.insertString(strBuilder, position, string, separator);
					System.out.println("String inserted: ");
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Final String: " + stringBuilderMethods.getString(strBuilder));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 4)
			{
				try 
				{
					System.out.println("Enter Number of Strings to create a StringBuilder: ");
					size = input.nextInt();
					input.nextLine();
					String[] strings = new String[size];
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						strings[x] = input.nextLine();
					}
					System.out.println("Enter separator: ");
					separator = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.addStringsBySeparator(strBuilder, strings, separator);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					System.out.println("Length of the StringBuilder: " + builderLength);
					//System.out.println("Enter a index of the String to be deleted: ");
					//position = input.nextInt();
					//input.nextLine();
					strBuilder = stringBuilderMethods.deleteSubString(strBuilder, 0, strings[0].length() + separator.length());
					System.out.println("After Deletion of First String: " + stringBuilderMethods.getString(strBuilder));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 5)
			{
				try 
				{
					System.out.println("Enter Number of Strings to create a StringBuilder: ");
					size = input.nextInt();
					input.nextLine();
					String[] strings = new String[size];
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						strings[x] = input.nextLine();
					}
					System.out.println("Enter separator: ");
					separator = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.addStringsBySeparator(strBuilder, strings, separator);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Enter the Character to be replaced: ");
					toBeReplaced = input.next().charAt(0);
					System.out.println("Enter the Character to be replaced by: ");
					replacedBy = input.next().charAt(0);
					strBuilder = stringBuilderMethods.replaceCharacter(strBuilder, toBeReplaced, replacedBy);
					
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Final String after Replacement: " + stringBuilderMethods.getString(strBuilder));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 6)
			{
				try 
				{
					System.out.println("Enter Number of Strings to create a StringBuilder: ");
					size = input.nextInt();
					input.nextLine();
					String[] strings = new String[size];
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						strings[x] = input.nextLine();
					}
					System.out.println("Enter separator: ");
					separator = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.addStringsBySeparator(strBuilder, strings, separator);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Length of the StringBuilder: " + builderLength);
					
					//System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Final String after Reversed: " + stringBuilderMethods.getString(strBuilder));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 7)
			{
				try 
				{
					System.out.println("Enter a String to create a StringBuilder: ");
					string = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder(string);
					System.out.println("StringBuilder created with String! ");
					System.out.println("Enter from Index to Delete: ");
					fromIndex = input.nextInt();
					input.nextLine();
					System.out.println("Enter to Index to Delete: ");
					toIndex = input.nextInt();
					input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.deleteSubString(strBuilder, fromIndex, toIndex);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Final String after Deletion: " + stringBuilderMethods.getString(strBuilder));
					
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 8)
			{
				try 
				{
					System.out.println("Enter a String to create a StringBuilder: ");
					string = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder(string);
					System.out.println("StringBuilder created with String! ");
					System.out.println("Enter from Index to Replace: ");
					fromIndex = input.nextInt();
					input.nextLine();
					System.out.println("Enter to Index to Replace: ");
					System.out.println("Enter the string to be Replaced by: ");
					string = input.nextLine();
					toIndex = input.nextInt();
					input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.replaceSubString(strBuilder, string, fromIndex, toIndex);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Length of the StringBuilder: " + builderLength);
					System.out.println("Final String after Replacement: " + stringBuilderMethods.getString(strBuilder));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 9)
			{
				try 
				{
					System.out.println("Enter Number of Strings to create a StringBuilder: ");
					size = input.nextInt();
					input.nextLine();
					String[] strings = new String[size];
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						strings[x] = input.nextLine();
					}
					System.out.println("Enter separator: ");
					separator = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.addStringsBySeparator(strBuilder, strings, separator);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Length of the StringBuilder: " + builderLength);
					position = stringBuilderMethods.firstIndex(strBuilder, separator);
					System.out.println("Index of the First Separator: " + builderLength);
					
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 10)
			{
				try 
				{
					System.out.println("Enter Number of Strings to create a StringBuilder: ");
					size = input.nextInt();
					input.nextLine();
					String[] strings = new String[size];
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						strings[x] = input.nextLine();
					}
					System.out.println("Enter separator: ");
					separator = input.nextLine();
					strBuilder = stringBuilderMethods.createStringBuilder("");
					strBuilder = stringBuilderMethods.addStringsBySeparator(strBuilder, strings, separator);
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Strings added to StringBuilder !");
					builderLength = stringBuilderMethods.getLength(strBuilder);
					System.out.println("Length of the StringBuilder: " + builderLength);
					position = stringBuilderMethods.lastIndex(strBuilder, separator);
					System.out.println("Index of the Last Separator: " + builderLength);
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 11)
			{
				System.exit(0);
			}
			
			else
			{
				System.out.println("Enter a Valid Choice: ");
			}
			
		}
	}
}
