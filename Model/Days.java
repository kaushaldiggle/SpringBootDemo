package com.example.demo.Model;

import org.springframework.stereotype.Component;
import com.example.demo.Utills.CommonUtills;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Days {
	
	public enum Day{
	
		MONDAY("Monday"),TUESDAY("Tuesday"),WEDNESDAY("Wednesday"),THURSDAY("Thursday"),FRIDAY("Friday"),SATURDAY("Saturday"),SUNDAY("Sunday");
		private String day;
		Day(String day){
			this.day=day;
		}
		public String getDay() {
			return day;
		}
	}
	
	
	@JsonProperty("day")
	private String stringProperty;
	
	@JsonProperty("urlParameter")
	private Boolean optionalProperty;
		
	@JsonProperty("dateTime")
	private long dateTime;
	

	public void initiateDate(long dateTime, boolean optionalParameter,int dateIndex) {
		// TODO Auto-generated method stubs
		dateTime=CommonUtills.getNextDate(dateTime,dateIndex);
		this.stringProperty=++dateIndex+". "+CommonUtills.getDay(dateTime);
		this.optionalProperty=optionalParameter;
		this.dateTime=dateTime;
	}
	
	

}
