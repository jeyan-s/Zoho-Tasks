package extendedthreadmodified;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import formatter.LogFormatter;

public class ExtendedThreadModified extends Thread
{
	private int seconds;
	private boolean condition = true;
	private Logger logger = Logger.getLogger("ExtendedThreadModified");
	
	public ExtendedThreadModified(int seconds)
	{
		this.seconds = seconds;
		logger.setLevel(Level.INFO);
		logger.setUseParentHandlers(false);
		
    	try 
		{
    		FileHandler file = new FileHandler("extended_thread_modified.log");
    		file.setFormatter(new LogFormatter());
			logger.addHandler(file);
		} 
		catch (SecurityException | IOException e) 
		{
			logger.log(Level.WARNING, e.getMessage());
		}
	}
	
	public void setCondition(boolean condition)
	{
		this.condition = condition;
	}
	
	public void run()
	{
		while (this.condition)
		{
			logger.log(Level.INFO, "Going to Sleep: " + Thread.currentThread().getName());
	        try 
	        {
	            Thread.sleep(this.seconds);
	        } 
	        catch (InterruptedException e) 
	        {
	            System.out.println(e.getMessage());
	        }
	        logger.log(Level.INFO, "After sleeping: " + Thread.currentThread().getName());
		}
		System.out.println("Exiting: " + Thread.currentThread().getName());
	}
}