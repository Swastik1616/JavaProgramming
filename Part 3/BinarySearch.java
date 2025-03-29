import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid; // Found
            } else if (arr[mid] < key) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        
        int[] array = {2, 4, 6, 8, 10, 12, 14};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();
        scanner.close();

        int result = binarySearch(array, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

