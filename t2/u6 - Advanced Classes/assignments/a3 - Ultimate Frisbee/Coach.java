public class Coach extends Person {
	// This is a flexible description; there are no required values for this variable. 
	// For example, “Head Coach” or “Assistant Coach”.
	private String role;

	public Coach (String f, String l, String r) {
		super(f, l);
		role = r;
	}

	public String toString() {
		return super.toString() + "\n   Role: " + role;
	}

}