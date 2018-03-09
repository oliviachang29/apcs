// separate file with the class
// class is public, variables are private

/*
Object: has variables and methods
- an object is an instance of a class

Variables: the state (condition) of the object (data)
Methods: behavior (actions) of the object (ex: String.charAt)

- Class is a template for an object - it's the data type
- Class data types include variables and methods

Analogy: the class is the blueprint, which can be used to make many houses
*/

Book b = new Book ("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1991);

// Book is the class
// b is the object

/*
Instantiation: create a variable in memory
- creates a reference to Book object
- reference is stored in b

Constructor: method in a class that builds class in memory
- sets values in variables
- has the same name as class 
- can have more than one (difference is signatures), can call each other
- never have a return type or void
- always public
- this() inside a constructor must be the first line

- Constuctors build objects
- the *new* command calls the constructor method in the class
- returns a reference to a newly created object

*/

/*
Public v. Private

Public: can be used by a program *outside* this file
Private: means it can only be used by *this* class
- ALL variables are private

Get and Set
- accessors (get) and mutators (set - ex: flip, setValue)
- controls how user can get to the values
*/