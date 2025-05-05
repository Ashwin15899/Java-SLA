package Daily_Tasks;
//3. WAJP to find common elements between two arrays.
import java.util.Scanner;
public class May5task3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("[89, 47, 34, 20, 81, 6, 73]");
		System.out.println("[39, 73, 52, 20, 61, 40, 7]");
		int arr1[]= {89, 47, 34, 20, 81, 6, 73};
		int arr2[]= {39, 73, 52, 20, 61, 40, 7};
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+" is common in both the arrays");
				}
			}
		}
	}
}
