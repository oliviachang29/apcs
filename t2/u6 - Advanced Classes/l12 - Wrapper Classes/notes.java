/* Wrapper Classes:
- Wraps a primitive in a class type
- there is a wrapper class for each of the primitive types
* Double -> double
* Integer -> int

Integer
- this is a wrapper class for int
- implements comparable
- this means that: */
Integer n1 = new Integer (45);
Integer n2 = new Integer (56);
System.out.println(n1.compareTo(n2));
/* Outputs a negative value
- Integer class has fields (constnants)
- ex: Integer.MAX_VALUE, Integer.MIN_VALUE

Double
- this is a wrapper class for double
- means that you can actually use it in an ArrayList
*/