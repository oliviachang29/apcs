/*
* Lesson 25 - Unit 3 - Algorithms 
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson25_template{
  
     public static void main (String str[]) throws IOException {

          
          boolean prime[] = new boolean [100];
          
          //initialize to true
          for (int j = 0; j < prime.length; j++)
          {
               prime[j] = true;
          }

          for (int d = 2; d < prime.length; d++) {
          	for (int i = d + 1; i < prime.length; i++){
          		if ( i % d == 0)
          			prime [i] = false;
          	}
          }
          
          for (int i = 1; i < prime.length; i++) {
          	if (prime [i])
          		System.out.print(i + " ");
          }
     }

}


