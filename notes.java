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
--
// Math functions
// abs val
System.out.println(Math.abs(x - y));
System.out.println(Math.abs(a - b));

// pow - x ^ y
// everything sent back from pow is a double
System.out.println(Math.pow(x, y));

// sqrt
// sends back a double
System.out.println(Math.sqrt(x));

// random
System.out.println(Math.random()); // get a random decimal from (0, 1)
System.out.println(Math.random() * 100); // getting random decimals from (0, 99)
System.out.println((int)(Math.random() * 100)); // getting random integers from (0, 99)
System.out.println((int)(Math.random() * 100) + 1); // getting random integers from (1, 100) - bumps everything up by 1
// want numbers from -20 and positive 20 inclusive
System.out.println((int)(Math.random() * 41) + -20); // 41 numbers in that range, lowest number is -20

// getting number of digits of an integer
int length = String.valueOf(number).length();
--
// You CAN have two if statements together, ex:
if (month == 4)
if (day <= 21)
    System.out.println("Aries");
--
// substring
String w1;
String w2 = "apple";
String w3 = "banana";
w1 = w3.substring(1,3); // result: an
// substring is first inclusive, last exclusive
w1 = w3.substring(2); // returns ana
// everything on from that point, inclusive
--
// array creation
int [] a = new int[4];
int[] a = {1,2,3,4};
--
// Methods
// Returning arrays
return new int [] {1, 2, 3};

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

/* 
ArrayList methods 

| list.add(e)    | adds e to end of list        |
|----------------|------------------------------|
| list.add(i, e) | adds e to location i         |
|----------------|------------------------------|
| list.set(i, e) | change value at index i to e |
|----------------|------------------------------|
| list.get(i)    | returns value at i           |
|----------------|------------------------------|
| list.remove(i) | removes element at i         |

*/