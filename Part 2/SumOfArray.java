import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Enter the size of array: ");
        int x = sc.nextInt();
        int a[] = new int[x]; // declaring the array

        //Inserting elements in the array;
        System.out.printf("Enter %d elements to insert in the array: ",a.length);
        for(int i=0;i<a.length;i++){    // or i<x
            a[i]=sc.nextInt();
        }
        
        //Printing the array
        System.out.printf("The array is: ");
        for(int i=0;i<a.length;i++){        // or i<x
            System.out.print(a[i] + " ");
        }

        //Calculating the sum of its elements
        System.out.println();
        for(int i=0;i<a.length;i++){     // or i<x
            sum += a[i];
        }
        System.out.printf("The sum of elements of the array is: %d",sum);
    }
}