// File: ReverseString.java

/*
## 🧾 Problem Statement

Write a function that reverse a string using Java 8 

*/

import java.util.stream.IntStream;

public class ReverseString {
    public static String reverse(String str) {
        // Use IntStream to iterate over string indices in reverse order
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))  // get chars from end to start
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        String input = "Java 8 Stream!";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}

/*
 Output-
 Original String: Hello, World!
 Reversed String: !dlroW ,olleH
*/
