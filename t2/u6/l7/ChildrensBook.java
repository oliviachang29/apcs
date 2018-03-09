public class ChildrensBook extends Book {
	private String illustrator;
	public ChildrensBook() {
		this("none", "unknown", "unknown", 1450);
	}

	public ChildrensBook(String t, String a, String i, int y) {
		super(t, a, y); // calls constructor in Book class
		illustrator = i;
	}

	public String toString() {
		return super.toString() + "\n\t" + illustrator;
	}
}