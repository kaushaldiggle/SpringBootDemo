package com.example.demo.Model;

import java.util.Date;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonBackReference;



@Component
public class Week {
	
	
	@JsonBackReference
	private Days[] weekDays;
	

	public void build(boolean optionalParameter) {
			final long dateTime=(new Date()).getTime();
			System.out.println(dateTime);
			for(int i=0;i<7;i++) {
				this.weekDays[i].initiateDate(dateTime,optionalParameter,i);
			}	
	}
	

	public Days[] getWeek() {
		return this.weekDays;
	}

	public Week setWeek(boolean optionalParameter) {
		if(weekDays==null) {
			weekDays=new Days[7];
			for(int i=0;i<7;i++)
			{
				weekDays[i]=new Days();
			}
			this.build(optionalParameter);
		}	
		return this;
	}
	
	public Week setWeek(Days[] days) {
		//TO DO to process the date from frontend if require
		this.weekDays=days;
		return this;
	}
	
}
