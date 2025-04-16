//Program to find the sum of digits of a number

package learning;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n,lastD,temp,sum=0;
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		sc.close();
		temp=n;
		while(n!=0) {
			lastD=n%10;
			n/=10;
			sum+=lastD;
		}
		System.out.printf("The sum of digits of %d is %d",temp,sum);
	}
}
