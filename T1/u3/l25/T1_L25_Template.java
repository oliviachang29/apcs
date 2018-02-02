/*
* Lesson 25 - Unit 3 - Algorithms 
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson25_template{
  
     public static void main (String str[]) throws IOException {

          
          boolean prime[] = new boolean [100]; // init automatically to false
          
          // initialize to true
          for (int j = 0; j < prime.length; j++)
          {
               prime[j] = true; // go through everything and set to true
               // assume it's prime until proven otherwise
          }

          for (int d = 2; d < prime.length; d++) {
          	for (int i = d + 1; i < prime.length; i++) {
          		if (i % d == 0) {
          			prime[i] = false;
          		}
          	}
          }

          // output
          for (int i = 2; i < prime.length; i++) {
          	if (prime [i]) {
          		System.out.print(i + " ");
          	}
          }
          

     }

}


