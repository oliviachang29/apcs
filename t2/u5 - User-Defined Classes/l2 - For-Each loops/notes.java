// FOr-each

for (type e: collecting) {
	// do something with e
	// e is a temporary variable
	// need to create a spot in memory to refer to each string (e)
}

ArrayList <String> breed = new ArrayList();
breed.add("Boxer");
breed.add("Doxen");
breed.add("Poodle");

for (String s: breed) {
	System.out.println(s);
}

/*
How are these different from regular for loops?
- regular for loops require an exact number of times to repeat an action
- for each loops say: do this to every item in a collection
- for-each loop avoids off-by-one errors
*/