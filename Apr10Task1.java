package DailyTasks;

public class Apr10Task1 {
	
//	WAJP to find the minimum element between two nos using ternary operator
//	public static void main(String[] args) {
//		int num1 = 89;
//		int num2 = 74;
//		
//		String biggest = (num1>num2)?"The biggest number is "+num1:"The biggest number is "+num2;
//		System.out.println(biggest);
//	}
	
//	WAJP to understand pre and post decrements
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 12;
		
//		Post decrement
		System.out.println(num1);
		System.out.println(num2);
		num1--;
		num2--;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1--);
		System.out.println(num2--);
		System.out.println(num1);
		System.out.println(num2);
		
//		Pre-decrement
		--num1;
		--num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(--num1);
		System.out.println(--num2);
		System.out.println(num1);
		System.out.println(num2);
	}
}
