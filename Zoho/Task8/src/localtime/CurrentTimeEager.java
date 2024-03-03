package localtime;

import java.time.LocalTime;

public class CurrentTimeEager
{
	private static final CurrentTimeEager instance = new CurrentTimeEager();
	
	private CurrentTimeEager() {}
	
	public static CurrentTimeEager getInstance()
	{
		return instance;
	}
	
	public LocalTime getCurrentTime() 
    {
        return LocalTime.now();
    }
}