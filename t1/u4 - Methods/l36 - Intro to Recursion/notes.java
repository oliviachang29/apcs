/*

Recursion: a method that repeats by calling itself
- call to itself (the recursion)
- base case to stop the recursion, usually an if statement
- recursion can be rewritten with a loop
- used to simplify coding when the algorithm is repeated on a smaller and smaller set of data
*/

public static void printDecimal (int n) {
	if (n >= 10)
		printDecimal(n/10);
	System.out.println(n%10);
}

/* n = 1497
Java holds the System.out.println(n%10) in a "waiting area"

Result:
1
4
9
7


Stack: location in memory where the interrupted method calls are stored
- once the base case is hit the program moves through the stack and carries out all the commands

*/