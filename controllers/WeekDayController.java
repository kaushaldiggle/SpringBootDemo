package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Days;
import com.example.demo.services.factory.WeekDaysFactory;
import com.example.demo.services.factory.WeekDaysFactory.Version;

@RestController
@RequestMapping("/api/")
public class WeekDayController {
	
	@Autowired
	WeekDaysFactory weekDaysFactory;
	
	
	@GetMapping(value={"v1/weekday/{optionalParam}","v1/weekday"},
			produces= {"application/json;charset=UTF-8"})
	public Days[] getWeekDay(@PathVariable(name = "optionalParam" ,required = false) String optionalParam ){
		boolean optionalParameter=false;
		if(optionalParam!=null)
			optionalParameter=true;
		return weekDaysFactory.getWeekDaysServiceByVersion(Version.V1).getWeekDays(optionalParameter);
	}
	
	@PostMapping(value="v1/weekday",
			consumes= {"application/json;charset=UTF-8"},
			produces= {"application/json;charset=UTF-8"})
	public Days[] postWeekDay(@RequestBody Days[] days){
		return weekDaysFactory.getWeekDaysServiceByVersion(Version.V1).postWeekDays(days);
	}

}
