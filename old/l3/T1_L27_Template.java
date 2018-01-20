/*
* Lesson 27 - Unit 3 - Algorithms - searching
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson27_template{

  
     public static void main (String str[]) throws IOException {
          Scanner scan = new Scanner (System.in);
          
          double list [] =  {2.3 , 4.7 , 5.25 , 9.5 , 2.0 , 1.2 , 7.129 , 5.4 , 9.4 };
          
          System.out.println( "What are you looking for? ");
          double look = scan.nextDouble();
          
          //search for value in the array, print -1 if not found
          int where = -1;
          for (int i = 0; i < list.length; i++){
          	if (list[i] == look) {
          		where = i;
          		break;
          	}
          }
          if (where == -1) {
          	System.out.println("Not found");
          } else {
          	System.out.println("We found " + look + " at " + where);	
          }
          
     }

}


