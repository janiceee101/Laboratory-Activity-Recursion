import java.util.Scanner;
import java.util.Arrays;

/*
Description: This program performs a recursive Binary Search.
It accepts the number of elements, the elements of the array,
and a target value from the user. The array is sorted in
ascending order before performing the search.

Programmed by: <Janice Pabular> <BSIT> <48079> <Data Structures and Algorithm>

Last Modified: September 9, 2026

Version: 1.2

[Acknowledgements: Original Binary Search program provided by the instructor.
Geeksforgeeks and generative AI was used for explanation and code assistance.
AI Prompt used: "Help me understand the given Binary Search program
according to the laboratory activity requirements."]
*/

public class Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        // Base case: target is not found
        if (low > high) {
            return -1;
        }
		
        // Find the middle index
        int mid = low + (high - low) / 2; 
        
        //Display recursive trace
        System.out.println("\nbinarySearch: (" +low+ ", " + high+ ", " + target + ")");
        System.out.println("low=" + low + ", high=" + high + ", mid=" + mid + ", arr[mid]=" + arr[mid]);

        // If target is found at the middle
        if (arr[mid] == target) {  
            return mid;
        }

        // If target is smaller, search the left half
        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

        // Otherwise, search the right half
        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for the number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        System.out.println();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
        	System.out.print("Element " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println();

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Ask for the target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = bSearch(
            numbers,
            target,
            0,
            numbers.length - 1
        );

        if (result == -1) {
            System.out.println("\nElement not found. Index: -1");
        } else {
            System.out.println("\nElement found at index: " + result);
        }
        sc.close();
    }
}



