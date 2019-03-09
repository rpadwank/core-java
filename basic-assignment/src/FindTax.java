import java.util.Scanner;
public class FindTax {

	public static void main(String[] args) {
		int income;
		float tax = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter CTC");
		income = scanner.nextInt();
		
		if(income<=180000) {
			tax = 0;
		}
		else if(income>180000 && income<=300000) {
			tax = income * 10/100;
		}
		else if(income>300000 && income<=500000) {
			tax = income * 20/100;
		}
		else if(income>500000 && income<=1000000) {
			tax = income * 30/100;
		}
		
		System.out.println("Tax = " + tax);	
		
		scanner.close();

	}

}
