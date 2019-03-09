import java.util.Scanner;
public class SearchArray {

	public static void main(String[] args) {
		int array[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		int inputNumber;
		boolean b = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to be searched");
		inputNumber = scanner.nextInt();
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == inputNumber) {
				b = true;
				break;
			}
		}
		
		if(b==true)
			System.out.println(inputNumber + " is present in the array");
		else
			System.out.println(inputNumber + " is not present in the array");
		
		scanner.close();

	}

}
