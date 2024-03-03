package localtime;

import java.io.Serializable;
import java.time.LocalTime;

public class CurrentTimeInnerClass implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;

	private CurrentTimeInnerClass() {}

    private static class SingletonClass 
    {
        private static final CurrentTimeInnerClass INSTANCE = new CurrentTimeInnerClass();
    }

    public static CurrentTimeInnerClass getInstance() 
    {
        return SingletonClass.INSTANCE;
    }
    
    public LocalTime getCurrentTime() 
    {
        return LocalTime.now();
    }
    
    private Object readResolve()
    {
    	return getInstance();
    }
    
    protected Object clone() throws CloneNotSupportedException
    {
    	throw new CloneNotSupportedException("Does not Support Cloning");
    }
}
