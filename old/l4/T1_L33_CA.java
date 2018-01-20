/*
 * Coding activity
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson33_ca {

	public static void upper(String list[]) {
		for (int i = 0; i < list.length; i++) {
			list[i] = list[i].toUpperCase();
			System.out.print(list[i] + " ");
		}
	}

	public static void randomize (int list []) {
		for (int i = 0; i < list.length; i++) {
			int newNum = (int)((Math.random() * 90) + 10);
			list[i] = newNum;
		}
	}

	public static void printit(int list []) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void reverse(int list[]) {
		System.out.println("\n\n");
		// int newArray [] = new int[list.length];
		// int newArrayIndex = 0;
		// for (int i = list.length - 1; i >= 0; i--) {
		// 	newArray[newArrayIndex] = list[i];
		// 	// System.out.print(newArray[newArrayIndex] + " ");
		// 	newArrayIndex++;
		// }
		// list = newArray;

		for (int i = 0; i < list.length / 2; i++) {
			int temp = list[i];
			int k =  list.length - i - 1;
			list[i] = list[k];
			list[k] = temp;
		}
	}

	public static void insertValue(int list[]) {
		
	}

     public static void main (String str[]) throws IOException {
     	String myList [] = {"hi ther", "i'm pretty cool", "yo wassup"};
     	upper(myList);
     	int myInts [] = {1, 2, 3};
     	reverse(myInts);
     	for (int i = 0; i < myInts.length; i++) {
			System.out.print(myInts[i] + " ");
		}
     }

}


