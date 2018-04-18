/*
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Three {   
	public static void main(String[] args) { 
		Scanner scan = new Scanner (System.in);
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();

		if (value1 == value2) {
			System.out.println("YES");
		}
	}
}