class Distance
{
	private int feet;
	private double inches;

	public void setData(double feet, double inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	
	public void display()
	{
		System.out.println(feet+" feet "+ inches +" inches");
	}

	public static double[] add(Distance d1, Distance d2)
	{
		double result[] = new double[2];
		result[0] = d1.feet + d2.feet;
		result[1] = d1.inches + d2.inches;
		if(result[1]>11)
		{
			result[0] = result[0] + 1;
			result[1] = 12 - result[1];
		}  
			
	}
}