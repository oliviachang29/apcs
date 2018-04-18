import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.util.ArrayList;

import java.lang.Math;

class T2_L1_CA {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter words, enter STOP to stop the loop.");
		ArrayList <String> list = new ArrayList <String> ();
		String val = scan.nextLine();
		while (!val.equals("STOP")) {
			list.add(val);
			val = scan.nextLine();
		}
		int size = list.size();
		System.out.println(size);

		System.out.println(list);
		if (size > 2) {
			list.remove(size-1);
			list.remove(0);
		}

		System.out.println(list);
	}
}