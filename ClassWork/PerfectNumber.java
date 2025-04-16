//Program to check whether a number is perfect number or not
// Perfect number is a number whose sum of factors except the number itself is equal to that number.
// For example- Factors of 6 are 1,2,3,6 and 1+2+3=6, so 6 is a perfect number


import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;
		int sum=0;
		System.out.print("Enter any positive number: ");
		n =  sc.nextInt();
		sc.close();
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
			sum+=i;
			}
	    }
		sum+=1;
		if(sum==n) {
			System.out.printf("%d is a Perfect Number", n);
		}
		else {
			System.out.print(n + "  is not a Perfect Number ");
		}
		sc.close();
	}
}
