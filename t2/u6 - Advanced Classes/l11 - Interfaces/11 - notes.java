/*
Interfaces
- ultimate to-do list: nothing but method headers, no variables, no code
- Why do we make interfaces?
* creates a standard way of doing something
* used in unrelated classes
* ex: Book and String are not related but both have a similar behavior for comparing

Ex: Comparable: a standard way for objects to be compared
- only one method: compareTo(Object o)
- Used in String, Integer, etc.

| Value | Meaning                                                            |
|-------|--------------------------------------------------------------------|
| <0    | this instance precedes obj in the sort order                       |
| 0     | this instance occurs in the same position in the sort order as obj |
| >0    | this instance follows obj in the sort order                        |

- any object that implements comparable will behave this way

Ex: list: a standard way for object to be stored

Use *implements* for interfaces (not *extends*)

*/