public class Captain extends UltimatePlayer {
	private boolean type;
	// true for offense, false for defense
	public Captain(String f, String l, String pos, boolean t) {
		super(f, l, pos);
		type = t;
	}

	public String toString() {
		String t = "defense";
		if (type)
			t = "offense";

		return super.toString() + "\n   Captain: " + t;
	}
}