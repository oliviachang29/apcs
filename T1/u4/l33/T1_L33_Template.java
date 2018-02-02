/*
 * Lesson 33 - Unit 4 - Parameters - Primitive vs. Class
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson33_template{

  public static void addOne(int c)
  {
     c++;
     System.out.println("Value in method: \t\t" +c);
    
  }//addOne

  public static void addOneArray (int nums [])
  {
      for (int i = 0; i < nums.length; i++)
      {
           nums[i] ++;
      }
      
      System.out.print("\nValue of array in the method: \t" );
      
      for (int i = 0; i < nums.length; i++)
      {
           System.out.print (nums[i] + " ");
      }
  }//addOneArray

  public static void doubleArray(int nums []) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] *= 2;
    }
  }
     
  public static void main (String str[]) throws IOException {
    int x = 9;

    System.out.print ("Value before method: \t" + x );
    addOne(x);
    // change made to integer value is NOT preserved
    System.out.print ("Value after method: \t\t" + x );


    int list[] = {4,5,6,7,8,3};         
    System.out.print ("\nValue of array before method:  \t" );
    for(int i=0; i < list.length; i++)
        System.out.print(list[i] + " ");

    addOneArray(list);
    // change made to each value in array IS preserved
    // this is because the array points to the value in memory
    // whereas the int value is primitive, which holds the value, not hte memory
    System.out.print ("\nValue of array after method:  \t" );
    for(int i=0; i < list.length; i++)
        System.out.print(list[i] + " ");
  }

}


