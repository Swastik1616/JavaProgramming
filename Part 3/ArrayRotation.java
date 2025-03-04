import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
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
        System.out.println();
        System.out.print("Enter the position from which you want to rotate the array: ");
        int d = sc.nextInt();

        if(d<=x){
            int b[] = new int[x]; // duplicate array to store rotated elements
            for(int i=0;i<b.length;i++){    // or i<x
                b[i]=a[(i+d)%x];
            }
            //Printing the rotated array
            System.out.printf("The rotated array is: ");
            for(int i=0;i<b.length;i++){        // or i<x
                System.out.print(b[i] + " ");
            }
        }
        else{
            System.out.print("Invalid! Please enter a position which is less than or equal to the size of the array");
        }
    }
}