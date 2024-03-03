package stringbuildermethods;

import exceptions.InvalidInputException;
import utilitymethods.Utility;

public class StringBuilderMethods
{
	public StringBuilder createStringBuilder(String string)  throws InvalidInputException
	{
		Utility.checkNull(string);
		return new StringBuilder(string);
	}
	
	public int getLength(StringBuilder strBuilder) throws InvalidInputException
	{
		Utility.checkNull(strBuilder);
		return strBuilder.length();
	}
	
	public String getString(StringBuilder strBuilder) throws InvalidInputException
	{
		Utility.checkNull(strBuilder);
		return strBuilder.toString();
	}
	
	private int getActualPosition(StringBuilder strBuilder, int position, String string) 
	{
		int actualPosition = 0;
		while (actualPosition != -1)
		{
			if (position-- == 0)
			{
				break;
			}
			actualPosition = strBuilder.indexOf(string, actualPosition + 1);
		}
		return position;
	}
	
	public StringBuilder addString(StringBuilder strBuilder, String string) throws InvalidInputException
	{
		Utility.checkNull(strBuilder);
		Utility.checkNull(string);
		return strBuilder.append(string);
	}
	
	public StringBuilder addStringsBySeparator(StringBuilder strBuilder, String[] strings, String separator) throws InvalidInputException
	{
		Utility.checkNull(strings);
		Utility.checkNull(separator);
		addString(strBuilder, strings[0]);
		for (int x = 1; x < strings.length; x++)
		{
			addString(strBuilder, separator);
			addString(strBuilder, strings[x]);
		}
		return strBuilder;
	}
	
	public StringBuilder insertString(StringBuilder strBuilder, int position, String string, String separator) throws InvalidInputException
	{
		Utility.checkNull(string);
		Utility.checkNull(separator);
		int builderLength = getLength(strBuilder);
		Utility.checkRequiredLength(position, builderLength + 1);
		
		int actualPosition = getActualPosition(strBuilder, position, string);
		if (actualPosition == -1) 
		{
			throw new InvalidInputException("String index Out Of Bounds!");
		}
		
		actualPosition += separator.length() + 1;
		strBuilder.insert(actualPosition, string);
		strBuilder.insert(actualPosition + string.length(), separator);
		return strBuilder;
	}
	
	public StringBuilder deleteSubString(StringBuilder strBuilder, int start, int end) throws InvalidInputException
	{
		int builderLength = getLength(strBuilder);
		Utility.checkRequiredLength(end, builderLength + 1);
		Utility.checkRequiredLength(start, end);
		strBuilder.delete(start, end);
		return strBuilder;
	}
	
	public StringBuilder replaceCharacter(StringBuilder strBuilder, char toBeReplaced, char replacedBy) throws InvalidInputException
	{
		int builderLength = getLength(strBuilder);
		for (int x = 0; x < builderLength; x++)
		{
			if (strBuilder.charAt(x) == toBeReplaced)
			{
				strBuilder.setCharAt(x, replacedBy);
			}
		}
		return strBuilder;
	}
	
	public StringBuilder reverse(StringBuilder strBuilder) throws InvalidInputException
	{
		Utility.checkNull(strBuilder);
		strBuilder.reverse();
		return strBuilder;
	}
	
	public StringBuilder replaceSubString(StringBuilder strBuilder, String string, int start, int end) throws InvalidInputException
	{
		Utility.checkNull(string);
		int builderLength = getLength(strBuilder);
		Utility.checkRequiredLength(end, builderLength + 1);
		Utility.checkRequiredLength(start, end);
		strBuilder.replace(start, end, string);
		return strBuilder;
	}
	
	public int firstIndex(StringBuilder strBuilder, String string) throws InvalidInputException
	{
		Utility.checkNull(strBuilder);
		Utility.checkNull(string);
		return strBuilder.indexOf(string);
	}
	
	public int lastIndex(StringBuilder strBuilder, String string) throws InvalidInputException
	{
		Utility.checkNull(strBuilder);
		Utility.checkNull(string);
		return strBuilder.lastIndexOf(string);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
