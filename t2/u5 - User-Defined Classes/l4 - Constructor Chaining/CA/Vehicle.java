public class Vehicle {
	private int location;
	public Vehicle () {
		this(0);
	}

	public Vehicle(int loc) {
		setLocation(loc);
	}

	public void setLocation(int loc) {
		if (loc >= -20 && loc <= 20) {
			location = loc;
		}
	}

	public void forward () {
		setLocation(location + 1);
	}

	public void backward () {
		setLocation(location - 1);
	}

	public int getLocation() {
		return location;
	}

	public String toString() {
		String k = "";
		for (int i = -20; i < location; i++) {
			k += " ";
		}
		return k + "@";
	}

}