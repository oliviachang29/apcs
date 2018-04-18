
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class lesson29_notes{
//Lesson 29: Arrays of Strings accessing Methods

 
  public static void main (String str[]) throws IOException {
    
    String movies [ ] = { "The Thing", "I Was a Teenage Werewolf", "The Blob", "Godzilla", "Plan 9 from Outer Space" };
    
    System.out.println( "The Movies: ");
    for (int i = 0; i < movies.length; i++ )
    {
      System.out.println( movies[i] );
      // print out length of each of the diff pieces inside the array
      System.out.println(movies[i].length());
    }
    
  }
  
}