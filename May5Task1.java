package Daily_Tasks;
import java.util.Scanner;

//1. WAJP to sum values of an array
public class May5Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array...");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the values");
		int count =0;
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
			count+=arr[i];
		}
		System.out.println("The total sum of the array values is "+count);
	}
}
