// Getting length
word.length()

// Concatentation
word3 = word1 + word2;
// + symvol is *overloaded*: has multiple uses depending on the situtation
 

// * Methods: tools to change the data/work on the classes themselves

.equals()
/*
- can't use ==
- instead, use .equals()
- built-in method for strings
- tests if contents are exactly equal (upper and lowercase)
*/

.charAt()
/*
- tells you what letter is at a spot in the String
- first spot is 0
*/

String w = "variable";
w.charAt(2); // r, NOT a

.indexOf(c)
/*
- put in a character, tells where it is
- use char '' not strings
*/

String w = "variable";
w.indexOf('i'); // 3, NOT 4

.substring (start, stop)
/*
- pulls off a section of a string from start to *stop - 1*
- basically, doesn't include 5
- includes start, excludes stop
*/

String w = "variable";
w.substring(2, 5); // "ria", includes 2 to 4 (excludes 5)

.substring(start)
// pulls section of string from specified start to end of array

String w = "variable";
w.substring(4); // able - includes the start position

/*
.toUpperCase()
.toLowerCase()
*/

.compareTo(other)
/*
- compares two strings alphabetically
- if x < y, < 0
- if x == y, 0
- if x > y, > 0

*/

String s = "ardvark";
s.compareTo("zebra"); // -25