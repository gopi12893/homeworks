package immutable;

public class Time 
{
	private int hr;
	private int min;

	public Time(int x, int y)
	{
		hr = x;
		min = y;
	}

	public Time newTime(int newHour)
	{
		return new Time(newHour, min);
	}
	public String toString()
	{
	return hr + ":" + min;	
	}

}
