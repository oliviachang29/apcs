/*
 * Assignment 1: Movie Ratings
*/

import java.util.Scanner;
import java.lang.Math;

class A1_movieratings {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter ratings from the movie review website.");
        int website1 = scan.nextInt();
        int website2 = scan.nextInt();
        int website3 = scan.nextInt();
        System.out.println("Please enter ratings from the focus group.");
        double focus1 = scan.nextDouble();
        double focus2 = scan.nextDouble();
        System.out.println("Please enter the average movie critic rating.");
        double critic = scan.nextDouble();

        int websiteSum = website1 + website2 + website3;
        double websiteAvg = (double) websiteSum / 3;
        System.out.println("Average website rating: " + websiteAvg);

        double focusSum = focus1 + focus2;
        double focusAvg = (double) focusSum / 2;
        System.out.println("Average focus group rating: " + focusAvg);

        System.out.println("Average movie critic rating: " + critic);

        double weightedAvg = (0.2 * websiteAvg) + (0.3 * focusAvg) + (0.5 * critic);
        System.out.println("Overall movie rating: " + weightedAvg);
    }
}