class Rectangle
{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea()
	{
		double area = length * breadth;
		return area;
	}

	public double calculatePerimeter()
	{
		double perimeter = 2 * (length + breadth);
		return perimeter;	
	}

	public void show()
	{
		System.out.println("Area = "+calculateArea());
		System.out.println("Perimeter = "+calculatePerimeter());
	}
		
		
}