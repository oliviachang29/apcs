/*
 * Lesson 32 - Unit 4 - Parameters
 * Coding activity
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson35_ca {
	public static int randomize (int min, int max) {
		int random = (int)((Math.random() * (max - min)) + min);
		return random;
	}

	public static int randomize (int max) {
		int random = (int)((Math.random() * (max - 0)) + 0);
		return random;	
	}

	public static double randomize (double min, double max) {
		double random = ((Math.random() * (max - min)) + min);
		return random;		
	}

	public static double randomize (double max) {
		double random = ((Math.random() * (max - 0)) + 0);
		return random;		
	}

	public static void main (String str[]) throws IOException {
		System.out.println(randomize (0, 10));
		System.out.println(randomize (10));
		System.out.println(randomize (0.0, 10.0));
		System.out.println(randomize (10.0));
	}

}


