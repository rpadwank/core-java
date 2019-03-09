class DistanceTest
{
	public static void main(String args[])
	{
		Distance d1 = new Distance();
		d1.set(3,6);
		
		Distance d2 = new Distance();
		d1.set(4,7);

		double result[] = Distance.sum(d1, d2);

		Distance d3 = new Distance();

		d3.setData(result[0], result[1]);
		
		d1.display();
		d2.display();
		d3.dispaly();

		 				
	}
}