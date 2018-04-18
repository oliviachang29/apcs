/*
 * Discussion Questions
 */


import java.util.Scanner;

class Lesson_37_DQ {

     public static void recur1(int n)
     { 
         if (n > 1)
             recur1(n / 10); 
         System.out.print(n % 10 + " ");
     }

    public static void loop1(int n) {
        String val = String.valueOf(n);
        if ((int) n / (Math.pow(10, val.length() - 1)) > 1) {
            System.out.print(0 + " ");
        }
        for (int i = 0; i < val.length(); i++) {
            System.out.print((val.charAt(i)) + " ");
        }
    }

    public static void recur2(int n)
     { 
         if (n > 1)
             recur2(n - 1); 
     
         System.out.print(n+ " ");
     }

    public static void loop2 (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
     
    public static void main(String[] args)
    {
        // recur1(4999);
        // System.out.println(" ");
        // loop1(4999);
        recur2(12);
        System.out.println(" ");
        loop2(12);
    }
}