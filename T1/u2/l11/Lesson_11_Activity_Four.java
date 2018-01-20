/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_11_Activity_Four {   
	public static void main(String[] args) { 
		System.out.println("Enter a Number:");
		Scanner scan = new Scanner (System.in);
		int value = scan.nextInt();
		if (value % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}