import java.util.Scanner;

public class FibonacciSeries{
    public static int Fib(int n) {
        if (n <= 1)
            return n;
        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(Fib(i) + " ");
        }
        sc.close();
    }
}
