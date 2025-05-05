package Daily_Tasks;

import java.util.Scanner;

//2. WAJP to find the index of an array element.
public class May5Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {7, 18, 15, 77, 67, 43, 90, 21, 57, 83, 48, 2, 94, 27, 35};
		System.out.println("[7, 18, 15, 77, 67, 43, 90, 21, 57, 83, 48, 2, 94, 27, 35]");
		System.out.println("Enter any number from the above array...");
		int num = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println("This number is at index "+i);
			}
		}
	}
}
