package localtime;

public class CurrentTimeSynchronized 
{
    private static volatile CurrentTimeSynchronized instance;

    private CurrentTimeSynchronized() {}

    public static CurrentTimeSynchronized getInstance() 
    {
        if (instance == null) 
        {
            synchronized (CurrentTimeSynchronized.class) 
            {
                if (instance == null) 
                {
                    instance = new CurrentTimeSynchronized();
                }
            }
        }
        return instance;
    }
}
