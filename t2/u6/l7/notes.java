// Lesson 7: Inheritance

extends 
/*  
- using the word extends links the two classes together
- the Child (ChildrensBook) extends from the Parent (Book)
- a class can only extend one class, but you can have several in a chain 
*/

super()
/*  
- use super() to call class above (parent class)
- if the parent class doesn't have a constructor, then Java looks at the next parent class up the ladder
- super() in a constructor must always be the first line
- at the top, All classes inherit from Object
- Object sets the equals and toString
*/