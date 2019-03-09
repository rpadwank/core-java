import java.util.Scanner;
public class FindAverage {

	public static void main(String[] args) {
		int physics;
		int chemistry;
		int biology;
		Scanner scanner = new Scanner(System.in);
		Student[] s = new Student[3];
		for(int i=0; i<3; i++){
			s[i] = new Student();
		}
		for(int i=0; i<3; i++)
		{
			System.out.println("Student "+(i+1));
			System.out.println("Enter marks of physics");
			physics = scanner.nextInt();
			System.out.println("Enter marks of chemistry");
			chemistry = scanner.nextInt();
			System.out.println("Enter marks of biology");
			biology = scanner.nextInt();
			s[i].setMarks(physics, chemistry, biology);
		}
		for(int i=0; i<3; i++)
		{
			float averageMarks = s[i].findAverage();
			System.out.println("Average of student " + (i+1) + " is " +averageMarks);
		}
		for(int i=0;i<3;i++)
		{
			float averageSubject = 0;
			for(int j=0;j<3;j++)
			{
				averageSubject = averageSubject + s[j].getMarks(i);
			}
			averageSubject = averageSubject/3;
			if(i==0)
				System.out.println("Average of physics is "+ averageSubject);
			else if(i==1)
				System.out.println("Average of chemistry is "+ averageSubject);
			else
				System.out.println("Average of biology is "+ averageSubject);
		}
		
		scanner.close();

	}

}

class Student {
	private int subject[] = new int[3];
	public void setMarks(int physics, int chemistry, int biology) {
		subject[0] = physics;
		subject[1] = chemistry;
		subject[2] = biology;
	}
	public int getMarks(int i)
	{
		return subject[i];
		
	}
	public float findAverage() {
		float average=0;
		for(int i=0; i<3; i++) {
			average = average + subject[i];
		}
		average = average/3;
		return average;
	}
	
}
