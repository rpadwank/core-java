class Distance
{
	private int feet;
	private double inches;

	public void setData(int feet, double inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	
	public void display()
	{
		System.out.println(feet+" feet "+ inches +" inches");
	}

	public Distance add(Distance d2)
	{
		Distance d3 = new Distance();
		d3.feet = feet + d2.feet;
		d3.inches = inches + d2.inches;
		if(d3.inches>11)
		{
			d3.feet = d3.feet + 1;
			d3.inches = d3.inches - 12;
		}  
		return d3;	
	}
}