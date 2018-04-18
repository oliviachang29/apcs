/*
 * Lesson 17 - Unit 2 - While Loops
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson17_template{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          
          int x = 0;
          int c = 0;
          int sum = 0;
          while ( x > -1 )
          {
               System.out.println( "You entered: " + x);
               x = scan.nextInt();
               sum += x;
               c++;
          }

          System.out.println( "You entered " + c + " numbers.") ;
          System.out.println("The sum of the numbers is " + sum  + ".");
          System.out.println( "Average: " + (sum*1.0 / c)) ;

          // Print "java" to screen 5 times
          int j = 0;
          while (j < 5) {
               System.out.println("java");
               j++;
          }
                
            
     }

}


