
public class BubbleSort {
	public static void main(String[] args) {
		int array[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		
		int arrayLength = array.length;
		for(int i=0; i<arrayLength-1; i++) {
			for(int j=0; j<arrayLength-i-1; j++) {
				if(array[j]>array[j+1])
				{
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(int i=0; i<arrayLength; i++)
			System.out.print(array[i] + " ");
	}
}
