//StreamFilterByFirstChar.java

/*
## Problem Statement

Given a list of strings, use Java Streams to filter and collect only those strings that start with the character a.

## Input → Output Examples

- Input: ["apple", "banana", "apricot", "cherry", "avocado"]
- Output: [apple, apricot, avocado]

*/

import java.util.*;
import java.util.stream.*;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");

        ArrayList<String> filtered = list.stream()
            .filter(s -> s.charAt(0) == 'a')
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(filtered);  // Output: [apple, apricot, avocado]
    }
}
