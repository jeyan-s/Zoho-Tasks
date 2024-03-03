package regexmethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidInputException;
import utilitymethods.Utility;

public class RegExMethods
{
	private static Pattern mobile;
	private static Pattern alphaNumeric;
	private static Pattern htmlTag;
	private static Pattern email;
	private static Pattern password;
	
	public RegExMethods()
	{
		mobile = Pattern.compile("^[7-9][\\d]{9}$");
		alphaNumeric = Pattern.compile("^[\\w]+$");
		htmlTag = Pattern.compile("<[^>]+>");
		email = Pattern.compile("^[\\w\\._-]+@[\\w-]+\\.[A-Za-z.]{2,18}$");
		password = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=\\S+).{8,}$");
	}
	
	private boolean matchPattern(List<String> strings, Pattern pattern) throws InvalidInputException
	{
		Utility.checkNull(strings);
		for (String x: strings)
		{
			Utility.checkNull(x);
			if (!(pattern.matcher(x).matches()))
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidPassword(String string) throws InvalidInputException
	{
		Utility.checkNull(string);
		return password.matcher(string).matches();
	}
	
	public boolean isValidEmail(String string) throws InvalidInputException
	{
		Utility.checkNull(string);
		return email.matcher(string).matches();
	}
	
	public boolean isValidMobileNumber(String string) throws InvalidInputException
	{
		Utility.checkNull(string);
		return mobile.matcher(string).matches();
	}
	
	public boolean isAlphaNumeric(String string) throws InvalidInputException
	{
		Utility.checkNull(string);
		return alphaNumeric.matcher(string).matches();
	}
	
	public boolean isStartsWith(String string, String pattern) throws InvalidInputException
	{
		Utility.checkNull(string);
		Utility.checkNull(pattern);
		Pattern randomPattern = Pattern.compile("^" + pattern);
		return randomPattern.matcher(string).find();
	}
	
	public boolean isPresent(String string, String pattern) throws InvalidInputException
	{
		Utility.checkNull(string);
		Utility.checkNull(pattern);
		Pattern randomPattern = Pattern.compile(pattern);
		return randomPattern.matcher(string).find();
	}
	
	public boolean isEndsWith(String string, String pattern) throws InvalidInputException
	{
		Utility.checkNull(string);
		Utility.checkNull(pattern);
		Pattern randomPattern = Pattern.compile(pattern + "$");
		return randomPattern.matcher(string).find();
	}
	
	public boolean isExactMatch(String string, String pattern) throws InvalidInputException
	{
		Utility.checkNull(string);
		Utility.checkNull(pattern);
		Pattern randomPattern = Pattern.compile("^" + pattern + "$");
		return randomPattern.matcher(string).find();
	}
	
	public boolean isListContainsIgnoreCase(List<String> strings, String pattern) throws InvalidInputException
	{
		Utility.checkNull(pattern);
		Pattern randomPattern = Pattern.compile("^" + pattern + "$", Pattern.CASE_INSENSITIVE);
		return matchPattern(strings, randomPattern);
	}
	
	public boolean isStringsLengthInRange(List<String> strings, int low, int high) throws InvalidInputException
	{
		Pattern randomPattern = Pattern.compile(String.format("^.{%d,%d}$", low, high));
		return matchPattern(strings, randomPattern);
	}
	
	public Map<String, List<Integer>> mapMatchingStrings(List<String> strings, List<String> patterns) throws InvalidInputException
	{
		Utility.checkNull(strings);
		Utility.checkNull(patterns);
		Map<String, List<Integer>> result = new HashMap<String, List<Integer>>();
		int size = strings.size();
		
		for (String pattern: patterns)
		{
			for (int x = 0; x < size; x++)
			{
				if (isExactMatch(strings.get(x), pattern))
				{
					if (result.containsKey(pattern))
					{
						result.get(pattern).add(x);
					}
					else
					{
						List<Integer> value = new ArrayList<>();
						value.add(x);
						result.put(pattern, value);
					}
				}
			}
		}
		
		return result;
	}
	
	public List<String> getHtmlTags(String string) throws InvalidInputException
	{
		Utility.checkNull(string);
		List<String> tags = new ArrayList<>();
		Matcher matcher = htmlTag.matcher(string);
		
		while (matcher.find())
		{
			tags.add(matcher.group());
		}
		
		return tags;
	}
}