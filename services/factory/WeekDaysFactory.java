package com.example.demo.services.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class WeekDaysFactory {
	
	public enum Version{
		V1,V2;
	}
	@Autowired
	com.example.demo.services.v1.WeekDays weeksDaysV1;
	
	public IWeekDays getWeekDaysServiceByVersion(Version version) {
		
		if(version==Version.V1)
			return weeksDaysV1;
		else
			return null;
		
	}

}
