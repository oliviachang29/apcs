/*
 * Lesson 19 - Unit 8 - 2-D Array
 */


import java.io.*;
import static java.lang.System.*;
import java.util.*;
import java.lang.Math;

import java.util.Scanner;

class T2_Lesson19_Template{
	public static void randomizeScores (int ts [][]) {
		for (int r = 0; r < ts.length; r++) {
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

     public static void main (String str[]) throws IOException {
     	/*
        int grid [][] = new int [4][3];
        // row 1, column 2
        grid[1][2] = 7;
        // row 2, column 0
        grid[2][0] = 7;
        */

        int testScores[][] = new int[5][4];
        // printScores(testScores); // full of 0s
        randomizeScores(testScores);
        printScores(testScores);
     }

}


