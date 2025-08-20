// File: ReverseString.java

/*
## 🧾 Problem Statement

Write a function that reverse a string without using any inbuilt function

*/

public class ReverseString {
    /**
     * Reverses the input string without using built-in reverse methods.
     * @param str The string to reverse
     * @return Reversed string
     */
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        // Swap characters from start and end moving towards the center
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
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
