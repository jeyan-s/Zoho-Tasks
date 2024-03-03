package propertiesmethods;

import java.util.Properties;
import java.io.FileWriter;
import java.io.IOException;
import exceptions.InvalidInputException;
import utilitymethods.Utility;
import filemethods.FileMethods;

public class PropertiesMethods
{
	public String getProperty(Properties property, String key) throws InvalidInputException
	{
		Utility.checkNull(property);
		return property.getProperty(key);
	}
	
	public void setProperty(Properties property, String key, String value) throws InvalidInputException
	{
		Utility.checkNull(property);
		property.setProperty(key, value);
	}
	
	public void storeProperties(Properties property, String filePath) throws IOException, InvalidInputException
	{
		Utility.checkNull(property);
		Utility.checkNull(filePath);
		property.store(new FileWriter(filePath), null);
	}
}