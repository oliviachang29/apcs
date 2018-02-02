/*
 * Assignment 6: Arrays Merge
*/

import java.util.Scanner;
import java.lang.Math;

class A6_namesmerge {
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
        String array1 [] = new String [10000];
        String array2 [] = new String [10000];
    	System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit:");
        String input = scan.nextLine();
        boolean correctOrder = true;
        int c = 0;
        while (!input.toLowerCase().equals("end")) {
            if (c != 0) {
                if (input.compareTo(array1[c-1]) < 0) {
                    correctOrder = false;
                }
            }
        
            int length = input.length();
            String firstLetter = input.substring(0, 1).toUpperCase();
            String secondPart = "";
            if (length >= 2) {
                secondPart = input.toLowerCase().substring(1, length);
            }
            String temp = firstLetter + secondPart;
            array1[c] = temp;
            c++;
            input = scan.nextLine();
        }
    	
        System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
        int k = 0;
        input = scan.nextLine();
        while (!input.toLowerCase().equals("end")) {
            if (k != 0) {
                if (input.compareTo(array2[k-1]) < 0) {
                    correctOrder = false;
                }
            }
            int length = input.length();
            String firstLetter = input.substring(0, 1).toUpperCase();
            String secondPart = "";
            if (length >= 2) {
                secondPart = input.toLowerCase().substring(1, length);
            }
            String temp = firstLetter + secondPart;
            array2[k] = temp;
            k++;
            input = scan.nextLine();
        }

        System.out.println("First Array");
        for (int i = 0; i < c; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.print("\n\n");

        System.out.println("Second Array");
        for (int i = 0; i < k; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.print("\n\n");

        if (correctOrder) {
            int a = 0;
            int b = 0;

            System.out.println("Merged Array");
            for (int i = 0; i < c + k; i++) {
                if (a >= c) {
                    if (b < k) {
                        System.out.print(array2[b] + " ");
                        b++;
                    }
                } else if (b >= k) {
                    if (a < c) {
                        System.out.print(array1[a] + " ");
                        a++;
                    }
                } else if (array1[a].compareTo(array2[b]) < 0) {
                    System.out.print(array1[a] + " ");
                    a++;
                } else {
                    System.out.print(array2[b] + " ");
                    b++;
                }
            }
        } else {
            System.out.println("Error: Arrays not in correct order");
        }

    }
}