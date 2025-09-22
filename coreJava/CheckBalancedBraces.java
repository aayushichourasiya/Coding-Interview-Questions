// File: CheckBalancedBraces.java

/*
## Problem Statement

Given a string containing only curly braces `{` and `}`, determine if the braces are *balanced*.

A string is considered balanced if:
- Every opening brace `{` has a corresponding closing brace `}`
- Braces are closed in the correct order

### Input → Output Examples

- Input: "{}" → Output: true
- Input: "{}{}" → Output: true
- Input: "{}}" → Output: false
- Input: "{{{}" → Output: false
- Input: "{{}{}}" → Output: true
*/

import java.util.Stack;

public class CheckBalancedBraces {
    public static void main(String[] args) {
        // Sample test cases
        System.out.println(checkParan("{}"));       // true
        System.out.println(checkParan("{}{}"));     // true
        System.out.println(checkParan("{}}"));      // false
        System.out.println(checkParan("{{{}"));     // false
        System.out.println(checkParan("{{}{}}"));   // true
    }

    public static boolean checkParan(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                st.push(ch);
            } else if (ch == '}') {
                if (st.isEmpty() || st.peek() != '{') {
                    return false; // unmatched closing brace
                }
                st.pop();
            }
        }

        // If stack is empty, all braces matched correctly
        return st.isEmpty();
    }
}
