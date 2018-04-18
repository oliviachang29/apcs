/* Parameters
- parameter: local variable in a method header that holds the data sent in
- data type of the parameter makes a difference (primitive vs. class data types)

rules:
- as many as you need
- any combination of data types
- values are from main (or the calling method)
- arguments: data sent to a method
- argument data type must match parameter data type
*/

// Example
public static void sum(int a, int b) {
	System.out.println("answer = " + (a + b));
}
