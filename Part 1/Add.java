import java.util.Scanner;

public class Add{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        System.out.printf("The sum of %d and %d is %d",a,b,a+b);
        sc.close();
    }
}
