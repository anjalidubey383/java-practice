package com.basic.assignment;

// creating date class
public class Date {

	//adding attributes day, month and year
    private int day;
    private int month;
    private int year;
    //adding setters and getter methods
    public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
 //default constructor
	public Date(){}
	
//parameterized constructor
	public Date(int day, int month, int year) {
    this.day=day;
    this.month=month;
    this.year=year;
	}
	
	public void printDate() {
		System.out.println("Day="+day+" "+"Month="+month+" "+"Year="+year);
		
	}
	
	

	
	
	
}
	 
		
	


