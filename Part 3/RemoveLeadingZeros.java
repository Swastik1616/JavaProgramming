import java.util.Scanner;

public class RemoveLeadingZeros {
    public static String removeLeadingZeros(String str) {
        // Use regex to remove leading zeros
        return str.replaceFirst("^0+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String input = sc.nextLine();
        sc.close();

        String output = removeLeadingZeros(input);
        System.out.println("Output: " + output);
    }
}
