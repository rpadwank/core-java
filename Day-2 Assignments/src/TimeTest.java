class TimeTest
{
	public static void main(String args[])
	{
		Time t1 = new Time();
		t1.setHours(6);
		t1.setMinutes(41);
		
		Time t2 = new Time();
		t2.setHours(7);
		t2.setMinutes(35);

		Time t3 = new Time();

		t3 = t1.add(t2);
		
		t1.display();
		t2.display();
		t3.display();

		 				
	}
}