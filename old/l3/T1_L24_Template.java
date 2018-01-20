/*
 * Lesson 24 - Unit 3 - The For Loop  
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson24_template{

     public static void main (String str[]) throws IOException {
          int list1[] = new int[10];
          int list2[] = new int[10];

          // init array
          for (int i = 0; i < list1.length; i ++)
          {
              list1[i] = (int)(Math.random() * 55) + 45;
          }
          // print list1
          System.out.println("List 1: ");
          for (int i = 0; i < list1.length; i ++)
          {
               System.out.print(list1[1] + " ");
          }

          for (int i = 0; i < list2.length; i ++)
          {
               list2[i] = list1[i];
          }
           // print list2
          System.out.println("\nList 2: ");
          for (int i = 0; i < list2.length; i ++)
          {
               System.out.print(list2[1] + " ");
          }

     }

}


