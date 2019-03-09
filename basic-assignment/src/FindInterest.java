import java.util.Scanner;

public class FindInterest {

	public static void main(String[] args) {
		float rateOfInterest;
		int principleAmount;
		int numberOfYears;
		float simpleInterest = 0;
		float compoundInterest = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rate of interest");
		rateOfInterest = scanner.nextFloat();
		
		System.out.println("Enter principle Amount");
		principleAmount = scanner.nextInt();
		
		System.out.println("Enter number of years");
		numberOfYears = scanner.nextInt();
		
		simpleInterest = (rateOfInterest*principleAmount*numberOfYears)/100;
		System.out.println("Simple Interest = "+ simpleInterest);
		
		compoundInterest = (float)(principleAmount * Math.pow((1 + rateOfInterest/100), numberOfYears)) - principleAmount;
		System.out.println("Compound Interest = "+ compoundInterest);
		
		scanner.close();
	}

}
