/*
 * Lesson 12 - Unit 6 - Wrapper Classes
 */


import java.io.*;
import static java.lang.System.*;
import java.util.*;
import java.util.Scanner;

class t2_lesson12_template{
	public static int smallest(int nums[]) {
		int c = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] < c) {
				c = nums[i];
			}
		}
		return c;
	}

     public static void main (String str[]) throws IOException {
		Scanner scan = new Scanner (System.in);
		int[] list = {18, 37, 137, 77, 9, 79, 27, 87, 9, 135, 111, 66, 68, 106, 139, 128, 111, 6, 76, 139, 79, 109, 35, 129, 138, 91, 51, 54, 64, 114, 42, 138, 38, 124, 131, 22, 110, 36, 44, 55};
		//find the smallest element
		System.out.println(smallest(list));

		ArrayList <Double> h = new ArrayList <Double> ();
		System.out.println("Enter decimal values. Enter -1 to stop.");
		double n = 0;
		while (n != -1) {
			n = scan.nextDouble();
			if (n != -1) {
				h.add(n);
			}
		}
		
		for (Double x: h) {
			System.out.print(x + " ");
		}
     }

}


