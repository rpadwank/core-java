class Television
{
	private String state;
	private int volume;
	private int channel;
	
	public Television(String state, int volume, int channel)
	{
		this.state = state;
		this.volume = volume;
		this.channel = channel;
	}

	public void turnOnOff()
	{
		if(state =="ON")
			state = "OFF";
		else
			state = "ON";
			
	}
	
	public void increaseChannel()
	{
		channel++;
		if(channel>300)
			channel = 0;
	}
	public void decreaseChannel()
	{
		channel--;
		if(channel<0)
			channel = 300;
	}
	public void increaseVolume()
	{
		volume++;
		if(volume>50)
			volume = 50;
	}
	public void decreaseVolume()
	{
		volume--;
		if(volume<0)
			volume = 0;
	}
	public void displayInformation()
	{
		System.out.println("Power State: "+state);
		System.out.println("Volume: "+volume);
		System.out.println("Channel: "+channel);		
	}
}