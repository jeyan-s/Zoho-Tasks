package datetimerunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

import dateandtime.DateAndTime;
import exceptions.InvalidInputException;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeRunner
{
	private static void printZoneIds(ArrayList<String> zones)
	{
		System.out.println("Code Region");
		int y = 0;
		for (String x: zones)
		{
			System.out.println((++y) + ". " + x);
		}
	}
	
	public static void main(String[] a)
	{
		int option = 0, zoneId;
		long milliSeconds;
		
		DateAndTime dateAndTime = new DateAndTime();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		Scanner input = new Scanner(System.in);
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		ArrayList<String> zones = new ArrayList<>(zoneIds);
		
		Collections.sort(zones);
		logger.setLevel(Level.WARNING);
		logger.setUseParentHandlers(false);
		
		try 
		{
			logger.addHandler(new FileHandler("log_details.log"));
		} 
		catch (SecurityException | IOException e) 
		{
			logger.log(Level.WARNING, e.getMessage());
		}
		
		while (option != 7)
		{
			System.out.println("");
			System.out.println("1. Print Current Date and Time");
			System.out.println("2. Print Current Time in Milli seconds");
			System.out.println("3. Print Current time based on Time Zone");
			System.out.println("4. Print Week Day based on Time in Milli seconds");
			System.out.println("5. Print Month based on Time in Milli seconds");
			System.out.println("6. Print Year based on Time in Milli seconds");
			System.out.println("");
			System.out.println("Enter your Option: ");
			option = input.nextInt();
			input.nextLine();
			
			if (option == 1)
			{
				LocalDateTime dateTime = dateAndTime.getCurrentDateAndTime();
				System.out.println(formatter.format(dateTime));
				logger.info(formatter.format(dateTime));
			}
			
			else if (option == 2)
			{
				milliSeconds = dateAndTime.getTimeInMilliseconds();
//				LocalDateTime dateTime = dateAndTime.getCurrentDateAndTime();
//				System.out.println(dateTime.getHour() * 60 * 60 * 1000 + dateTime.getMinute() * 60 * 1000);
				System.out.println(milliSeconds);
//				System.out.println(ZoneId.systemDefault().getId());
//				logger.log(Level.INFO, ZoneId.systemDefault().getId()); 
			}
			
			else if (option == 3)
			{
				printZoneIds(zones);
				System.out.println("Enter Region Code: ");
				zoneId = input.nextInt();

				try 
				{
					ZonedDateTime dateTime = dateAndTime.getDateAndTimeInZone(zones.get(zoneId - 1));
					System.out.println("Date and Time in given Zone: " + dateTime);
//					logger.log(Level.INFO, "Date and Time in given Zone: " + dateTime);
				} 
				catch (InvalidInputException e) 
				{
//					System.out.println(e.getMessage());
					logger.log(Level.WARNING, e.getMessage());
				}
			}
			
			else if (option == 4)
			{
				int choice;
				System.out.println("Enter Time in MilliSeconds: ");
				milliSeconds = input.nextLong();
				input.nextLine();
				printZoneIds(zones);
				
				while (true)
				{
					System.out.println("Enter Region Code: ");
					zoneId = input.nextInt();				
	
					System.out.println("Week Day: " + dateAndTime.getDayOfTheWeek(milliSeconds,  zones.get(zoneId - 1)));
//				logger.log(Level.INFO, "Week Day: " + dateAndTime.getDayOfTheWeek(milliSeconds,  continent + "/" + region));

					choice = 2;
					while (true)
					{
						System.out.println("Do you want to Change Region Code (Enter 1 for Yes and 0 for Exit this Option: ");
						choice = input.nextInt();
						if (choice != 0 && choice != 1)
						{
							System.out.println("Invalid Choice !");
						}
						else
						{
							break;
						}
					}
					if (choice == 0)
					{
						break;
					}
					input.nextLine();
				}
				
			}
			
			else if (option == 5)
			{
				int choice;
				System.out.println("Enter Time in MilliSeconds: ");
				milliSeconds = input.nextLong();
				input.nextLine();
				printZoneIds(zones);
				
				while (true)
				{
					System.out.println("Enter Region Code: ");
					zoneId = input.nextInt();				
	
					System.out.println("Month: " + dateAndTime.getMonth(milliSeconds,  zones.get(zoneId - 1)));
					
					choice = 2;
					while (true)
					{
						System.out.println("Do you want to Change Region Code (Enter 1 for Yes and 0 for Exit this Option: ");
						choice = input.nextInt();
						if (choice != 0 && choice != 1)
						{
							System.out.println("Invalid Choice !");
						}
						else
						{
							break;
						}
					}
					if (choice == 0)
					{
						break;
					}
					input.nextLine();
				}
//				logger.log(Level.INFO, "Month: " + dateAndTime.getMonth(milliSeconds,  continent + "/" + region));
				
			}
			
			else if (option == 6)
			{
				int choice;
				System.out.println("Enter Time in MilliSeconds: ");
				milliSeconds = input.nextLong();
				input.nextLine();
				
				printZoneIds(zones);
				
				while (true)
				{
					System.out.println("Enter Region Code: ");
					zoneId = input.nextInt();				

					System.out.println("Year :" + dateAndTime.getYear(milliSeconds, zones.get(zoneId - 1)));
//				logger.log(Level.INFO, "Year :" + dateAndTime.getYear(milliSeconds, zones.get(zoneId)));
					choice = 2;
					while (true)
					{
						System.out.println("Do you want to Change Region Code (Enter 1 for Yes and 0 for Exit this Option: ");
						choice = input.nextInt();
						if (choice != 0 && choice != 1)
						{
							System.out.println("Invalid Choice !");
						}
						else
						{
							break;
						}
					}
					if (choice == 0)
					{
						break;
					}
					input.nextLine();
				}
				
			}
		}
		input.close();
	}
}