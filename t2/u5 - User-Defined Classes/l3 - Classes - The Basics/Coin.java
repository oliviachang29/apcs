import java.lang.Math;

public class Coin {
	private int side;

	public Coin () {
		// default is heads
		// side = 1;

		// start off with random value
		flip();
	}

	public void flip () {
		side = (int) (Math.random() * 2);
	}

	public int getValue() {
		return side;
	}

	public void setValue(int s) {
		if (s == 0 || s == 1)
			side = s;
	}

	public String toString() {
		if (side == 1) {
			return "head";
		} else {
			return "tail";
		}
	}
}