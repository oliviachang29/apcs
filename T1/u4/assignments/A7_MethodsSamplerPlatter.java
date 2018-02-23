/*
 * Assignment 7: Methods Sampler Platter
*/

import java.util.Scanner;
import java.lang.Math;

class A7_MethodsSamplerPlatter {
    public static String duplicate (String str) {
        String duplicate = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            int rep = str.length();
            if (str.length() % 2 == 0) // if it's even
                rep = str.length()*2;

            for (int k = 0; k < rep; k++) {
                temp += str.charAt(i);
            }

            duplicate += temp;
        }
        return duplicate;
    }

    public static char convert (char c) {
        char temp = c;
        if (temp == '4') {
            temp = 'a';
        } else if (temp == '3') {
            temp = '3';
        } else if (temp == '0') {
            temp = 'o';
        }
        return temp;
    }

    public static boolean isEdhesivePalindrome(String str) {
        String val = str.toLowerCase();
        int length = val.length();
        if (length <= 3 || length >= 15) {
            System.out.println("Length is incorrect");
            return false;
        }
        for (int i = 0; i < length/2; i++) {
            char current = convert(val.charAt(i));
            char end = convert(val.charAt(length - 1 - i));

            if (current != end) {
                return false;
            }
        }
        return true;
    }

    public static double numberScramble(double num) {
        if (num < 0) {
            return 0.0;
        }

        double temp = Math.sqrt((num + 5) / 2);
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
    	System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        String one = scan.nextLine();
        System.out.println("The duplicated String is: " + duplicate(one));
        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        String two = scan.nextLine();
        if (isEdhesivePalindrome(two)) {
            System.out.println("Nice, you found an Edhesive Palindrome!");
        } else {
            System.out.println("Too bad, that isn't an Edhesive Palindrome.");
        }
        System.out.println("Almost done! Please enter a number to scramble.");
        double three = scan.nextDouble();
        System.out.println("The scrambled number is: " + numberScramble(three));
    }
}