import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.ArrayList;

//Term 2 Lesson 1: ArrayList
class t2_lesson1_template{

     public static void main (String str[]) throws IOException {

          ArrayList list = new ArrayList ();
          
          list.add("I Wanna Dance With Somebody");
          list.add("I Will Always Love You");
          list.add("Didn't We Almost Have it All");

          // If you try to add a Scanner to a <String> ArrayList, you'll get an error
          list.add(new Scanner (System.in));
       
          System.out.println(list);

     }

}


