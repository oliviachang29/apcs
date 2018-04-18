/*
Static: is *modifier* - it is added to a method or a variable
- means only one copy exists for all objects of that class
- all objects share this variable or method
- in general used to:
1. create a counter
2. create constants

Constant: value that cannot change
- variable name is usually typed in all uppercase letters
ex: public static final double PI = 3.14159;
- static: all instances can access pi
- final: variable cannot be changed
- PI++ is illegal

ex: public static void main
- static means you do not need to create an *object* to use the method
- java looks for the main method to figure out where to start code

Static Methods: do not need to create an object to use them
Ex: Math.random()
- you get to these methods by using the Class name and the dot operator (.)
Difference than String.indexOf - you have to have a string to work on
*/