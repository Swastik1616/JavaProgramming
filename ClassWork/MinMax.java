
import java.util.Scanner;

public class MinMax {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n,lastD;
		n = sc.nextInt();
		sc.close();
		int smallest=9,largest=0;
		while(n!=0) {
			lastD=n%10;
			n/=10;
			if(lastD<smallest) {
				smallest=lastD;
			}
			if(lastD>largest) {
				largest=lastD;
			}
		}
		System.out.printf("The minimum digit is: %d\n", smallest);
		System.out.printf("The maximum digit is: %d", largest);
		sc.close();
	}
}
