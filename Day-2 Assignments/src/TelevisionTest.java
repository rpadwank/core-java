class TelevisionTest
{
	public static void main(String args[])
	{
		Television tv = new Television("OFF",20,1);
		tv.turnOn();
		tv.increaseVolume();
		tv.increaseVolume();
		tv.increaseVolume();
		tv.increaseVolume();
		tv.decreaseVolume();
		tv.decreaseVolume();
		tv.increaseChannel();
		tv.increaseChannel();
		tv.decreaseChannel();
		tv.increaseChannel();
		tv.increaseChannel();
		tv.displayInformation();
		tv.turnOff();
	}
}