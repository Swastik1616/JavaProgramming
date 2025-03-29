import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] arr) {
        int j = 0; // Pointer to track non-zero position

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element to index j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Move to next position
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 0, 3, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeroes(arr);

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
