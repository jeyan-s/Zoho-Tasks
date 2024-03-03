package localtime;

import java.time.LocalTime;

public class CurrentTimeLazy
{
	private static CurrentTimeLazy instance = null;
	
	private CurrentTimeLazy() {}
	
	public static CurrentTimeLazy getInstance()
	{
		if (instance == null)
		{
			instance = new CurrentTimeLazy();
		}
		return instance;
	}

	public LocalTime getCurrentTime() 
    {
        return LocalTime.now();
    }
}