import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson09_template {

 public static void main (String str[]) throws IOException {

 	// Scanner scan = new Scanner (System.in);

 	int max = 10;
 	int min = 1;
 	int range = (max - min) + 1; // 10 - 0 => 10 + 1 => 11
 	System.out.println((int)(Math.random() * range) + min);

 }

}


