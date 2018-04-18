/*
 * Lesson 9 - Unit 1 - Math functions. 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

class t1_lesson09_template{

     public static void main (String str[]) throws IOException {

       
            Scanner scan = new Scanner (System.in);
          
            System.out.println("Please enter 2 ints: ");
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            System.out.println("Please enter 2 doubles: ");
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            
            System.out.println("Answers: ");

            // abs val
            System.out.println(Math.abs(x - y));
            System.out.println(Math.abs(a - b));

            // pow - x ^ y
            // everything sent back from pow is a double
            System.out.println(Math.pow(x, y));

            // sqrt
            // sends back a double
            System.out.println(Math.sqrt(x));

            // random
            System.out.println(Math.random()); // get a random decimal from (0, 1)
            System.out.println(Math.random() * 100); // getting random decimals from (0, 99)
            System.out.println((int)(Math.random() * 100)); // getting random integers from (0, 99)
            System.out.println((int)(Math.random() * 100) + 1); // getting random integers from (1, 100) - bumps everything up by 1
            // want numbers from -20 and positive 20 inclusive
            System.out.println((int)(Math.random() * 41) + -20); // 41 numbers in that range, lowest number is -20


     }

}


