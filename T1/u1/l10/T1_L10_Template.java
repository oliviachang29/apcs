/*
 * Lesson 10 - Unit 1 - Roundoff error. 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

class t1_lesson10_template{

     public static void main (String str[]) throws IOException {

       double x = 4.35;
       
       System.out.println(x + " " + x * 100 );

       // java is trying to store a decimal value in binary
       // some decimal values cannot be stored correctly
       // roundoff error

       // java does math perfectly in integers. doubles have the problem.
       // force java to do calculations in integers

       // how to fix roundoff error:
       int temp = (int) Math.round((100 * x)); 
       // numeric cast (because x is a double)
       // Math.round to make sure it truncates to 435 not 434

       // getting change if it were a cash register
       System.out.println(1.0*(500-temp)/100)

        
     }

}


