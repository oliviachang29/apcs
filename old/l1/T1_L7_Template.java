/*
 * Lesson 7 - Unit 1 - Modulo
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson07_template{


     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner (System.in);

          System.out.println("Please enter a three digit number:");
          int myInt = scan.nextInt();
          int ones = myInt % 10;
          int tens = (myInt % 100) / 10;
          int hundreds = (myInt % 1000) / 100;
          System.out.println("Here are the digits:");
          System.out.println(hundreds);
          System.out.println(tens);
          System.out.println(ones);
          int sum_of_digits = hundreds + tens + ones;
          System.out.println(hundreds + " + " + tens + " + " + ones + " = " + sum_of_digits);
     }

}


