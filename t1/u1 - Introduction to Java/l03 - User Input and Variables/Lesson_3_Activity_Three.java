/*
 * Lesson 3 - Unit 1 - User Input and Variables 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Lesson_3_Activity_Three{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);

	      System.out.println("Hi there. What is your name?");
	      String name = scan.nextLine();
	      System.out.println("What adjective describes you?");
	      String adj = scan.nextLine();
	      System.out.println("My name is " + name + ". I am " + adj + ".");

     }

}