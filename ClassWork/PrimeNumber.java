//Program to check whether a number is prime or composite
// Prime number is a number who has only 2 factors, i.e 1 and number itself.


import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,i;
		int count=0;
		System.out.print("Enter any natural number: ");
		a= sc.nextInt();
		sc.close();
		for(i=2;i<=(a/2);i++) {
			if(a%i==0) {
				System.out.printf("%d is a Composite Number",a);
				count+=1;
				break;
			}
		}
		if(a==1) {
			System.out.printf("%d is neither prime nor composite", a);
		}
		else if(count==0) {
			System.out.printf("%d is a Prime Number",a);
		}
		sc.close();
	}
}