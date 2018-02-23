/*
Return command: returns a value back to whatever is calling the method
- can only return one thing at a time
- one java hits the return, it ignores all code after (like break statement)
- methods can return any type, primitive or class
- when it returns a primitive type, it returns a copy of the value
- when it returns a class type, it returns the reference in memory

- have to change method header so that it tells Java that you are returning a value
- public static int/String/char etc.

Calling return methods:
- must do something to catch the data sent back
* store in a variable
* print it out
* use in a boolean condition

Basic idea:
- sent method data using parameters
- multiple parameters
- send data back using a return statement
- method returns only one value

- Void: perform an action
* you can actually use return in a void method like a break statement, just can't return anything in it
- Return: computing a value
*/

public static int max (int a, int b) {
	if (a > b)
		return a;
	return b;
}

System.out.println ("The largest is: " + max (x, y));
x = max (a, b); 