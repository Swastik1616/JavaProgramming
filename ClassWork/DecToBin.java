
import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,i=0,rem=0;
		int arr[]= new int[10];
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		sc.close();
		while(n!=1){
			rem=n%2;
			arr[i]=rem;
			i+=1;
			n=n/2;
		}
		arr[i]=n;
		for(i=4;i>=0;i--) {
			System.out.printf("%d",arr[i]);
		}
		sc.close();
	}
}
