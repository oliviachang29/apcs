/* 
Write a program that inputs a String and counts the number of words. 
Words are separated by a space or tab character.
*/
import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_Three {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a string:");
      String value = scan.nextLine();
      int c = 0;
      int words = 0;
      while (c < value.length()) {
        if (words == 0) {
          words++;
        }
        char temp = value.charAt(c);
        if (temp == ' ' || temp == '\n') {
          words++;
        }
        c++;
      }
      System.out.println("number of words: " + words);
    }
}