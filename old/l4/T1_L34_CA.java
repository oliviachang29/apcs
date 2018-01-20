/*
 * Lesson 32 - Unit 4 - Parameters
 * Coding activity
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class t1_lesson34_ca{

	public static int sum (int list []) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		return sum;
	}

	public static double average (int arr []) {
		double sum = (double) sum(arr);
		double length = (double) arr.length;
		return (sum / length);
	}

	public static int findMax (int arr []) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (i == 0){
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMin (int arr []) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
			}
			if (i == 0){
				max = arr[i];
			}
		}
		return max;
	}

	public static int sumEven (int arr []) {
		int sumEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumEven += arr[i];
			}
		}
		return sumEven;
	}

	public static boolean allPositive (int arr []) {
		boolean allPositive = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				allPositive = false;
			}
		}
		return allPositive;
	}

     public static void main (String str[]) throws IOException {
     	int myList[] = {33, 4, 5};
     	int myList2[] = {1, 2, -3, 102, 23, 456};
     	int myList3[] = {5, 10, 15};
     	int myList4[] = {-10, -24, -3, -102, -23, -456};
     	// System.out.println(sum(myList));
     	System.out.println(allPositive(myList));
     	System.out.println(allPositive(myList2));
     	System.out.println(allPositive(myList3));
     	System.out.println(allPositive(myList4));
     }

}


