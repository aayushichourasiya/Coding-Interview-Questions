// File: FindLargestElement.java

/*
## 🧾 Problem Statement

Write a function that find maximum element of an array using Java 8 

*/

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestElement {

    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 21, 8, 7};

        // Using Java 8 IntStream to find max
        OptionalInt max = Arrays.stream(numbers).max();

        if (max.isPresent()) {
            System.out.println("Largest element is: " + max.getAsInt());
        } else {
            System.out.println("Array is empty.");
        }
    }
}

/*
Output - Largest element is: 21
*/