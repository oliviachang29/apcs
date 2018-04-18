public class Rectangle extends Quadrilateral {
	public Rectangle (int a, int b) {
		super (a, b, a, b);
	}

	public int getPerimeter() {
		return 2*super.getSide1() + 2*super.getSide2();
	}
}