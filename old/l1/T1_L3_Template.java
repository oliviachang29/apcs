/*
 * Lesson 3 - Unit 1 - User Input and Variables 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson03_template{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          System.out.println("Please enter three names:");
	      String name1 = scan.nextLine();
	      String name2 = scan.nextLine();
	      String name3 = scan.nextLine();
	      System.out.println(name3 + " " + name2 +  " " + name1);

     }

}


