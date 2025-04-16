package learning;
import java.util.Scanner;

public class ReverseDigits {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n,lastD,i=0,j;
		int arr[]= new int[5];
		n = sc.nextInt();
		sc.close();
		while(n!=0) {
			lastD=n%10;
			n/=10;
			arr[i]=lastD;
			i+=1;
		}
		System.out.print("The reverse of the number is: ");
		for(j=0;j<=4;j++) {
			System.out.printf("%d",arr[j]);
		}
	}
}
