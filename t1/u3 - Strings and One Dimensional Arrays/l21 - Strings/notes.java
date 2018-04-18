/* 

* Primitive data types: 
- ex: double, int

* Class data types: 
- hold more than one piece of data at a time
- can hold different types
- build in methods
- users can create their own classes
- ex: String

How are variables stored in memory?
* Primitive: varaible holds actual value
* Class: variable holds memory location of actual data - refers to it
- because it can't fit everything it can hold in the "box" (reference)

*/

String a = "what";
String b = a;
// Both b & a point to the same spot

String word;
// word holds *null* - special value that means "no reference"

String alpha = "The final frontier"; // somewhere in memory, "The final frontier" is stored
alpha = null; // erases the pointer from alpha to "The final frontier"
// "The final frontier" is cleaned up - Java erases it

String alpha = "The final frontier";
String beta = alpha; // copies same reference over
alpha = null; // alpha's reference to "The final frontier" is erased
// BUT - "The final frontier" is NOT garbage collected because there is still a pointer from beta to "The final frontier"

// Why can't I use ==?
String a = "Howdy";
String b = "Howdy";
// The == tests the value stored directly in a & b.
// A and b have different memory locations
// Therefore, == will return false.