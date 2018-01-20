/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_Two {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a string:");
      String value = scan.nextLine();
      int c = 0;
      while (c < value.length()) {
        int temp = 0;
        while (temp < c) {
          System.out.print("\t");
          temp++;
        }
        System.out.println(value.charAt(c));
        c++;
      }
    }
}