/*
* Lesson 34 - Unit 4 - Return Methods
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson34_template{
  
     public static int max (int a, int b) 
     {
          if (a>b)
               return a;
          return b;
     } //max
     
     public static double average (double a, double b) {
          double temp = (a + b) / 2.0;
          return temp;
     }
    
     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          System.out.println ("Enter two integers: ");
          
          int x = scan.nextInt();
          int y = scan.nextInt();

          System.out.println ("The largest is: " + max (x, y));

          System.out.println ("The average is: " + average (x*1.0, y*1.0));          
          
     }
}


