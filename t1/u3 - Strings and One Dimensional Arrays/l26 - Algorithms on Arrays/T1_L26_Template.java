/*
* Lesson 26 - Unit 3 - Algorithms on Arrays
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson26_template{
  
     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner (System.in);
       
          int tests [] = new int[20];   
          
          //initialize the array
          for (int i = 0; i < tests.length; i++) {
               tests[i] = (int)(Math.random()*55)+45;
          }

          /// print the array
          for (int i = 0; i < tests.length; i++)
          {
               System.out.print(tests[i] + " "  ); // use print to print all on one line
          }

          // Insertion
          /*
          System.out.println("\n\nWhere should it be inserted?");
          int where = scan.nextInt();
          System.out.println("What should be inserted?");
          int what = scan.nextInt();

          // start from the end because only values after the where are being affected
          for (int i = tests.length - 1; i > where; i--) {
               tests[i] = tests[i-1];
          }

          tests[where] = what;
          */

          // Deletion
          System.out.println("\n\nWhat spot should be deleted?");
          int where = scan.nextInt();

          for (int i = where; i < tests.length - 1; i++) {
               tests[i] = tests[i + 1];
          }
          
          /// print the array
          for (int i = 0; i < tests.length; i++) {
               System.out.print(tests[i] + " "  ); // use print to print all on one line
          }
          

     }

}


