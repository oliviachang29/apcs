
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class test {

 	public static void main (String str[]) throws IOException {
 		int [] values = new int[10];
 		 double sum = 0;
        for (int i =  0; i < values.length; i++) {
            sum += values[i];
        }
        double average = 1.0 * sum / values.length;
        System.out.println(average);
	}
}


