//Program to check whether a number is Armstrong number or not

package learning;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,lastD,temp,sum=0;
		System.out.print("Enter any 3 digit number: ");
		n = sc.nextInt();
		sc.close();
		temp=n;
		while(n!=0) {
			lastD=n%10;
			n/=10;
			sum+=lastD*lastD*lastD;
		}
		if(sum==temp) {
			System.out.printf("%d is an Armstrong Number",temp);
		}
		else {
			System.out.printf("%d is not an Armstrong Number",temp);
		}
	}
}