public class Book {
	// make all variables private when designing from scratch
	private String title;
	private String author;
	private int year;

	// constructor - has no void or return type
	// always have to be public
	public Book(String t, String a, int y) {
		title = t;
		author = a;
		if (y >= 1450)
			year = y;
		else
			year = 1900; // arbitrary date
	}

	// java will look for a toString() for every class you make
	// so that System.out.print() can print it out
	// formatted to print out any way you want
	public String toString() {
		return title + "\n" + author + "\n" + year;
	}
}