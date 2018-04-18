/*
 * Lesson 9 - Unit 5 - Advanced Classes - Abstract classes
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.io.*;

class t2_lesson9_template{


     public static void main (String str[]) throws IOException {
     	// illegal - you cannot instantiate abstract classes
        // Quadrilateral q = new Quadrilateral(1, 2, 3, 4);

        Rectangle r = new Rectangle(2, 5);
        System.out.println(r.getArea());
     }

}


