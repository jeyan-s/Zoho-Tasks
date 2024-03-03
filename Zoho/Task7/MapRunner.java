package maprunner;

import java.util.Map;
import java.util.Scanner;
import pet.Pet;
import mapmethods.MapMethods;
import exceptions.InvalidInputException;

public class MapRunner
{
	public static void main(String[] a)
	{
		int option = 0, pairs;
		MapMethods mapMethods = new MapMethods();
		Scanner input = new Scanner(System.in);
		
		while (option != 21)
		{
			System.out.println("1. Create a HashMap");
			System.out.println("2. Add Keys(String) and Values(String) in a HashMap");
			System.out.println("3. Add Keys(Integer) and Values(Integer) in a HashMap");
			System.out.println("4. Add Keys(String) and Values(Integer) in a HashMap");
			System.out.println("5. Add Keys(String) and Values(Object) in a HashMap");
			System.out.println("6. Add Keys(String) and Values(Null) in a HashMap");
			System.out.println("7. Add a Null Key and Non-Null Value in a HashMap");
			System.out.println("8. Check if a key exists in a HashMap");
			System.out.println("9. Check if a Value exists in a HashMap");
			System.out.println("10. Update a Value to all Keys in a HashMap");
			System.out.println("11. Get the value of an existing key in a HashMap");
			System.out.println("12. Get the value of a non-existing key in a HashMap");
			System.out.println("13. Get 'Zoho' if the key does not exist in a HashMap");
			System.out.println("14. Remove an existing key in a HashMap");
			System.out.println("15. Remove an existing key if the value matches");
			System.out.println("16. Replace the value of an existing key in a HashMap");
			System.out.println("17. Replace the value of an existing key if the value matches in a HashMap");
			System.out.println("18. Transfer all Keys and Values to another HashMap");
			System.out.println("19. Print all Keys and Values in a HashMap");
			System.out.println("20. Remove all entries in a HashMap");
			
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("Enter your Option: ");
			option = input.nextInt();
			input.nextLine();
			System.out.println("");
			
			if (option == 1)
			{
				try
				{
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));			
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 2)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 3)
			{
				try
				{
					int key, value;
					Map<Integer, Integer> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextInt();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextInt();
						input.nextLine();		
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
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
					String key;
					int value;
					Map<String, Integer> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextInt();
						input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 5)
			{
				try
				{
					String key;
					Pet value;
					Map<String, Pet> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						value = new Pet("Cat " + String.valueOf(x));
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 6)
			{
				try
				{
					String key;
					Pet value;
					Map<String, Pet> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						value = null;
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 7)
			{
				try
				{
					String key = null, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Value for Null key: ");
					value = input.nextLine();	
					mapMethods.addPairs(hash, key, value);
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 8)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Key to check if it is Present: ");
					key = input.nextLine();	
					
					
					System.out.println("Key Exists :" + mapMethods.isKeyPresent(hash, key));
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
				
			else if (option == 9)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Value to check if it is Present: ");
					value = input.nextLine();	
					
					
					System.out.println("Value Exists :" + mapMethods.isValuePresent(hash, value));
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 10)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Value to be Updated to all Keys: ");
					value = input.nextLine();	
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
					
					System.out.println("After Updation");
					mapMethods.updateAll(hash, value);
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			
			else if (option == 11 || option == 12)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Key to get its value: ");
					key = input.nextLine();	
					
					
					System.out.println("Value:" + mapMethods.getValue(hash, key));
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			
			else if (option == 13)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Key to get its value: ");
					key = input.nextLine();	
					
					System.out.println("Enter Default Value to get when a Key is not Present: ");
					value = input.nextLine();	
					
					
					System.out.println("Value: " + mapMethods.getValueOrDefault(hash, key, value));
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 14)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Key to remove: ");
					key = input.nextLine();	
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
					
					System.out.println("After Updation");
					mapMethods.removeKey(hash, key);
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 15)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Key to remove: ");
					key = input.nextLine();	
					
					System.out.println("Enter Matching Value to remove: ");
					value = input.nextLine();	
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
					
					System.out.println("After Updation");
					mapMethods.removeKeyValue(hash, key, value);
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 16)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Key to be replaced: ");
					key = input.nextLine();	
					
					System.out.println("Enter Value to be updated: ");
					value = input.nextLine();	
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
					
					System.out.println("After Updation");
					mapMethods.replaceValue(hash, key, value);
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 17)
			{
				try
				{
					String key, value, newValue;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");
					
					System.out.println("Enter Key to be replaced: ");
					key = input.nextLine();	
					
					System.out.println("Enter Value to be replaced: ");
					value = input.nextLine();	
					
					System.out.println("Enter New Value to be updated: ");
					newValue = input.nextLine();	
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
					
					System.out.println("After Updation");
					mapMethods.replaceKeyValue(hash, key, value, newValue);
					
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 18)
			{
				try
				{
					String key, value;
					Map<String, String> hash1 = mapMethods.createMap();
					Map<String, String> hash2 = mapMethods.createMap();
					System.out.println("Hash Map 1 Created !");	
					System.out.println("Hash Map 2 Created !");	
					
					System.out.println("Enter Number of Pairs to be Added in Hash 1: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash1, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap 1: " + hash1);	
					System.out.println("Size: " + mapMethods.getSize(hash1));	
					
					System.out.println("HashMap 2: " + hash2);	
					System.out.println("Size: " + mapMethods.getSize(hash2));	
					
					
					System.out.println("After Transfer");
					mapMethods.copyMap(hash1, hash2);
					mapMethods.clearMap(hash1);
					
					System.out.println("HashMap 1: " + hash1);	
					System.out.println("Size: " + mapMethods.getSize(hash1));	
					
					System.out.println("HashMap 2: " + hash2);	
					System.out.println("Size: " + mapMethods.getSize(hash2));	
						
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 19)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));	
					
					
					System.out.println("Entries of HashMap !");
					
					for (Map.Entry<String, String> x: hash.entrySet())
					{
						System.out.println(x.getKey() + ": " + x.getValue());
					}	
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 20)
			{
				try
				{
					String key, value;
					Map<String, String> hash = mapMethods.createMap();
					System.out.println("Hash Map Created !");	
					
					System.out.println("Enter Number of Pairs to be Added: ");	
					pairs = input.nextInt();
					input.nextLine();
					
					for (int x = 0; x < pairs; x++)
					{
						System.out.println("Enter Key " + x + ": ");
						key = input.nextLine();	
						System.out.println("Enter Value " + x + ": ");
						value = input.nextLine();	
						mapMethods.addPairs(hash, key, value);
					}
					
					System.out.println("Pairs Added Successfully !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));
					mapMethods.clearMap(hash);
					
					System.out.println("After Clearing HashMap !");	
					System.out.println("HashMap: " + hash);	
					System.out.println("Size: " + mapMethods.getSize(hash));
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			else if (option == 21)
			{
				System.exit(0);
			}
			
			else
			{
				System.out.println("Invalid option !");
			}
		}
	}
}
