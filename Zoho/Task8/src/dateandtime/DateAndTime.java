package dateandtime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import exceptions.InvalidInputException;
import utilitymethods.Utility;

public class DateAndTime
{
	public LocalDateTime getCurrentDateAndTime()
	{
		return LocalDateTime.now();
	}
	
	public long getTimeInMilliseconds()
	{
		return System.currentTimeMillis();
	}
	
	public ZonedDateTime getDateAndTimeInZone(String zone) throws InvalidInputException
	{
		Utility.checkNull(zone);
		ZoneId zoneId = ZoneId.of(zone);
		return ZonedDateTime.now(zoneId);
	}
	
	public ZonedDateTime getDateTimeInstant(long milliSeconds, String zone)
	{
		Instant instant = Instant.ofEpochMilli(milliSeconds);
		ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, ZoneId.of(zone));
		return dateTime;
	}
	
	public ZonedDateTime getDateTimeInstant1(long milliSeconds)
	{
		Instant instant = Instant.ofEpochMilli(milliSeconds);
		ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
		return dateTime;
	}
	
	public DayOfWeek getDayOfTheWeek(long milliSeconds, String zone)
	{
		ZonedDateTime dateTime = getDateTimeInstant(milliSeconds, zone);
		return dateTime.getDayOfWeek();
	}
	
	public Month getMonth(long milliSeconds, String zone)
	{
		ZonedDateTime dateTime = getDateTimeInstant(milliSeconds, zone);
		return dateTime.getMonth();
	}
	
	public int getYear(long milliSeconds, String zone)
	{
		ZonedDateTime dateTime = getDateTimeInstant(milliSeconds, zone);
		return dateTime.getYear();
	}
}