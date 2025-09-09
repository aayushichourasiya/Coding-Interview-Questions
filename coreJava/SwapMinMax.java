// File: SwapMinMax.java

/*
## Problem Statement

Given an integer array, find the maximum and minimum elements and swap their positions.

### Input → Output Examples

- Input: [10, 2, 3, 20]
- Output: [10, 20, 3, 2]

- Input: [5, 1, 4, 2]
- Output: [5, 2, 4, 1]
*/

import java.util.Arrays;

public class SwapMinMax {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 20};

        int max = arr[0];
        int maxInd = 0;
        int min = arr[0];   // ✅ initialize with arr[0]
        int minInd = 0;
        int cnt = 0;

        for (int i : arr) {
            if (i > max) {
                max = i;
                maxInd = cnt;
            }
            if (i < min) {
                min = i;
                minInd = cnt;
            }
            cnt++;
        }

        // swap min and max
        int temp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
