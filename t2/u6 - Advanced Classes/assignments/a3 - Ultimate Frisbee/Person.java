public class Person {

	private String firstName;
	private String lastName;

	public Person(String f, String l) {
		firstName = f;
		lastName = l;
	}

	public String toString() {
		return lastName + ", " + firstName;
	}

}