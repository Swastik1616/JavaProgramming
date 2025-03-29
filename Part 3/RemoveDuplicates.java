import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] RemDup(int[] arr) {
        
        // Use LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Integer> arr2 = new LinkedHashSet<>();
        
        // Add elements to LinkedHashSet
        for (int num : arr) {
            arr2.add(num);
        }

        // Convert LinkedHashSet to array
        int[] result = new int[arr2.size()];
        int i = 0;
        for (int num : arr2) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] arr2 = RemDup(arr1);

        // Print result
        System.out.println("Output: " + Arrays.toString(arr2));
    }
}
