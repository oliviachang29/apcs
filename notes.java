/* primitive data types
- boolean
- byte
- char
- short
- int
- long
- float
- double

// data types in terms of memory used, smallest to largest
char, int, double, String
*/

// You CAN have two if statements together, ex:
if (month == 4)
if (day <= 21)
    System.out.println("Aries");

// substring
String w1;
String w2 = "apple";
String w3 = "banana";
w1 = w3.substring(1,3); // result: an
// substring is first inclusive, last exclusive
w1 = w3.substring(2); // returns ana
// everything on from that point, inclusive

// array creation
int [] a = new int[4];
int[] a = {1,2,3,4};

// Recursion
// Recursive methods have a call to iself (the recursion)
// and a base case to stop the recursion, usually an if statement

public static double mystery(int n) {
    if (n > 0)
        mystery(n - 1);
    return n;
}
mystery(8); // returns 8.0 because java returns the last in the stack

// Will not run because the only return statement is inside an if, 
// so it may never return a value
// Java will not let you write this
public static int mystery(int n) {
    n--;

    if (n <= 0)
        return n + 1;

    mystery(n - 1);
}

