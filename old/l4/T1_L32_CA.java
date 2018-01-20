/*
 * Lesson 32 - Unit 4 - Parameters
 * Coding activity
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson32_ca{

	public static void monthName (int n) {
		String month;
		if (n == 1) {
			month = "January";
		} else if (n == 2) {
			month = "February";
		} else if (n == 3) {
			month = "March";
		} else if (n == 4) {
			month = "April";
		} else if (n == 5) {
			month = "May";
		} else if (n == 6) {
			month = "June";
		} else if (n == 7) {
			month = "July";
		} else if (n == 8) {
			month = "August";
		} else if (n == 9) {
			month = "September";
		} else if (n == 10) {
			month = "October";
		} else if (n == 11) {
			month = "November";
		} else {
			month = "December";
		}
		System.out.println(month);
	}

	public static void monthDays (int n) {
		int numDays;
		if (n == 1) {
			numDays = 31;
		} else if (n == 2) {
			numDays = 28;
		} else if (n == 3) {
			numDays = 31;
		} else if (n == 4) {
			numDays = 30;
		} else if (n == 5) {
			numDays = 31;
		} else if (n == 6) {
			numDays = 30;
		} else if (n == 7) {
			numDays = 31;
		} else if (n == 8) {
			numDays = 31;
		} else if (n == 9) {
			numDays = 30;
		} else if (n == 10) {
			numDays = 31;
		} else if (n == 11) {
			numDays = 30;
		} else {
			numDays = 31;
		}
		System.out.println(numDays);
	}

	public static void swap (int a, int b) {
		System.out.println(b + " " + a);
	}

	public static void realTime(int s) {
		int hours = 0;
		int minutes = 0; 
		int seconds = 0;
		if ((s / 3600) > 0) {
			hours = (s / 3600);
			s = s - (hours * 3600);
		}
		if ((s / 60 > 0)) {
			minutes = (s / 60);
			s = s - (minutes * 60);
		}
		seconds = s;
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}
     
     public static void main (String str[]) throws IOException {
     	monthName(8);
     	monthDays(2);
     	monthDays(9);
     	swap(3, 7);
     	realTime(6342);
     }

}


