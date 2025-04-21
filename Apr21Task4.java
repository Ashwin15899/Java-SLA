package DailyTasks;

import java.util.Scanner;

//4) WAJP to print multiplication tables of any number from the user in the reverse order
public class Apr21Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();
		for(int i=10; i>=1; i--) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}