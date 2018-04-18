/*
 * Lesson 19 - Unit 8 - 2-D Array
 */


import java.io.*;
import static java.lang.System.*;
import java.util.*;
import java.lang.Math;

import java.util.Scanner;

class T2_Lesson20_Template{
	public static void randomizeScores (int ts [][]) {
		for (int r = 0; r < ts.length - 1; r++) {
			for (int c = 0; c < ts[0].length; c++) {
				ts[r][c] = (int) (Math.random()*40) + 60;
			}
		}
	}

	public static void printScores(int ts[][] ) {
		for (int r = 0; r < ts.length; r++) {
			for (int c = 0; c < ts[0].length; c++) {
				System.out.print(ts[r][c] + "\t");
			}
			System.out.println("");
		}
	}

	public static void average (int ts [][], double a[]) {
		for (int r = 0; r < ts.length; r++) {
			double sum = 0;
			for (int c = 0; c < ts[r].length; c++) {
				sum += ts[r][c];
			}
			a[r] = (sum / ts[r].length);
			System.out.println(a[r]);
		}
	}

	public static boolean improving (int c[]) {
		// check if ascending
		for (int i = 1; i < c.length; i++) {
			if (c[i] < c[i-1])
				return false;
		}
		return true;
	}

	public static void studentsImproving (int ts[][], boolean b []) {
		for (int r = 0; r < ts.length; r++) {
			b[r] = improving(ts[r]);
			if (b[r]) {
				System.out.println("Improving");
			} else {
				System.out.println("Not improving");
			}
		}
	}

	public static double testAverage(int ts[][], int c) {
		double sum = 0;
		for (int r = 0; r < ts.length; r++) {
			sum += ts[r][c];
		}
		return sum / ts.length;
	}

     public static void main (String str[]) throws IOException {
        int testScores[][] = new int[5][4];
        // parallel arrays to testScores
        double average [] = new double [5]; 
        boolean better [] = new boolean [5];
        testScores[4][0] = 60;
        testScores[4][1] = 70;
        testScores[4][2] = 80;
        testScores[4][3] = 90;

        // printScores(testScores); // full of 0s
        randomizeScores(testScores);
        printScores(testScores);
        average(testScores, average);
        studentsImproving(testScores, better);
        System.out.println(testAverage(testScores,1));
     }

}


