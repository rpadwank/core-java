import java.util.Scanner;

public class CheckResult {
	public static void main(String[] args) {
		
		int subject1;
		int subject2;
		int subject3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter marks of subject1");
		subject1 = scanner.nextInt();
		
		System.out.println("Enter marks of subject2");
		subject2 = scanner.nextInt();
		
		System.out.println("Enter marks of subject36");
		subject3 = scanner.nextInt();
		
		if(subject1>60 && subject2>60 && subject3>60) {
			System.out.println("Passed!");
		}
		else if((subject1>60&&subject2>60) || (subject1>60&&subject3>60) || (subject2>60&&subject2>60)){
			System.out.println("Promoted!");
		}
		else
			System.out.println("Failed");
		scanner.close();
	}

}
