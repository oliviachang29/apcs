/*
* Lesson 32 Coding Activity 1
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes a parameter for the number of a month 
* and prints the month's name. 
* 
* This method must be called monthName() and it must have an integer parameter. 
* 
* Calling monthName(8) should print August to the screen.
*/


import java.util.Scanner;

class Lesson_32_Activity_One {
  public static void monthName(int n) {
    String month;
    if (n == 1) {
      month = "January";
    } else if (n == 2) {
      month = "February";
    } else if (n == 3) {
      month = "March";
    } else if (n == 4) {
      month = "April";
    } else if (n == 5) {
      month = "May";
    } else if (n == 6) {
      month = "June";
    } else if (n == 7) {
      month = "July";
    } else if (n == 8) {
      month = "August";
    } else if (n == 9) {
      month = "September";
    } else if (n == 10) {
      month = "October";
    } else if (n == 11) {
      month = "November";
    } else {
      month = "December";
    }
    System.out.println(month);
  }
  
  public static void main(String[] args) {
    monthName(8);
  }
}
