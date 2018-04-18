/*
 * Lesson 32 - Unit 4 - Parameters
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson32_template {
	public static void squareIt(double value) {
		System.out.println(Math.pow(value, 2));
	}
     
     public static void main (String str[]) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a decimal value");
        double value = scan.nextDouble();
        squareIt(value);
     }

}


