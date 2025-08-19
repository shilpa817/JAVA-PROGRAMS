package cseproject1;
import java.util.*;
public class Secondlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("atleast two elements to find second largest number.");
            
        }

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Second largest is at index n-2
        System.out.println("Second largest number is: " + arr[n - 2]);

        scanner.close();
    }


	
	
}
	

