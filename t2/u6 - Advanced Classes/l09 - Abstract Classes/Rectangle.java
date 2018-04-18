public class Rectangle extends Quadrilateral
{
    public Rectangle(int a, int b)
    {
        super(a,b,a,b);
    }

    public int getPerimeter()
    {
        return 2*getSide1() + 2*getSide2();
    }

    public int getArea() {
    	return getSide1() * getSide2();
    }

}