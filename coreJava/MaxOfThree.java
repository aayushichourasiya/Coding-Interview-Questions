// File: MaxOfThree.java

/*
## Problem Statement

Find the maximum number among three given integers.

### Input → Output Examples

- Input: (10, 20, 5)
- Output: 20

- Input: (7, 3, 9)
- Output: 9
*/

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;

        // Approach 1: Using Math.max
        int max1 = Math.max(a, Math.max(b, c));
        System.out.println("Max (using Math.max): " + max1);

        // Approach 2: Using if-else
        int max2;
        if (a >= b && a >= c) {
            max2 = a;
        } else if (b >= a && b >= c) {
            max2 = b;
        } else {
            max2 = c;
        }
        System.out.println("Max (using if-else): " + max2);
    }
}
