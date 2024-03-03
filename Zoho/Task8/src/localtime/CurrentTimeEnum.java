package localtime;

import java.time.LocalTime;

public enum CurrentTimeEnum
{
    INSTANCE;

    public LocalTime getCurrentTime() 
    {
        return LocalTime.now();
    }
}
