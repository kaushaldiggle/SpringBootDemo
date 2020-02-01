package com.example.demo.services.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Days;
import com.example.demo.Model.Week;
import com.example.demo.services.factory.IWeekDays;

@Component
public class WeekDays implements IWeekDays{
	
	
	@Autowired
	Week week2;
	
	@Override
	public Days[] getWeekDays(boolean optionalParameter) {
		return week2.setWeek(optionalParameter).getWeek();//.getWeek();
	}
	
	@Override
    public Days[] postWeekDays(Days[] days) {
    	return week2.setWeek(days).getWeek();
	}

}
