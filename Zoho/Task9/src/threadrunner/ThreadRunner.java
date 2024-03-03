package threadrunner;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Scanner;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;

import extendedthread.ExtendedThread;
import extendedthreadmodified.ExtendedThreadModified;
import formatter.LogFormatter;
import runnablethread.RunnableThread;
import runnablethreadmodified.RunnableThreadModified;




public class ThreadRunner 
{
	private static void logDump()
	{
		Logger logger = Logger.getLogger("ThreadDumper");
    	logger.setLevel(Level.INFO);
    	logger.setUseParentHandlers(false);
    	
    	try 
		{
    		FileHandler file = new FileHandler("thread_dumps.log");
        	file.setFormatter(new LogFormatter());
			logger.addHandler(file);
		} 
		catch (SecurityException | IOException e) 
		{
			logger.log(Level.WARNING, e.getMessage());
		}
    	
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(true, true);
        
        for (ThreadInfo info: threadInfos)
        {
        	logger.info(info.toString());
        }
	}
	
    public static void main(String[] args) 
    {
    	int option = 0;
    	Thread runnableThread;
//		ScheduledExecutorService sheduler = Executors.newScheduledThreadPool(1);
    	Scanner input = new Scanner(System.in);
    	Logger logger = Logger.getLogger("ThreadRunner");
    	logger.setLevel(Level.INFO);
    	logger.setUseParentHandlers(false);
    	
    	try 
		{
        	FileHandler file = new FileHandler("main_thread.log");
        	file.setFormatter(new LogFormatter());
			logger.addHandler(file);
		} 
		catch (SecurityException | IOException e) 
		{
			logger.log(Level.WARNING, e.getMessage());
		}
    	
    	while (option != 8)
    	{
			System.out.println("Enter your Choice: ");
			System.out.println("");
			option = input.nextInt();
			input.nextLine();
			
    		if (option == 1)
    		{
    			logger.info("Before starting the thread:");
    			logger.info("Current thread name: " + Thread.currentThread().getName());
    			logger.info("Current thread priority: " + Thread.currentThread().getPriority());
    			logger.info("Current thread state: " + Thread.currentThread().getState());
    			System.out.println("");
		
		        ExtendedThread extendedThread = new ExtendedThread();
		        extendedThread.start();
				System.out.println("");

				logger.info("\nAfter starting the thread:");
				logger.info("Current thread name: " + Thread.currentThread().getName());
				logger.info("Current thread priority: " + Thread.currentThread().getPriority());
				logger.info("Current thread state: " + Thread.currentThread().getState());
				System.out.println("");
    		}
    		
    		else if (option == 2)
    		{
    			logger.info("Before starting the thread:");
    			logger.info("Current thread name: " + Thread.currentThread().getName());
    	        logger.info("Current thread priority: " + Thread.currentThread().getPriority());
    	        logger.info("Current thread state: " + Thread.currentThread().getState());
				System.out.println("");

    	        runnableThread = new Thread(new RunnableThread());
    	        runnableThread.start();
				System.out.println("");

				logger.info("\nAfter starting the thread:");
    	        logger.info("Current thread name: " + Thread.currentThread().getName());
    	        logger.info("Current thread priority: " + Thread.currentThread().getPriority());
    	        logger.info("Current thread state: " + Thread.currentThread().getState());
				System.out.println("");
    		}
    		
    		else if (option == 3)
    		{
    			logger.info("Before starting the ExtendedThread:");
    			logger.info("Current thread name: " + Thread.currentThread().getName());
		        logger.info("Current thread priority: " + Thread.currentThread().getPriority());
		        logger.info("Current thread state: " + Thread.currentThread().getState());
				System.out.println("");

		        ExtendedThread extendedThread = new ExtendedThread();
		        extendedThread.setName("ExtendedThread");
		        extendedThread.start();
				System.out.println("");

				logger.info("\nAfter starting the ExtendedThread:");
		        logger.info("Current thread name: " + Thread.currentThread().getName());
		        logger.info("Current thread priority: " + Thread.currentThread().getPriority());
		        logger.info("Current thread state: " + Thread.currentThread().getState());
				System.out.println("");

				logger.info("\nBefore starting the RunnableThread:");
		        logger.info("Current thread name: " + Thread.currentThread().getName());
		        logger.info("Current thread priority: " + Thread.currentThread().getPriority());
		        logger.info("Current thread state: " + Thread.currentThread().getState());
				System.out.println("");

		        runnableThread = new Thread(new RunnableThread());
		        runnableThread.setName("RunnableThread");
		        runnableThread.start();
				System.out.println("");

				logger.info("\nAfter starting the RunnableThread:");
				logger.info("Current thread name: " + Thread.currentThread().getName());
				logger.info("Current thread priority: " + Thread.currentThread().getPriority());
				logger.info("Current thread state: " + Thread.currentThread().getState());
				System.out.println("");
    		}
    		
    		else if (option >= 4 && option <= 7)
    		{
				System.out.println("Enter the number of Threads to be created: ");
				int count = input.nextInt(), seconds;
				ExtendedThreadModified[] extended = new ExtendedThreadModified[count];
				RunnableThreadModified[] runnable = new RunnableThreadModified[count];
				Thread[] threads = new Thread[count];
				input.nextLine();
				
    			for (int x = 1; x <= count; x++) 
    			{
    				System.out.println("Enter the Time to sleep (ExtendedThread" + x + ") (Millis): ");
    				seconds = input.nextInt();
    				
    				ExtendedThreadModified extendedThreadModified = new ExtendedThreadModified(seconds);
    	            extendedThreadModified.setName("ExtendedThreadModified" + x);
    	            extendedThreadModified.start();
    	            extended[x - 1] = extendedThreadModified;

    				System.out.println("Enter the Time to sleep (RunnableThread" + x + ") (Millis): ");
    				seconds = input.nextInt();
    				
    				runnable[x - 1] = new RunnableThreadModified(seconds);
    	            Thread runnableThreadModified = new Thread(runnable[x - 1]);
    	            runnableThreadModified.setName("RunnableThreadModified" + x);
    	            runnableThreadModified.start();
    	            threads[x - 1] = runnableThreadModified;
    	        }
    			
    			long initialDelay, delay, stopDifference;
    			int dumps;
    			
    			System.out.println("Enter initial Delay for Thread Dump(Millis): ");
    			initialDelay = input.nextLong();
    			
    			System.out.println("Enter Interval gap for Thread Dump(Millis): ");
    			delay = input.nextLong();
    			
    			System.out.println("Enter Number of Thread Dump to be taken: ");
    			dumps = input.nextInt();
    			
    			System.out.println("Enter Time Difference between two Stops(Millis): ");
    			stopDifference = input.nextLong();
    			input.nextLine();
    			
    			try
    			{
    				Thread.sleep(initialDelay);
    			}
    			catch (Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    			
    			for (int x = 0; x < dumps; x++)
    			{
    				logDump();
    				try
        			{
        				Thread.sleep(delay);
        			}
        			catch (Exception e)
        			{
        				System.out.println(e.getMessage());
        			}
    			}			
    			
    			for (ExtendedThreadModified x: extended)
    			{
    				try
        			{
        				Thread.sleep(stopDifference);
        			}
        			catch (Exception e)
        			{
        				System.out.println(e.getMessage());
        			}
    				x.setCondition(false);
    			}
    			
    			for (RunnableThreadModified x: runnable)
    			{
    				try
        			{
        				Thread.sleep(stopDifference);
        			}
        			catch (Exception e)
        			{
        				System.out.println(e.getMessage());
        			}
    				x.setCondition(false);
    			}
    			
    			boolean alive = false;
    			
    			for (ExtendedThreadModified x: extended)
    			{
    				alive |= x.isAlive();
    			}
    			
    			for (Thread x: threads)
    			{
    				alive |= x.isAlive();
    			}
    			
    			if (!alive)
    			{
    				System.out.println("Tasks Completed !!");
    			}
    			
    			System.out.println("Enter initial Delay for Thread Dump(Millis): ");
    			initialDelay = input.nextLong();
    			
    			System.out.println("Enter Interval gap for Thread Dump(Millis): ");
    			delay = input.nextLong();
    			
    			System.out.println("Enter Number of Thread Dump to be taken: ");
    			dumps = input.nextInt();
    			
    			try
    			{
    				Thread.sleep(initialDelay);
    			}
    			catch (Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    			
    			for (int x = 0; x < dumps; x++)
    			{
    				logDump();
    				try
        			{
        				Thread.sleep(delay);
        			}
        			catch (Exception e)
        			{
        				System.out.println(e.getMessage());
        			}
    			}
    		}
    		
    		else if (option == 8)
    		{
    			System.exit(0);
    		}
    		
    		else
    		{
    			System.out.println("Invalid Choice !");
    		}
    	}
    	input.close();
    }
}