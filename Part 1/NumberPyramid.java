import java.util.Scanner;

public class NumberPyramid {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        printPattern(rows);
    }
}
