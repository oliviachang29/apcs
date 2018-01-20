/*
* Lesson 34 - Unit 4 - Return Methods
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson34_template{
  
     public static int max (int a, int b) {
          if (a>b)
               return a;
          return b;
     }//max

     public static double average (double a, double b) {
          return (a + b) / 2;
     }
     
    
     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          System.out.println ("Enter two integers: ");
          
          int x = scan.nextInt();
          int y = scan.nextInt();

          System.out.println ("The largest is: " + max (x, y));
          
          int large = max (x, y);
          large ++;
          System.out.println(large);

          if (max (x, y) > 10) {
               System.out.println("The max of your two integers is greater than 10.");
          }

          // average
          System.out.println("Enter two decimal values:");

          double a = scan.nextDouble();
          double b = scan.nextDouble();

          System.out.println("The average of " + a + " and " + b + " is " + average(a, b) + ".");
     }
}


