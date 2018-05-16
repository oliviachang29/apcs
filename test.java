
import java.io.*;
import static java.lang.System.*;
import java.util.ArrayList;

import java.util.Scanner;

class test {
	public static int swapDigits (int n) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int temp = n;
		while (temp > 0) {
			digits.add(temp%10);
			temp /= 10;
		}
		temp = 0;
		for (int i = 0; i < digits.size(); i++) {
			int x = (int)(digits.get(i) * Math.pow(10, digits.size()-i-1));
			temp += x;
			// System.out.println(x);
		}
		return temp;
	}

 	public static void main (String str[]) throws IOException {
 		System.out.println(swapDigits(9203));
 	}
}


