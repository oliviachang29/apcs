import java.io.*;
import static java.lang.System.*;
import java.util.*;
import java.lang.Math;

class T2_L20_CA {

	public static void print(int a[][]) {
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				System.out.print(a[r][c] + "  ");
			}
			System.out.println("");
		}
	}
	public static void main (String str[]) throws IOException {
		/*
		Write two for loops to store the following int values in a 2-D array. 
		(The first row should consist of {1,1,1,1}, the second row {2,2,2,2}, etc.)
		 1  1  1  1
		 2  2  2  2
		 3  3  3  3
		 4  4  4  4
		*/
		int first [][] = new int [4][4];
		for (int r = 0; r < first.length; r++) {
			for (int c = 0; c < first[r].length; c++) {
				first[r][c] = r+1;
			}
		}

		/*
		Write two for loops to store the following int values in a 2-D array:
		 1  1  1  2
		 1  1  2  2
		 1  2  2  2
		*/

		int second [][] = new int [3][4];
		for (int r = 0; r < second.length; r++) {
			for (int c = 0; c < second[r].length; c++) {
				if (c < 3-r) {
					second[r][c] = 1;
				} else {
					second[r][c] = 2;
				}
			}
		}

		/*
		Write two for loops to store the following int values in a 2-D array
		 1  2  3  4  5
		 1  2  3  4  5
		 1  2  3  4  5
		 1  2  3  4  5
		*/

		int third [][] = new int [4][5];
		for (int r = 0; r < third.length; r++) {
			for (int c = 0; c < third[r].length; c++) {
				third[r][c] = c+1;
			}
		}

		// Print all arrays
		System.out.println("First: ");
		print(first);
		System.out.println("Second: ");
		print(second);
		System.out.println("Third: ");
		print(third);
	}
}