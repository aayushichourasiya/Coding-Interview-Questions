// File: CountArrayNumberOccurence.java

/*
## 🧾 Problem Statement

Write a function that count the number occurrence using Java 8.

*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountArrayNumberOccurence {
    public static void main(String[] args) {
        String str = "2,4,12,2,4,2,5";

        Arrays.stream(str.split(","))
              .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
              .forEach((num, count) -> System.out.println(num + " occurs " + count + " times"));
    }
}

/*
 Output - 
    2 occurs 3 times  
    4 occurs 2 times  
    12 occurs 1 times  
    5 occurs 1 times
*/