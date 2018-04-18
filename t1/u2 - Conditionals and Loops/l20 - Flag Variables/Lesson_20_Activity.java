/*
 * Lesson 20 Coding Activity 
 * 
 * Computer science jobs are in demand. Right now we have a shortage 
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs. 
 * This means you specialize in an area like biology, 
 * and then use computer programming to do your job. 
 * 
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 * 
 * One of these jobs is computational biology. Computational Biology, 
 * sometimes referred to as bioinformatics, is the science of 
 * using biological data to develop algorithms and relations
 * among various biological systems.
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. We'll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Write a program to enter Gracie's longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_20_Activity{
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	int num = 1;
    	double max_latitude = Integer.MIN_VALUE; // anything you enter will be bigger
    	double min_latitude = Integer.MAX_VALUE; // anything you enter will be smaller
    	double max_longitude = Integer.MIN_VALUE;
    	double min_longitude = Integer.MAX_VALUE;
    	while (num != 0) {
    		System.out.println("Please enter the latitude:");
    		double temp_latitude = scan.nextDouble();
    		System.out.println("Please enter the longitude:");
    		double temp_longitude = scan.nextDouble();

    		if ((-90 <= temp_latitude && temp_latitude <= 90) && (-180 <= temp_longitude && temp_longitude <= 180))  {
    			if (temp_latitude > max_latitude)
    				max_latitude = temp_latitude;
	    		if (temp_latitude < min_latitude)
	    			min_latitude = temp_latitude;

	    		if (temp_longitude > max_longitude)
    				max_longitude = temp_longitude;
	    		if (temp_longitude < min_longitude)
	    			min_longitude = temp_longitude;

	    		System.out.println("Would you like to enter another location?");
	    		num = scan.nextInt();
    		} else {
    			System.out.println("Incorrect Latitude or Longitude");
    		}
    	}

    	System.out.println("Farthest North: " + max_latitude);
    	System.out.println("Farthest South: " + min_latitude);
    	System.out.println("Farthest East: " + max_longitude);
    	System.out.println("Farthest West: " + min_longitude);
	}
}