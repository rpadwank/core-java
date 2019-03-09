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
		System.out.println("increase channel");
		System.out.println("current channel: "+channel+"\n");
	}
	public void decreaseChannel()
	{
		channel--;
		if(channel<0)
			channel = 300;
		System.out.println("decrease channel");
		System.out.println("current channel: "+channel+"\n");
	}
	public void increaseVolume()
	{
		volume++;
		if(volume>50)
			volume = 50;
		System.out.println("increase volume");
		System.out.println("current volume: "+volume+"\n");
	}
	public void decreaseVolume()
	{
		volume--;
		if(volume<0)
			volume = 0;
		System.out.println("decrease volume");
		System.out.println("current volume: "+volume+"\n");
	}
	public void displayInformation()
	{
		System.out.println("\nCurrent State:");
		System.out.println("Power State: "+state);
		System.out.println("Volume: "+volume);
		System.out.println("Channel: "+channel+"\n");		
	}
}