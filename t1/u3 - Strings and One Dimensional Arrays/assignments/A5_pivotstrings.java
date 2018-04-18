/*
 * Assignment 5: Pivot Strings
*/

import java.util.Scanner;
import java.lang.Math;

class A5_pivotstrings {
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Enter the first String:");
    	String value = scan.nextLine();
        System.out.println("Enter the pivot String:");
        String pivot = scan.nextLine();

        boolean pivotExists = false;

        int i;

        for (i = 0; i < value.length(); i++) {
            // if the current letter matches the pivot string's first character
            // check if there are enough letters ahead for the pivot string to fit
            if (value.charAt(i) == pivot.charAt(0) && value.length() - i >= pivot.length()) {
                if (value.substring(i, i + pivot.length()).equals(pivot)) {
                    pivotExists = true;
                    break;
                }
            }
        }

        if (pivotExists) { 
            String beginning = value.substring(0, i); // don't include the beginning of the pivot string

            int endSubstringFirstVal;
            if (value.charAt(i+pivot.length()) == ' ') {
                endSubstringFirstVal = i+pivot.length() + 1;
            } else {
                endSubstringFirstVal = i+pivot.length();
            }
            String end = value.substring(endSubstringFirstVal, value.length());

            boolean space1 = value.charAt(i-1) == ' ';
            boolean space2 = value.charAt(i+pivot.length()) == ' ';
            if (space1 && space2) {
                System.out.println(end + " " + pivot + " " + beginning);
            } else if (space1) {
                System.out.println(end + " " + pivot + beginning);
            } else if (space2) {
                System.out.println(end + pivot + " " + beginning);
            } else {
                System.out.println(end + pivot + beginning);
            }

        } else {
            System.out.println("Error: Pivot String not found.");
        }
    }
}