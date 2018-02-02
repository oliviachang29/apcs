/*
 * Lesson 1011 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity{
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Enter a number in base 8:");
    	int octal = scan.nextInt();
    	int length = String.valueOf(octal).length();
    	System.out.println("length: " + length);

    	boolean notTooLong = false;
    	boolean digitsAreCorrect = true;
    	// check if num is 8 digits or less
    	if (length >= 1 && length <= 8) {
    		notTooLong = true;
    	}

    	int val = 0;

    	int c = 10;
    	for (int i = 0; i < length; i++) {
    		int digit = ((octal % c) - (octal % (c / 10))) / (c / 10);
    		if (digit >= 0 && digit <= 7) {
    			int power = (int) Math.pow(8, i);
	    		int temp = power * digit;
	    		val += temp;
	    		c *= 10;
    		} else {
    			digitsAreCorrect = false;
    			break;
    		}
    		// System.out.println(digit);
    		// c *= 10;
    	}

    	if (notTooLong && digitsAreCorrect) {
    		System.out.println(val);
    	} else {
    		System.out.println("ERROR: Incorrect Octal Format");
    	}

	}
}