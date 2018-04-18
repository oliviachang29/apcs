/*
 * Assignment 2: Time Converter

    For this assignment, write a program that finds the date based on a given Unix timestamp. The Unix timestamp is a system for tracking the age of files using the number of seconds that have occurred since the Unix epoch at 12:00:00 AM on January 1st,1970. We will be assuming there are always 30 days per month (360 days a year) to simplify the calculation.

    For input, the program should accept an integer number of seconds to convert.

    The program should then calculate the year, month, day, hour, minute, and second based on the inputted timestamp. Format your outputs as shown in the sample runs. Make sure that your spacing matches the sample runs exactly.

    Months are represented by numbers ranging from 0 to 11. Days range from 0 to 29. For example, 0 is January, 1 is February, etc. and 0 is the first day of the month, 1 is the second day of the month, etc.

    Sample Runs:

    Seconds Since Unix Epoch:
    999999999

    Year: 2002
    Month: 1
    Day: 24
    Hour: 1
    Min: 46
    Sec: 39


    Seconds Since Unix Epoch:
    178437

    Year: 1970
    Month: 0
    Day: 2
    Hour: 1
    Min: 33
    Sec: 57

*/

import java.util.Scanner;
import java.lang.Math;

class A2_timeconverter {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner (System.in);
        System.out.println("Seconds Since Unix Epoch:");
        int value = scan.nextInt();
        
        // int value = 999999999;

        double secondsSince = 1.0*value; // convert into double

        // 360 days per year
        // 360 x 24 hours per day x 3600 seconds per hour = 31104000 sec per year
        double yearsSince = secondsSince / 31104000;
        int year = 1970 + (int) yearsSince;
        System.out.println("Year: " + year);
        
        // 31104000 sec per year / 12 months per year = 2592000 sec per month
        double monthsSince = secondsSince / 2592000;
        double month = monthsSince % 12; // 12 months in a year
        System.out.println("Month: " + (int) month);

        // 2592000 sec per month / 30 days per month = 86400 sec per day
        double daysSince = secondsSince / 86400;
        double day = daysSince % 30; // 30 days in a month
        System.out.println("Day: " + (int) day);

        // 86400 sec per day / 24 hours per day = 3600 sec per hour
        double hoursSince = secondsSince / 3600;
        double hour = hoursSince % 24; // 24 hours in a day
        System.out.println("Hour: " + (int) hour);

        // 60 minutes per hour
        double minutesSince = secondsSince / 60;
        double minute = minutesSince % 60; // 60 min per hour
        System.out.println("Min: " + (int) minute);

        // 60 minutes per hour
        double sec = secondsSince % 60; // 60 seconds per minute
        System.out.println("Sec: " + (int) sec);

    }
}