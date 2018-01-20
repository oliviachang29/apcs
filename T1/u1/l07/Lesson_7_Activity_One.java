/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_One {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a three digit number:");
        int number = scan.nextInt();
        int hundreds = number % 1000;
        int tens = number % 100;
        int ones = number % 10;
        System.out.println("Here are the digits:");
        System.out.println((hundreds - tens) / 100);
		System.out.println((tens - ones)/10);
		System.out.println(ones);

    }
}