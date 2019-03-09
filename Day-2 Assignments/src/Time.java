class Time
{
	private int hours;
	private int minutes;

	public void setData(int hours, int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public void display()
	{
		System.out.println(hours+" hours "+ minutes +" minutes");
	}

	public Time add(Time t2)
	{
		Time t3 = new Time();
		t3.hours = hours + t2.hours;
		t3.minutes = minutes + t2.minutes;
		if(t3.minutes>59)
		{
			t3.hours = t3.hours + 1;
			t3.minutes = t3.minutes - 60;
		}  
		return t3;	
	}
}