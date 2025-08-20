// File: StringCompression.java

/*
## 🧾 Problem Statement

Implement a method to perform basic string compression using the counts of repeated characters.

### Input → Output Examples:

- Input: `"aabcccccaaa"`  
  Output: `"a2b1c5a3"`

- Input: `"abc"`  
  Output: `"abc"`

The compressed string should only be returned if it’s **shorter** than the original. Otherwise, return the original string.

---

## 🧠 Time and Space Complexity

- **Time Complexity**: `O(n)` where `n` is the length of the string.
- **Space Complexity**: `O(n)` — worst case if compressed string is longer or equal to the original.

*/

public class StringCompression {
    public static void main(String[] args) {
        // Test case 1
        compressAndPrint("aabcccccaaa");  // Output: a2b1c5a3

        // Test case 2
        compressAndPrint("abc");          // Output: abc
    }

    private static void compressAndPrint(String s) {
        if (s == null || s.length() == 0) {
            System.out.println(s);
            return;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        sb.append(s.charAt(s.length() - 1)).append(count);

        // Return compressed string only if it's shorter
        if (sb.length() >= s.length()) {
            System.out.println(s);
        } else {
            System.out.println(sb);
        }
    }
}
