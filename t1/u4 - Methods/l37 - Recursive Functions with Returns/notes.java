// Example of a recursive return method:
public static int sum1 (int n) {
	if (n==0) {
		return 0;
	} else {
		return n + sum1(n-1);
	}
}

/*
Tracing code:
sum1(5) ->
Returns: 5 + 4 + 3 + 2 + 1 + 0 = 15
*/

// Factorial:

public static int factorial (int n) {
	if (n==0) {
		return 0; 
	} else {
		return n * factorial(n-1);
	}
}