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

    	int num_caret = 0; // ^^
    	int num_qey = 0;
    	int num_cash = 0; // $

        String caret = "^^";
        String qey = "qey";
        String cash = "$";

        for (int j = 0; j < post.length(); j++) {
            int i = j + 1;
            if (post.charAt(j) == ' ') {
                if (first_space == 0) {
                    first_space = j;
                } else {
                    if (post.charAt(i) == caret.charAt(0) && post.length() - i >= caret.length()) {
                        if (post.substring(i, i + caret.length()).equals(caret)) {
                            if (post.length() - i == caret.length() || post.charAt(i+caret.length()) == ' ') {
                                num_caret++;
                            }
                        }
                    } else if (post.charAt(i) == 'q' || post.charAt(i) == 'Q') {
                        if (post.substring(i, i + qey.length()).toLowerCase().equals(qey)) {
                            if (post.length() - i == qey.length() || post.charAt(i+qey.length()) == ' ') {
                                num_qey++;
                            }
                        }
                    } else if (post.charAt(i) == cash.charAt(0)) {
                        if (post.substring(i, i + cash.length()).equals(cash)) {
                            if (post.length() - i == cash.length() || post.charAt(i+cash.length()) == ' ') {
                                num_cash++;
                            }
                        }
                    }
                }
            }
        }

    	// int c = 0;
    	// while (c < post.length()) {
    	// 	if (post.charAt(c) == ' ') {
     //            if (first_space == 0) {
     //                first_space = c;
     //            } else {
     //                if ((c <= post.length() - 3) && (post.substring(c+1, c+3).equals("^^")) && ((c == post.length() - 3 || post.charAt(c+3) == ' '))) {
     //                    num_caret++;
     //                } else if ((c <= post.length() - 4) && (post.substring(c+1, c+4).toLowerCase().equals("qey")) && ((c == post.length() - 4 || post.charAt(c+4) == ' '))) {
     //                    num_qey++;
     //                } else if ((c <= post.length() - 2) && (post.charAt(c+1) == '$') && (c == post.length() - 2 || post.charAt(c+2) == ' ')) {
     //                    num_cash++;
     //                }
     //            }
    	// 	}
    	// 	c++;
    	// }

        String username = post.substring(0, first_space);
    	
    	if ((num_caret > 0) || (num_qey > 0) || (num_cash > 0)) {
    		System.out.println("BAD");
    		System.out.println(username);
    		System.out.println("^^: " + num_caret);
    		System.out.println("qey: " + num_qey);
    		System.out.println("$: " + num_cash);
    	} else {
    		System.out.println("CLEAN");
    	}
    }
}