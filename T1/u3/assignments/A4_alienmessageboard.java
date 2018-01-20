/*
 * Assignment 4: Alien Message Board
*/

import java.util.Scanner;
import java.lang.Math;

class A4_alienmessageboard {
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Enter message board post:");
    	String post = scan.nextLine();

        int first_space = 0;

    	int caret = 0; // ^^
    	int qey = 0;
    	int cash = 0; // $

    	int c = 0;
    	while (c < post.length()) {
    		if (post.charAt(c) == ' ') {
                if (first_space == 0) {
                    first_space = c;
                } else {
                    if ((c <= post.length() - 3) && (post.substring(c+1, c+3).equals("^^")) && ((c == post.length() - 3 || post.charAt(c+3) == ' '))) {
                        caret++;
                    } else if ((c <= post.length() - 4) && (post.substring(c+1, c+4).toLowerCase().equals("qey")) && ((c == post.length() - 4 || post.charAt(c+4) == ' '))) {
                        qey++;
                    } else if ((c <= post.length() - 2) && (post.charAt(c+1) == '$') && (c == post.length() - 2 || post.charAt(c+2) == ' ')) {
                        cash++;
                    }
                }
    		}
    		c++;
    	}

        String username = post.substring(0, first_space);
    	
    	if ((caret > 0) || (qey > 0) || (cash > 0)) {
    		System.out.println("BAD");
    		System.out.println(username);
    		System.out.println("^^: " + caret);
    		System.out.println("qey: " + qey);
    		System.out.println("$: " + cash);
    	} else {
    		System.out.println("CLEAN");
    	}
    }
}