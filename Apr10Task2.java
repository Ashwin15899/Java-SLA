package DailyTasks;
import java.util.Scanner;

public class Apr10Task2 {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number : ");
//		int num = sc.nextInt();
//		boolean res1 = (num>10)? true: false;
//		boolean res2 = (num<5)? true: false;
//		boolean res3 = (num!=100)? true: false;
//		boolean res4 = (num<3) ? true: false;
//		boolean res5 = (num>5)? true: false;
//		
//		System.out.println("Greater than 10 : "+res1);
//		System.out.println("Less than 5 : "+res2);
//		System.out.println("Not equal to 100 : "+res3);
//		System.out.println("Less than 3 : "+res4);
//		System.out.println("Greater than 5 : "+res5);
//	}
	
//  Task4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		System.out.println("Addition : "+add);
		System.out.println("Subtraction : "+sub);
		System.out.println("Multiplication : "+mul);
		System.out.println("Division : "+div);
	}
}