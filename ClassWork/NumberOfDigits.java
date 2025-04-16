// Given a number, find the number of digits in it

package learning;
import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,temp,count=0;
		System.out.print("Enter any number: ");
		n= sc.nextInt();
		sc.close();
		temp=n;
		if(n==0) {
			count=1;
		}
		while(n!=0) {
			n/=10;
			count+=1;
		}
		System.out.printf("The number of digits in %d is %d",temp,count);
	}
}
