package DailyTasks;
//3) WAJP to print the prime number using while
import java.util.Scanner;

public class Apr21Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=2;
		while(i<100) {
			int j=1;
			int primeCount=0;
			while(j<=i) {
				if(i%j==0)
					primeCount++;
				j++;
			}
			if(primeCount==2)
				System.out.println(i+" is a prime number");
			i++;
		}
	}
}
