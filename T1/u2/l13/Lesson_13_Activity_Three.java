/*
 * Lesson 13 Coding Activity 3 
 * Input two integers and print the largest. If they are equal print "EQUAL". 
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */


import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     int value1 = scan.nextInt();
     int value2 = scan.nextInt();
     if (value1 == value2) {
     	System.out.println("EQUAL");
     } else if (value1 > value2) {
     	System.out.println(value1);
     } else {
     	System.out.println(value2);
     }
    }
}