package com.example.demo.services.factory;

import com.example.demo.Model.Days;
import com.example.demo.Model.Week;

public interface IWeekDays {

    public Days[] getWeekDays(boolean optionalParameter);
    public Days[] postWeekDays(Days[] days);
}
