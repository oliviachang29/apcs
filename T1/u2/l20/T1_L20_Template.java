/*
 * Lesson 20  - Unit 2 - Technique - flag variables 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson20_template{

     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner(System.in);

          // Prime test
          
          System.out.println ("Enter an int:");
          int num = scan.nextInt();
          
          int x = 2;
          int flag = 1; // assume it is prime
          
          // Test if number has any factors
          while ( x < num )
          {
            if (num % x == 0)
              flag = 0;
            x++;
          }
                              
          if (flag == 1)
            System.out.println (num + " is prime");
          else
            System.out.println (num + " is NOT prime");

          // Max number
          int num2 = 0;
          int max = Integer.MIN_VALUE; // setting max to the smallest possible integer because any number we enter will be bigger than the smallest possible number.
          while (num2 != -1) {
            System.out.println("Enter a positive int, -1 to stop");
            num2 = scan.nextInt();

            if (num2 > max)
              max = num2;
          }
          System.out.println("The max number was " + max);
     }

}


