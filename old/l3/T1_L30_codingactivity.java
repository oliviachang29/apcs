
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson30_codingactivity{
  // public static String [] list = {};
 
  public static void main (String str[]) throws IOException {
    
    String list [] = {"every", " near ing ", " checking", "food ", "stand", "value "};
    for (int i = 0; i < list.length; i++){
      String newWord = "";
    	for (int a = 0; a < list[i].length(); a++){

    		if (list[i].charAt (a) != ' '){
          newWord = newWord + list[i].charAt (a);
    		}

    	}
      list[i] = newWord;
    	System.out.println(list[i]);
    }
    
  }
  
}