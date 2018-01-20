/*
 * Lesson 32 - Unit 4 - Parameters
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson32_template{

	public static void squareIt (double a) {
		System.out.println(a * a);
	}
     
     public static void main (String str[]) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a decimal value");
        double value = scan.nextDouble();
        squareIt(value);

     }

}


