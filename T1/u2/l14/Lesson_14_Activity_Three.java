/*
 * Lesson 14 Coding Activity 3
 * The Internet runs on web addresses.The addresses we type represent the IP address 
 * for each site and how the computer finds an individual web page.
 *
 * IP addresses are made up of four numbers, each between 0 and 255 separated by a period. 
 * For example, 128.253.21.58 is an IP address.
 * 
 * Write a program to enter four numbers and test if they make up a valid IP address.
 * In other words, test to see if the numbers entered are between 0 and 255 inclusive.
 * 
 *     Sample Run 1
 *         Please enter the first octet:
 *         898
 *         Please enter the second octet:
 *         34
 *         Please enter the third octet:
 *         712
 *         Please enter the fourth octet:
 *         45
 *         Octet 1 is incorrect
 *         Octet 3 is incorrect
 * 
 *         
 *      Sample Run 2
 *         Please enter the first octet:
 *         112
 *         Please enter the second octet:
 *         200
 *         Please enter the third octet:
 *         0
 *         Please enter the fourth octet:
 *         254
 *         IP Address: 112.200.0.254
 * 
 */


import java.util.Scanner;

class Lesson_14_Activity_Three {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner (System.in);
     System.out.println("Please enter the first octet:");
     int first = scan.nextInt();
     System.out.println("Please enter the second octet:");
     int second = scan.nextInt();
     System.out.println("Please enter the third octet:");
     int third = scan.nextInt();
     System.out.println("Please enter the fourth octet:");
     int fourth = scan.nextInt();

     boolean firstValid = (first >= 0 && first <= 255);
     boolean secondValid = (second >= 0 && second <= 255);
     boolean thirdValid = (third >= 0 && third <= 255);
     boolean fourthValid = (fourth >= 0 && fourth <= 255);

     if (!firstValid)
     	System.out.println("Octet 1 is incorrect");
     if (!secondValid)
     	System.out.println("Octet 2 is incorrect");
     if (!thirdValid)
     	System.out.println("Octet 3 is incorrect");
     if (!fourthValid)
     	System.out.println("Octet 4 is incorrect");

     if (firstValid && secondValid && thirdValid && fourthValid) {
     	System.out.println("IP Address: " + first + "." + second + "." + third + "." + fourth);
     }

    }
}