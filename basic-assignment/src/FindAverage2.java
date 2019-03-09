import java.util.*;
public class FindAverage2 {

	public static void main(String[] args) {
		int student[][] = new int[3][3];
		String subject[] = {"Physics", "Chemistry", "Biology"};
		float totalScore=0;
		float averageMarks;
		float averageSubjects=0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter marks of student "+(i+1));
			for(int j=0; j<3; j++) {
				System.out.println("Enter marks for "+subject[j]);
				student[i][j]= scanner.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.print("Total score and Average of student " + (i+1) + " is ");
			for(int j=0;j<3;j++) {
				totalScore += student[i][j];
			}
			averageMarks = totalScore/3;
			System.out.println(totalScore + " and " +averageMarks + " respectively");
			totalScore=0;
		}
		
		for(int i=0;i<3;i++) {
				System.out.print("Total and Average of " + subject[i] + " is ");
			for(int j=0;j<3;j++) {
				totalScore += student[j][i];
			}
			averageSubjects = totalScore/3;
			System.out.println(totalScore + " and " +averageSubjects + " respectively");
			totalScore=0;
		}
		scanner.close();
	}
}
