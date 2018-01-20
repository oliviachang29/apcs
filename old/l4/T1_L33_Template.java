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
    // value of x is "copied over" to c, the local variable
    // then, when c is garbage collected, original value of x is kept
     c++;
     System.out.println("Value in method: \t\t" +c);
    
  }//addOne
   public static void addOneArray (int nums [])
   {
    // method copies reference to memory address and stores in local parameter
    // list points to the same value in memory as nums
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

   public static void doubleArray (int nums []) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] *= 2;
    }

    System.out.print("\nValue of array in the method: \t" );

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
   }
     
   public static void main (String str[]) throws IOException {

        // int is a primitive data type
        // hold the actual value

        int x = 9;
       
        System.out.print ("Value before method: \t" + x );
        addOne(x);     
        System.out.print ("Value after method: \t\t" + x );
     
        // an array is a class data type
        // hold a memory address

        int list[] = {4,5,6,7,8,3};         
        System.out.print ("\nValue of array before method:  \t" );
        for(int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");
        
        addOneArray(list);
        
        System.out.print ("\nValue of array after method:  \t" );
        for(int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");

        int list2[] = {4,5,6,7,8,3};         
        System.out.print ("\nValue of array before method:  \t" );
        for(int i=0; i < list2.length; i++)
            System.out.print(list2[i] + " ");
        
        doubleArray(list2);
        
        System.out.print ("\nValue of array after method:  \t" );
        for(int i=0; i < list2.length; i++)
            System.out.print(list2[i] + " ");

   }

}


