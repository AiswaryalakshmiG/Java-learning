import java.util.Arrays;
import java.util.Scanner;
public class SortingArray {
	public static void main(String [] args) {
		//int[] numbers = {2,4,5,7,8};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
	        int size= sc.nextInt();
	        int[] numbers= new int[size];
	        for(int i=0;i<numbers.length;i++)
	        {
	        	System.out.print("Enter the values: ");
	        	numbers[i]=sc.nextInt();
	        }
	        System.out.println("Before Sorting: " + Arrays.toString(numbers));

		Arrays.sort(numbers);
		System.out.println("After Sorting: " + Arrays.toString(numbers));
		
	}
}