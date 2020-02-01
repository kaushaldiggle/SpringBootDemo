package com.example.demo.Utills;

import java.util.Calendar;
import java.util.Date;

import com.example.demo.Model.Days;
import com.example.demo.Model.Days.Day;

public class CommonUtills {

	static final Long OneDayduration=(long) (24*60*60*1000);
	
	public static String getDay(long dateTime) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(dateTime);
		switch(cal.get(Calendar.DAY_OF_WEEK))
		{
			case Calendar.SUNDAY:
				return Days.Day.SUNDAY.getDay();
			case Calendar.MONDAY:
				return Days.Day.MONDAY.getDay();
			case Calendar.TUESDAY:
				return Days.Day.TUESDAY.getDay();
			case Calendar.WEDNESDAY:
				return Days.Day.WEDNESDAY.getDay();
			case Calendar.THURSDAY:
				return Days.Day.THURSDAY.getDay();
			case Calendar.FRIDAY:
				return Days.Day.FRIDAY.getDay();
			case Calendar.SATURDAY:
				return Days.Day.SATURDAY.getDay();

		}
		return null;
		
	}

	public static long getNextDate(long dateTime,int noOfDays) {
		return dateTime+OneDayduration*noOfDays;
	}
	
}
