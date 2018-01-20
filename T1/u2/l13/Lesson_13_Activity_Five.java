/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	int value1 = (int) (Math.random() * 13) + 1;
    	int value2 = (int) (Math.random() * 13) + 1;
    	System.out.println(value1);
    	System.out.println(value2);
    	int product = scan.nextInt();
    	if ((value1 * value2) == product) {
    		System.out.println("Correct!");
    	} else {
    		System.out.println("Wrong");
    	}
	}
}