package com.temps;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Formatter;

public class WeeklyTemps {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	ArrayList<String> weekDays = new ArrayList<String>();
	ArrayList<Integer> avgTemp = new ArrayList<Integer> ();
	String enteredDay;
	int NUM_DAYS = 1;
	int i;
	float tempSum;
	float weekAvg;
	char keGo;
	
	weekDays.add("Monday");
	weekDays.add("Tuesday");
	weekDays.add("Wendsday");
	weekDays.add("Thursday");
	weekDays.add("Friday");
	weekDays.add("Saturday");
	weekDays.add("Sunday");
	
	avgTemp.add(78);
	avgTemp.add(55);
	avgTemp.add(65);
	avgTemp.add(69);
	avgTemp.add(70);
	avgTemp.add(72);
	avgTemp.add(66);
	
	keGo = 'c';
	
	while (keGo == 'c') {
	
	System.out.print("Please enter a day of the week to get the tempature, or enter 'Week' to get the week's average tempature:");
	
	enteredDay = scnr.next();
		
	for (i=0; i < NUM_DAYS; ++i) { 
	
	if (enteredDay.equals("Monday") || enteredDay.equals("monday")) {
		System.out.println("The tempature on Monday was:" + " " + avgTemp.get(0));
		}
	else if (enteredDay.equals("Tuesday") || enteredDay.equals("tuesday")) {
		System.out.println("The tempature on Tuesday was:" + " " + avgTemp.get(1));
		}
	else if (enteredDay.equals("Wendsday") || enteredDay.equals("wendsday")) {
		System.out.println("The tempature on Wendsday was:" + " " + avgTemp.get(2));
		}
	else if(enteredDay.equals("Thursday") || enteredDay.equals("thursday")) {
		System.out.println("The tempature on Thursday was:" + " " + avgTemp.get(3));
		}
	else if (enteredDay.equals("Friday") || enteredDay.equals("friday")) {
		System.out.println("The tempature on Friday was:" + " " + avgTemp.get(4));
		}
	else if (enteredDay.equals("Saturday") || enteredDay.equals("saturday")) {
		System.out.println("The tempature on Saturday was:" + " " + avgTemp.get(5));
		}
	else if (enteredDay.equals("Sunday") || enteredDay.equals("sunday")) {
		System.out.println("The tempature on Sunday was:" + " " + avgTemp.get(6));
		}
	else if (enteredDay.equals("Week") || enteredDay.equals("week")) {
		tempSum = 0;
		for (i=0; i < avgTemp.size(); ++i) {
		tempSum = tempSum + avgTemp.get(i);
		System.out.println(weekDays.get(i) + " " + avgTemp.get(i));}
		weekAvg = tempSum / avgTemp.size();
		String finAvg = String.format("%.1f", weekAvg);
		System.out.println("The average tempature for the week was" + " " + finAvg);
		}
	else {
		System.out.println("Please enter a valid day.");
		}
	}	
	
	System.out.print("Please type c to enter another day, or another other letter to quit:");
    keGo = scnr.next().charAt(0);
	
	}
	   
    System.out.println("Thank you for checking the weather!");
    
	}
}