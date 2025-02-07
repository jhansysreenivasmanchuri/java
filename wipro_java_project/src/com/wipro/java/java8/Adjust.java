package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	public static void checkingAdjusters() {
		
		//Function to Check Date and Time
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is: " + date);
		
		//To get first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First Day of Next Month: "+ dayOfNextMonth);
		
		//get the next Saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday from now is: " + nextSaturday);
		
		//First Day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of Current month:" + firstDay);
		
		//Last day of current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of Current month:" + lastDay);

	}
	public static void main(String[] args) {
		checkingAdjusters();
	}

}
