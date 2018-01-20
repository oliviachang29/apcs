/*
 * Lesson 6 - Unit 1 - Output in Java
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson06_template{


     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner (System.in);
          System.out.println("Please input a decimal number:");
          double myDouble = scan.nextDouble();
          char newChar = (char) myDouble;
          System.out.println("New char: " + newChar);
     }

}


