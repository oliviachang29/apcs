/*
 * Lesson 24 - Unit 3 - The For Loop  
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson24_template{

     public static void main (String str[]) throws IOException {
          
          // numbers from 1 to 10
          for (int i = 0; i <= 10; i ++)
          {
            System.out.print( i + " ");
          }

          System.out.println("\n");

          // even numbers from 20 to 100
          for (int i = 20; i<=100; i+=2) {
          	System.out.print(i + " ");
          }

          System.out.println("\n");

          // print each element in array
          int list [] = {1, 2, 3, 4, 5};
          for (int i = 0; i < list.length; i++) {
          	System.out.print(list[i] + " ");
          }

          System.out.println("\n");

          // copy values from one array to another
          int list1 [] = new int[10];
          int list2 [] = new int[10];
          
          // add random values to list1
          // 0 to 100
          for (int i = 0; i < list1.length; i++) {
          	list1[i] = (int)((Math.random() * 100) + 1);
          }
          // copy over
          for (int i = 0; i < list2.length; i++) {
          	list2[i] = list1[i];
          }

          // print list 1
          for (int i = 0; i < list1.length; i++) {
          	System.out.print(list1[i] + " ");
          }

          System.out.println("\n");

          // print list 2
          for (int i = 0; i < list2.length; i++) {
          	System.out.print(list1[i] + " ");
          }

     }

}


