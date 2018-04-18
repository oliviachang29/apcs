// Overloading
w.substring(4);
w.substring(2, 5);
// substring() is an overloaded method because they use a different set of parameters
// but same kind of operation

/*
Overloading: each method does same kind of operation, on diff sets of data
- efficient
- example of polymorphism - allows avlues of different data types to be handled using a uniform interface

How does Java tell the methods apart?
- Signature: number and types of parameters
* signature does not include the return type

*/

public static int add(int a)
public static double add(int a)
// java can't tell the diff, will throw an error