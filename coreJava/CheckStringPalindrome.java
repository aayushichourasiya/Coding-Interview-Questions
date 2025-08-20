// File: CheckStringPalindrome.java

/*
## 🧾 Problem Statement

Write a function that checks if a given string is a palindrome. A palindrome reads the same forwards and backwards.

### Input → Output Examples

- Input: `"racecar"` → Output: `Palin`
- Input: `"hello"` → Output: `Not Palin`

*/

public class CheckStringPalindrome {
    public static void main(String[] args) {
        checkPalin("racecar");     // Output: Palin
        checkPalin("hello");       // Output: Not Palin
    }

    /**
     * Checks whether a given string is a palindrome.
     * A palindrome reads the same forwards and backwards.
     *
     * @param s the input string to check
     */
    static void checkPalin(String s) {
        boolean flag = true;

        // Use two-pointer technique:
        // i starts from the beginning, j from the end
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            // Compare characters from both ends
            if (s.charAt(i) != s.charAt(j)) {
                flag = false; // mismatch found, not a palindrome
                break;
            }
        }

        if (flag)
            System.out.println("Palin");
        else
            System.out.println("Not Palin");
    }
}

/*
## 🧠 Time and Space Complexity

- **Time Complexity**: `O(n)`  
- **Space Complexity**: `O(1)`

*/
