import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {  
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
      
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                  
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
    int[] array = {64, 34, 25, 12, 22, 11, 90};
    System.out.println("Original Array: " + Arrays.toString(array));
    bubbleSort(array);
    System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
