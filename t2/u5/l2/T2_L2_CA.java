import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.util.ArrayList;

import java.lang.Math;

class T2_L2_CA {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter words, enter STOP to stop the loop.");
		ArrayList <String> list = new <String> ArrayList ();
		String val = scan.nextLine();
		while (!val.equals("STOP")) {
			list.add(val);
			val = scan.nextLine();
		}

		for (String a: list) {
			if (a.indexOf('a') != -1) {
				System.out.println(a);
			}
		}
	}
}