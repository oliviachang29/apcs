/*
* Lesson 28 - Unit 3 - Arrays of Strings
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson28_template{
	public static void main (String str[]) throws IOException {
		Scanner scan = new Scanner (System.in);
		String movies [] = new String [5];

		for (int i = 0; i < movies.length; i++) {
			System.out.println("Please enter a movie title");
			movies[i] = scan.nextLine();
		}

		for (int i = 0; i < movies.length; i++) {
			System.out.println(movies[i]);
		}
	}
}


