/*
 * Lesson 35 Coding Activity
 * 
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 * 
 * Write four overloaded methods called randomize. 
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters. 
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter. 
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters. 
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter. 
 * 
 * Because these methods are overloaded, they should be declared in the same class. 
 * To simulate this, copy all four methods into the single Code Runner box.
 */


import java.util.Scanner;

class Lesson_35_Activity {
     
    // This method must have two int paramters called min and max. 
    // This method returns a random int between min and max inclusive. 
    public static int randomize(int min, int max) {
        int temp = (int)(Math.random() * (max - min +1)) + min;
        return temp;
    }

    // This method must have one int parameter max. 
    // Returns a random int between 0 and max inclusive.
    public static int randomize(int max) {
        int temp = (int)(Math.random() * (max + 1));
        return temp;
    }

    // This method must have two double parameters. 
    // This method returns a random double between min and max inclusive.
    public static double randomize(double min, double max) {
        double temp = (Math.random() * (max - min)) + min;
        return temp;
    }

    // This method must have one double parameter.
    // This method returns a random double between 0 and max inclusive.
    public static double randomize(double max) {
        double temp = (Math.random() * (max));
        return temp;
    }
     
    public static void main(String[] args)
    {
        // System.out.println(randomize(0.5, 10.1));
        // System.out.println(randomize(10.1));
    }
}