package DailyTasks;

//2) WAJP to print sum of even numbers and sum of odd numbers from user i/p between 1 - 20
import java.util.Scanner;

public class Apr21Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers...");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int oddCount=0;
		int evenCount=0;
		for(int i=num1; i<=num2; i++) {
			if(i%2==0) {
				evenCount+=i;
			} else {
				oddCount+=i;
			}
		}
		System.out.println("Even count "+evenCount);
		System.out.println("Odd count "+oddCount);
	}
}
