/*
 * Assignment 3: Crack the Code!
*/

import java.util.Scanner;
import java.lang.Math;

class A3_crackcode {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome. What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ". Try your best to crack the code!");

        int f = 0;
        int c = 1;
        // while user has not satisfied conditions for breaking out of loop (f = 1 - fail) or (f = 2 - pass)
        while (f == 0) { 
            System.out.println("PHASE " + c);
            System.out.println("Enter a number:"); 
            int input = scan.nextInt();
            if (c == 1) {
                if (input == 3) {
                    System.out.println("Correct!"); 
                    c++;
                } else {
                    f = 1; // break
                }
            } else if (c == 2) {
                if ((input == 1) || (33 <= input && input <= 100)) {
                    System.out.println("Correct!"); 
                    c++;
                } else {
                    f = 1;
                }
            } else if (c == 3) {
                if ((input % 3 == 0 || input % 7 == 0) && input > 0) {
                    System.out.println("Correct!"); 
                    System.out.println("You have cracked the code! "); 
                    f = 2;
                } else {
                    f = 1;
                }
            } else {
                System.out.println("Error: c is not 1, 2, or 3."); 
            }
        }

        if (f == 1) {
            System.out.println("Sorry, that was incorrect!");
            System.out.println("Better luck next time!");
        }
    }
}