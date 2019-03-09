
class RectangleTest
{
	
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(20, 30);
		
		System.out.println("Rectangle1");
		r1.show();

		System.out.println("Rectangle2");
		r2.show();


		if(r1.calculateArea() == r2.calculateArea())
			System.out.println("Equal area");
		else
			System.out.println("unequal area");

		if(r1.calculatePerimeter() == r2.calculatePerimeter())
			System.out.println("Equal perimeter");
		else
			System.out.println("unequal perimeter");
							
	}
}
