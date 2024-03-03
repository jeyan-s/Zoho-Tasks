package extendedthread;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import formatter.LogFormatter;

public class ExtendedThread extends Thread 
{
	private Logger logger = Logger.getLogger("ExtendedThread");
	
	public ExtendedThread()
	{
		logger.setLevel(Level.INFO);
		logger.setUseParentHandlers(false);
		
		try 
		{
			FileHandler file = new FileHandler("extended_thread.log");
			logger.addHandler(file);
        	file.setFormatter(new LogFormatter());
		} 
		catch (SecurityException | IOException e) 
		{
			logger.log(Level.WARNING, e.getMessage());
		}
	}
	
    public void run() 
    {
        logger.log(Level.INFO, "Thread name: " + Thread.currentThread().getName());
        logger.log(Level.INFO, "Thread priority: " + Thread.currentThread().getPriority());
        logger.log(Level.INFO, "Thread state: " + Thread.currentThread().getState());
    }
}