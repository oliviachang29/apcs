
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class test {
 	public static void main (String str[]) throws IOException {
 		Scanner scan = new Scanner (System.in);
		double farthestNorth = 5000;
		double farthestSouth = 5000;
		double farthestEast = 5000;
		double farthestWest = 5000;

		double currentLatitude;
		double currentLongitude; 

		boolean error = false;

		int n = 1;
		while (n != 0 && n == 1) {
			System.out.println("Please enter the latitude:");
			currentLatitude = scan.nextDouble();
			if (currentLatitude >= -90  && currentLatitude <= 90) {
				// north
				if (currentLatitude > farthestNorth || farthestNorth == 5000) {
					farthestNorth = currentLatitude;
				}
				// south
				if (currentLatitude < farthestSouth || farthestSouth == 5000) {
					farthestSouth = currentLatitude;
				}
			} else {
				error = true;
			}

			System.out.println("Please enter the longitude:");
			currentLongitude = scan.nextDouble();
			if (currentLongitude >= -180  && currentLongitude <= 180) {
				// east
				if (currentLongitude > farthestEast || farthestEast == 5000) {
					farthestEast = currentLongitude;
				}
				// west
				if (currentLongitude < farthestWest || farthestWest == 5000) {
					farthestWest = currentLongitude;
				}
			} else {
				error = true;
			}

			if (error) {
				System.out.println("Incorrect Latitude or Longitude");
				error = false;
				n = 1;
			} else {
				System.out.println("Would you like to enter another location?");
				n = scan.nextInt();
			}
			
		} 

		System.out.println("Farthest North: " + farthestNorth);
		System.out.println("Farthest South: " + farthestSouth);
		System.out.println("Farthest East: " + farthestEast);
		System.out.println("Farthest West: " + farthestWest);
	
	}
}


