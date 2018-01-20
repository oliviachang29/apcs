
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class test {

 public static void main (String str[]) throws IOException {

 	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter the first octet:");
	int first = scan.nextInt();
	System.out.println("Please enter the second octet:");
	int second = scan.nextInt();
	System.out.println("Please enter the third octet:");
	int third = scan.nextInt();
	System.out.println("Please enter the fourth octet:");
	int fourth = scan.nextInt();

	boolean firstIsInvalid = !(first >= 0 && first <= 255);
	boolean secondIsInvalid = !(second >= 0 && second <= 255);
	boolean thirdIsInvalid = !(third >= 0 && third <= 255);
	boolean fourthIsInvalid = !(fourth >= 0 && fourth <= 255);

 	if (firstIsInvalid)
		System.out.println("Octet 1 is incorrect");
	if (secondIsInvalid)
		System.out.println("Octet 2 is incorrect");
	if (thirdIsInvalid)
		System.out.println("Octet 3 is incorrect");
	if (fourthIsInvalid)
		System.out.println("Octet 4 is incorrect");

 	if (!firstIsInvalid && !secondIsInvalid && !thirdIsInvalid && !fourthIsInvalid) {
 		System.out.println("IP Address: " + first + "." + second + "." + third + "." + fourth); 
 	}
 }

}


