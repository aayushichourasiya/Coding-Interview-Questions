// File: AreStringAnagrams.java

/*
## 🧾 Problem Statement

Write a function that checks if String is Anagram

*/

import java.util.Arrays;

public class AreStringAnagrams {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespaces and convert to lowercase (optional based on case sensitivity)
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Early return if lengths differ
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays, sort, and compare
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " +
                (areAnagrams(s1, s2) ? "Yes" : "No"));
    }
}
