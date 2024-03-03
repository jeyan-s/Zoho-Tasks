package filemethods; 

import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import exceptions.InvalidInputException;
import utilitymethods.Utility;

public class FileMethods 
{
    private FileWriter createFileWriter(String filePath, boolean append) throws IOException, InvalidInputException
    {
    	Utility.checkNull(filePath);
        return new FileWriter(filePath, append);
    }
    
    private FileReader createFileReader(String filePath) throws IOException, InvalidInputException
    {
    	Utility.checkNull(filePath);
        return new FileReader(filePath);
    }

    public void writeContent(String filePath, String[] data) throws InvalidInputException
    {	
    	try (FileWriter file = createFileWriter(filePath, true))
    	{
    		for (String str : data) 
    		{
                file.write(str);
                file.write(System.lineSeparator());
            }
    	}
    	catch (InvalidInputException | IOException e)
    	{
    		throw new InvalidInputException(e.getMessage(), e);
    	}
    }
    
    public Properties createProperty()
    {
    	return new Properties();
    }
    
    public void setProperty(Properties property, String key, String value) throws InvalidInputException
	{
		Utility.checkNull(property);
		Utility.checkNull(key);
		Utility.checkNull(value);
		property.setProperty(key, value);
	}
    
    public void storeProperties(String filePath, Properties property) throws IOException, InvalidInputException
	{
		Utility.checkNull(property);
		try (FileWriter fileWriter = createFileWriter(filePath, true))
		{
			property.store(fileWriter, null);
		}
		catch (InvalidInputException | IOException e)
    	{
    		throw new InvalidInputException(e.getMessage(), e);
    	}
	}
    
    public void loadProperties(Properties property, String filePath) throws  InvalidInputException
	{
		Utility.checkNull(property);
		try (FileReader fileReader = createFileReader(filePath))
		{
			property.load(fileReader);
		}
		catch (InvalidInputException | IOException e)
    	{
    		throw new InvalidInputException(e.getMessage(), e);
    	}
	}
    
    public boolean makeDirectories(String dirPath) throws InvalidInputException, IOException
    {
    	Utility.checkNull(dirPath);
        File file = new File(dirPath);
        return file.mkdirs();
    }
    
}
