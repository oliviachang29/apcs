public class UltimatePlayer extends Person {
	private int jerseyNumber;
	private String position;
	private static int id;

	public UltimatePlayer(String f, String l, String pos) {
		super(f, l);
		id++;
		if (pos.equals("cutter")) {
			position = "cutter";
		} else {
			position = "handler";
		}
		jerseyNumber = id;
	}

	public String toString() {
		return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
	}

	public String getPosition() {
		return position;
	}
}