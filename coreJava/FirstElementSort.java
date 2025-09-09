// File: FirstElementSort.java

/*
## Problem Statement

Given an integer array, place only the first element into its correct sorted position.  
All other elements should remain in their original relative order.

### Input → Output Examples

- Input: [10, 2, 3, 20]  
- Output: [3, 2, 10, 20]

- Input: [5, 1, 4, 2]  
- Output: [1, 5, 4, 2]
*/

public class FirstElementSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 20};

        // Take the first element
        int first = arr[0];

        // Find its correct position in the sorted order
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < first) {
                pos = i;
            }
        }

        // Shift elements to make space for "first"
        for (int i = 0; i < pos; i++) {
            arr[i] = arr[i + 1];
        }
        arr[pos] = first;

        System.out.println(Arrays.toString(arr));
    }
}

