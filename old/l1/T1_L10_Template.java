/*
/*
 * Lesson 10 - Unit 1 - Roundoff error. 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

class t1_lesson10_template{

     public static void main (String str[]) throws IOException {

       double x = 4.36;

       int temp = (int) Math.round((100 * x));

       System.out.println(1.0 * (500 - temp)/100);
       
       System.out.println(x * 100);
        
     }

}


