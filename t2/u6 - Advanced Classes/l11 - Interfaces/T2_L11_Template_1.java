/*
 * Lesson 11 - Unit 6 - Interfaces
 */


import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t2_lesson11_template_1{


     public static void main (String str[]) throws IOException {
	     String s1 = "apple";
	     String s2 = "banana";

	     System.out.println(s1.compareTo(s2));

	     //  This is illegal: Polygon is abstract; cannot be instantiated (polygon is an interface)
	     // Polygon p = new Polygon();
	     // Quadrilateral q = new Quadrilateral();
	     
	     // This is legal, because Rectangle is not abstract
	     Rectangle r = new Rectangle(10, 100);
     }

}


