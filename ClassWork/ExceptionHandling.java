import java.util.Scanner;

public class ExceptionHandling{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        try{
        System.out.println("START.....");
        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();
        //System.out.println();
        int result = n1/n2;
        System.out.println("The quotient is: "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("Second number should not be zero");
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}