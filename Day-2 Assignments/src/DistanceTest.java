class DistanceTest
{
	public static void main(String args[])
	{
		Distance d1 = new Distance();
		d1.setFeet(3);
		d1.setInches(9);
		
		Distance d2 = new Distance();
		d2.setFeet(4);
		d2.setInches(9);

		Distance d3 = new Distance();

		d3 = d1.add(d2);
		
		d1.display();
		d2.display();
		d3.display();

		 				
	}
}