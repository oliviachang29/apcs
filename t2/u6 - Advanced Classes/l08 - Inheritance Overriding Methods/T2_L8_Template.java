/*
 * Lesson 8 - Unit 5 - Advanced Classes - Inheritance Overriding Methods
 */


import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t2_lesson08_template{
  
    public static void main (String str[]) throws IOException {
       Quadrilateral q = new Quadrilateral (3, 7, 6, 7);
       System.out.println("Perimeter: \t" + q.getPerimeter());
          
       Rectangle r = new Rectangle(4, 5);
       System.out.println("Perimeter: \t" + r.getPerimeter());

     }

}