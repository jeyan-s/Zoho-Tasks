package filemethodsrunner;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import filemethods.FileMethods;
import exceptions.InvalidInputException;

public class FileMethodsRunner
{
	public static void main(String[] a)
	{
		int option = 0, lines, pairs;
		String fileName, rootPath, absPath, line, key, value;
		rootPath = System.getProperty("user.dir");
		
		Scanner input = new Scanner(System.in);
		FileMethods fileMethods = new FileMethods();
		
		while (option != 5)
		{
			System.out.println("");
			System.out.println("1. Create a file and Write contents");
			System.out.println("2. Add keys and values to Properties and store them to a file");
			System.out.println("3. Load properties from an another file");
			System.out.println("4. Change or Create directory");
			System.out.println("5. Exit");
			System.out.println();
			System.out.println("Current Path: " + rootPath);
			System.out.println();

			System.out.println("Enter your Option: ");
			option = input.nextInt();
			input.nextLine();
			
			if (option == 1)
			{
				try
				{
					System.out.println("Enter the name of the File to be Created: ");
					fileName = input.nextLine();
					System.out.println("Enter the number of lines to be added: ");
					lines = input.nextInt();
					input.nextLine();
					String[] data = new String[lines];
					fileMethods.writeContent(rootPath + "/" + fileName, data);
					for (int x = 0; x < lines; x++)
					{
						System.out.println("Enter line " + (x + 1) + ": ");
						line = input.nextLine();
						data[x] = line;
					}
					fileMethods.writeContent(rootPath + "/" + fileName, data);
					System.out.println("Content written in File !");
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
					Properties property = fileMethods.createProperty();
					System.out.println("Enter the number of KeyValue pairs to be added: ");
					pairs = input.nextInt();
					input.nextLine();
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + (x + 1) + ": ");
						key = input.nextLine();
						System.out.println("Enter Value " + (x + 1) + ": ");
						value = input.nextLine();
						fileMethods.setProperty(property, key, value);
					}
					System.out.println("Key Value added to Properties !");
					System.out.println("Enter the name of the File to Store Key Values: ");
					fileName = input.nextLine();
					fileMethods.storeProperties(rootPath + "/" + fileName, property);
					System.out.println("Key Values are stored in file !");
				}
				catch (InvalidInputException | IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 3)
			{
				try
				{
					Properties property = fileMethods.createProperty();
					System.out.println("Enter the name of the File to Load the Properties: ");
					fileName = input.nextLine();
					fileMethods.loadProperties(property, rootPath + "/" + fileName);
					System.out.println("Key Values are loaded to Properties !");
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
					System.out.println("Enter the Absolute Path of the Directory: ");
					absPath = input.nextLine();
					if (fileMethods.makeDirectories(absPath))
					{
						rootPath = absPath;
						System.out.println("Directories created and Root path has been changed !");
					}
					else
					{
						System.out.println("There are some issues in the Path !");
					}
				}
				catch (InvalidInputException | IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 5)
			{
				System.exit(0);
			}
			
			else
			{
				System.out.println("Invalid Option !");
			}
		}
		input.close();
	}
}