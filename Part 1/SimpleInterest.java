import java.util.Scanner;
import java.lang.*;

public class SimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p,r,t,si;

        System.out.print("Enter the Principal amount: ");
        p = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        r = sc.nextDouble();

        System.out.print("Enter the time: ");
        t = sc.nextDouble();

        si = (p*r*t)/100;

        System.out.printf("The Simple Interest is: %f",si);
        sc.close();
    }
}