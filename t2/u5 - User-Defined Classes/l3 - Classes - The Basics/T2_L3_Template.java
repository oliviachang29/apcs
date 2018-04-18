import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.*;
 
class t2_lesson03_template{

     
     public static void main (String str[]) throws IOException {
          
     	// Book b = new Book ("Charlie and the Chocolate Factory", "Roald Dahl", 1964);
        // System.out.println(b);

        Coin c = new Coin ();
        System.out.println(c);
        // c.flip();
        // c.side = 1; // illegal - private access
        c.setValue(0);
        System.out.println(c); // tails
        c.setValue(1);
        System.out.println(c); // heads
        c.setValue(-1001); // doesn't do anything
        System.out.println(c); // c.getValue() is still heads
     }
}




