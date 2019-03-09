import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		int number;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		number = scanner.nextInt();
		int temp = number;
		while(temp != 0)
		{
			int remainder = temp%10;
			temp = temp/10;
			sum = sum + (int)Math.pow(remainder, 3);
		}
		if(sum == number)
			System.out.println(number +" is an armstrong number");
		else
			System.out.println(number +" is not an armstrong number");
		scanner.close();
	}

}
