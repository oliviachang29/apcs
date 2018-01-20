/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t
  
*/ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a string:");
    String value = scan.nextLine();
    int c = 0;
    while (c < value.length()) {
      System.out.println(value.charAt(c));
      c++;
    }
  }
}