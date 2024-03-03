package runnablethread;

import java.io.IOException;
import formatter.LogFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableThread implements Runnable 
{
	private Logger logger = Logger.getLogger("RunnableThread");
	
	public RunnableThread()
	{
		logger.setLevel(Level.INFO);
		logger.setUseParentHandlers(false);

		try 
		{
			FileHandler file = new FileHandler("runnable_thread.log");
			file.setFormatter(new LogFormatter());
			logger.addHandler(file);
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