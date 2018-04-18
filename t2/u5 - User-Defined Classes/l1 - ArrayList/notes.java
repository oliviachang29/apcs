/* 
What is an ArrayList?
- A collection of objects.
- ArrayLists only store class types (no ints, do doubles, no bools)
- Only holds reference to the objects it is storing.
- Size is not fixed
* Can add and remove elements
- Has built in methods for many common operations
* Insertion, deletion, sorting, etc.
*/

// Declaring an ArrayList
import java.util.ArrayList;

ArrayList list = new ArrayList(); // empty 

ArrayList list2 = new ArrayList(10); // give with size

ArrayList <String> stringList = new ArrayList <String> (); // specify type
// when type is specified, Java does not give out warnings.

/* 
// ArrayList required methods 

| list.add(e)    | adds e to end of list        |
|----------------|------------------------------|
| list.add(i, e) | adds e to location i         |
|----------------|------------------------------|
| list.set(i, e) | change value at index i to e |
|----------------|------------------------------|
| list.get(i)    | returns value at i           |
|----------------|------------------------------|
| list.remove(i) | removes element at i         |

// Other helpful methods

| list.size()      | returns size                    |
|------------------|---------------------------------|
| list.contains(e) | is it there? returns true/false |
|------------------|---------------------------------|
| list.clear()     | empties array                   |

*/