import java.util.Scanner;

public class DecimalToBinary{
    public static void Fun(int n){
        if(n==0 || n==1)
            System.out.printf("%d",n);
        else{
            Fun(n/2);
            System.out.printf("%d",n%2);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.printf("The binary value of %d is: ",n);
        Fun(n);
    }
}