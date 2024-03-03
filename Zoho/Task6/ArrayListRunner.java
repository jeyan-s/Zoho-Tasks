package arraylistrunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import exceptions.InvalidInputException;
import arraylistmethods.ArrayListMethods;
import pet.Pet;

public class ArrayListRunner
{
	public static void main(String[] a)
	{
		int option = 0, size, element;
		int index, fromIndex, toIndex;
		float decimal;
		String string;
		
		ArrayListMethods stringList = new ArrayListMethods();
		ArrayListMethods intList = new ArrayListMethods();
		ArrayListMethods longList = new ArrayListMethods();
		ArrayListMethods floatList = new ArrayListMethods();
		ArrayListMethods objectList = new ArrayListMethods();
		
		
		Scanner input = new Scanner(System.in);
		
		while (option != 19)
		{
			System.out.println("1. Create ArrayList and Print size");
			System.out.println("2. Create ArrayList and Add Strings");
			System.out.println("3. Create ArrayList and Add Integers");
			System.out.println("4. Create ArrayList and Add Objects");
			System.out.println("5. Create ArrayList and Add Integers, Strings and Objects");
			System.out.println("6. Find the index of a String");
			System.out.println("7. Print elements using Iterator and For loop");
			System.out.println("8. Print String at given index");
			System.out.println("9. Find first and last position of the String");
			System.out.println("10. Insert String at given index");
			System.out.println("11. Add elements of a list in a given range of indices");
			System.out.println("12. Create ArrayList using existing 2 ArrayList");
			System.out.println("13. Create ArrayList using existing 2 ArrayList (Second List comes First)");
			System.out.println("14. Remove a decimal value");
			System.out.println("15. Remove elements which are present in another list");
			System.out.println("16. Retain elements which are present in another list");
			System.out.println("17. Remove all elements from a ArrayList");
			System.out.println("18. Check whether a element present in an ArrayList");
			System.out.println("19. Exit");
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("Enter Your Option: ");
			option = input.nextInt();
			input.nextLine();
			
			if (option == 1)
			{
				try
				{
					List<String> list = stringList.createArrayList();
					System.out.println("ArrayList Created");
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
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
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
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
					List<Integer> list = intList.createArrayList();
					System.out.println("Enter number of Integers to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter Integer " + x + ": ");
						element = input.nextInt();
						intList.addElement(list, element);
					}
					input.nextLine();
					
					System.out.println("ArrayList Created with Integers");
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + intList.getSize(list));
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
					List<Object> list = objectList.createArrayList();
					System.out.println("Enter number of Objects to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						objectList.addElement(list, new Pet("SnowBell" + String.valueOf(x)));
					}
					
					System.out.println("ArrayList Created with Objects");
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + objectList.getSize(list));
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
					List<Object> list = objectList.createArrayList();
					
					System.out.println("Enter number of Integers to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter Integer " + x + ": ");
						element = input.nextInt();
						objectList.addElement(list, element);
					}
					input.nextLine();
					
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						objectList.addElement(list, string);
					}
					
					System.out.println("Enter number of Objects to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						objectList.addElement(list, new Pet("SnowBell" + String.valueOf(x)));
					}
					
					System.out.println("ArrayList Created with Objects");
					
					System.out.println("ArrayList Created with Integers, Strings and Objects");
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + objectList.getSize(list));
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
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					
					System.out.println("Enter a String to find its index: ");
					string = input.nextLine();
					
					System.out.println("String found at: " + stringList.getIndex(list, string));
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
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
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					System.out.println("Printing elements using Iterator: ");
					
					Iterator<String> itr = list.iterator();
					
					while (itr.hasNext())
					{
						System.out.println(itr.next());
					}
					
					System.out.println("Printing elements using For Loop: ");
					size = stringList.getSize(list);
					
					for (int x = 0; x < size; x++)
					{
						System.out.println(stringList.getElement(list, x));
					}
					
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
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
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					
					System.out.println("Enter a index to find its value: ");
					index = input.nextInt();
					
					System.out.println("Element in that index is: " + stringList.getElement(list, index));
					
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
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
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					
					System.out.println("Enter a String to find its first and last index: ");
					string = input.nextLine();
					
					System.out.println("First Index: " + stringList.getIndex(list, string));
					System.out.println("Last Index: " + stringList.getLastIndex(list, string));
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
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
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					
					System.out.println("Enter a String to insert: ");
					string = input.nextLine();
					
					System.out.println("Enter the position to insert the string: ");
					index = input.nextInt();
					input.nextLine();
					
					stringList.insertElement(list, index, string);
					
					System.out.println("Element inserted !");
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 11)
			{
				try
				{
					List<String> list1 = stringList.createArrayList();
					List<String> list2 = stringList.createArrayList();
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list1, string);
					}
					
					System.out.println("ArrayList 1 Created with Strings");
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list2, string);
					}
					
					System.out.println("ArrayList 2 Created with Strings");
					
					System.out.println("ArrayList 1: " + list1);
					System.out.println("Size: " + stringList.getSize(list1));
					
					System.out.println("ArrayList 2: " + list2);
					System.out.println("Size: " + stringList.getSize(list2));
					
					System.out.println("Enter from index of List2 to be added in List1: ");
					fromIndex = input.nextInt();
					
					System.out.println("Enter to index of List2 to be added in List1: ");
					toIndex = input.nextInt();
					input.nextLine();
					
					stringList.addElementsFromRange(list1, list2, fromIndex, toIndex + 1);
					
					System.out.println("Final List: " + list1);
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 12)
			{
				try
				{
					List<String> list1 = stringList.createArrayList();
					List<String> list2 = stringList.createArrayList();
					List<String> list = stringList.createArrayList();
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list1, string);
					}
					
					System.out.println("ArrayList 1 Created with Strings");
					
					System.out.println("Enter number of Strings to be added in List 2: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list2, string);
					}
					
					System.out.println("ArrayList 2 Created with Strings");
					
					System.out.println("ArrayList 1: " + list1);
					System.out.println("Size: " + stringList.getSize(list1));
					
					System.out.println("ArrayList 2: " + list2);
					System.out.println("Size: " + stringList.getSize(list2));
					
					stringList.addCollection(list, list1);
					stringList.addCollection(list, list2);
					
					System.out.println("Final List: " + list);
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 13)
			{
				try
				{
					List<String> list1 = stringList.createArrayList();
					List<String> list2 = stringList.createArrayList();
					List<String> list = stringList.createArrayList();
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list1, string);
					}
					
					System.out.println("ArrayList 1 Created with Strings");
					
					System.out.println("Enter number of Strings to be added in List 2: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list2, string);
					}
					
					System.out.println("ArrayList 2 Created with Strings");
					
					System.out.println("ArrayList 1: " + list1);
					System.out.println("Size: " + stringList.getSize(list1));
					
					System.out.println("ArrayList 2: " + list2);
					System.out.println("Size: " + stringList.getSize(list2));
					
					stringList.addCollection(list, list2);
					stringList.addCollection(list, list1);
					
					System.out.println("Final List: " + list);
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 14)
			{
				try
				{
					List<Float> list = floatList.createArrayList();
					System.out.println("Enter number of Decimals to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						decimal = input.nextFloat();
						floatList.addElement(list, decimal);
					}
					
					System.out.println("ArrayList Created with Decimals");
					
					System.out.println("Enter the Decimal Number to be Deleted: ");
					decimal = input.nextFloat();
					
					floatList.removeElement(list, decimal);
					System.out.println("Final ArrayList: " + list);
					System.out.println("Size: " + floatList.getSize(list));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 15)
			{
				try
				{
					List<String> list1 = stringList.createArrayList();
					List<String> list2 = stringList.createArrayList();
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list1, string);
					}
					
					System.out.println("ArrayList 1 Created with Strings");
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list2, string);
					}
					
					System.out.println("ArrayList 2 Created with Strings");
					
					System.out.println("ArrayList 1: " + list1);
					System.out.println("Size: " + stringList.getSize(list1));
					
					System.out.println("ArrayList 2: " + list2);
					System.out.println("Size: " + stringList.getSize(list2));
					
					stringList.removeElementsFrom(list1, list2);
					
					System.out.println("Final List: " + list1);
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 16)
			{
				try
				{
					List<String> list1 = stringList.createArrayList();
					List<String> list2 = stringList.createArrayList();
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list1, string);
					}
					
					System.out.println("ArrayList 1 Created with Strings");
					
					System.out.println("Enter number of Strings to be added in List 1: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list2, string);
					}
					
					System.out.println("ArrayList 2 Created with Strings");
					
					System.out.println("ArrayList 1: " + list1);
					System.out.println("Size: " + stringList.getSize(list1));
					
					System.out.println("ArrayList 2: " + list2);
					System.out.println("Size: " + stringList.getSize(list2));
					
					stringList.retainElementsFrom(list1, list2);
					
					System.out.println("Final List: " + list1);
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 17)
			{
				try
				{
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
					
					stringList.removeAllElements(list);
					System.out.println("Final ArrayList: " + list);
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 18)
			{
				try
				{
					List<String> list = stringList.createArrayList();
					System.out.println("Enter number of Strings to be added: ");
					size = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < size; x++)
					{
						System.out.println("Enter String " + x + ": ");
						string = input.nextLine();
						stringList.addElement(list, string);
					}
					
					System.out.println("ArrayList Created with Strings");
					
					System.out.println("Enter a String to find if it is Present in List: ");
					string = input.nextLine();
					
					System.out.println("String found at: " + stringList.isPresent(list, string));
					System.out.println("ArrayList: " + list);
					System.out.println("Size: " + stringList.getSize(list));
				}
				catch (InvalidInputException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 19)
			{
				System.exit(0);
			}
			
			else
			{
				System.out.println("Invalid Option !!");
			}
		}
	}
}




















