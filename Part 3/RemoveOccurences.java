import java.util.Arrays;

public class RemoveOccurences {
    public static int[] removeElement(int[] arr, int key) {
        int count = 0;
        
        // Count elements that are NOT equal to key
        for (int num : arr) {
            if (num != key) {
                count++;
            }
        }

        // Create new array for non-key elements
        int[] result = new int[count];
        int index = 0;

        // Store elements that are NOT equal to key
        for (int num : arr) {
            if (num != key) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 1};
        int key = 1;

        int[] newArray = removeElement(array, key);

        // Print the modified array
        System.out.println("Output: " + Arrays.toString(newArray));
    }
}
