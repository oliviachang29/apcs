import java.io.*;
import java.lang.Math;
import static java.lang.System.*;

class Lesson_17_Activity {
	public static boolean isSorted(int [] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static int binarySearch(int [] a, int b) {
		int high = a.length - 1;
		int low = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			System.out.println("\nMid: " + mid + "\nHigh: " + high + "\nLow: " + low);
			if (a[mid] == b) {
				return mid;
			} else if (a[mid] > b) { // too high
				high = mid - 1;
				// System.out.println("A");
			} else if (a[mid] < b) { // too low
				low = mid + 1;
				// System.out.println("B");
			}

		}
		return -1;
	}

	public static void sort(int [] a) {
		for (int i = 0; i < a.length; i++) {
			// find smallest
			int smallest = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
	}

	public static void main (String str[]) throws IOException {
		int [] test = new int [10];
		// generate array
		for (int i = 0; i < test.length - 1; i++) {
			test[i] = (int)(Math.random()*100); // 0 to 99
		}
		test[test.length - 1] = 57;

		sort(test);
		// if (isSorted(test)) {
		// 	System.out.println("It's sorted");
		// } else {
		// 	System.out.println("It's not sorted");
		// }

		// print out array
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}

		System.out.println("Looking for 57: " + binarySearch(test, 57));
	}
}