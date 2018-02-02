/*
 * Lesson 33 Coding Activity 5
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints, an integer value, 
 * and an integer index.The method should insert the value at the given
 * index and move the values afterwards by one.
 * 
 * This method must be called insertValue() and must have the following 
 * parameter types: int[], integer, integer. 
 * 
 * Calling insertValue(a, 100, 2) would change the array {1, 2, 3, 4, 5} 
 * to {1, 2, 100, 3, 4}.
 */


import java.util.Scanner;

class Lesson_33_Activity_Five {
    public static void insertValue(int [] a, int what, int where) {
      for (int i = a.length - 1; i > where; i--) {
        a[i] = a[i - 1];
      }
      a[where] = what;
    }
  
    public static void main(String[] args)
     {
      int list[] = {4,5,6,7,8,3};

      System.out.print ("\nValue of array before method:  \t" );
      for(int i=0; i < list.length; i++)
          System.out.print(list[i] + " ");

      insertValue(list, 100, 2);

      System.out.print ("\nValue of array after method:  \t" );
      for(int i=0; i < list.length; i++)
          System.out.print(list[i] + " "); 
    }
}