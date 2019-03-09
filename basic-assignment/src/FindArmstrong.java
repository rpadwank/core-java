public class FindArmstrong {

	public static void main(String[] args) {
		int number=100;
		int sum=0;
		while(number<=999)
		{
			int temp = number;
			while(temp != 0)
			{
				int remainder = temp%10;
				temp = temp/10;
				sum = sum + (int)Math.pow(remainder, 3);
			}
			if(sum == number)
				System.out.print(number + " ");
			sum = 0;
			number++;
		}

	}

}
