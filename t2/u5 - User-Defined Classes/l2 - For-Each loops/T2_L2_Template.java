import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.*;

class t2_lesson02_template{

  
     public static void main (String str[]) throws IOException {
          
          ArrayList <String> books = new <String> ArrayList();
          
          //add book titles
          books.add("The Secret of the Old Clock");
          books.add("Mystery of Crocodile Island");
          books.add("The Hidden Staircase");
          books.add("The Bungalow Mystery");
          books.add("The Quest of the Missing Map");
          books.add("The Clue in the Crossword Cipher");
          
          System.out.println(books);
          
          for (String b: books) {
               if (b.indexOf('C') != -1) {
                    // System.out.println(b);
                    // books.remove(b);
                    // the above commands get the error:
                    // Exception in thread "main" java.util.ConcurrentModificationException
                    // so whenever you want to remove something, you need to use a normal for loop
               }
          }

          /* Attempt 1: Take out books with C in them
          for (int i = 0; i < books.size(); i++) {
               if (books.get(i).indexOf('C') != -1) {
                    books.remove(i);
               }
          } */
          // doesn't work, because if you start at 0 and remove the first item, then it skips to the third item

          // Attempt 2: Take out books with C, but count backwards
          for (int i = books.size() - 1; i >=0; i--) {
               if (books.get(i).indexOf('C') != -1) {
                    books.remove(i);
               }
          }

          System.out.println(books);

     }

}


