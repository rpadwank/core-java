import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		String USERNAME = "acehorn1";
		String PASSWORD = "hello123";
		
		boolean exit = false;
		int count = 3;
		
		String userInput;
		String passwordInput;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Enter username: ");
			userInput = scanner.nextLine();
			
			System.out.print("Enter password: ");
			passwordInput = scanner.nextLine();
			
			if(userInput.equals(USERNAME) && passwordInput.equals(PASSWORD)) {
				System.out.println("Welcome "+USERNAME);
				exit = true;
			}
			
			else {
				count--;
				if(count>0)
					System.out.println("Please try again");
				System.out.println("Attempts left: "+count);
			}
			
			if(count == 0)
				System.out.println("Contact admin");
			System.out.println();
		}while(count>0 && exit != true);
		
		scanner.close();
	}

}
