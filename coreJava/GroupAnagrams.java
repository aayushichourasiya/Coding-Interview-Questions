// File: GroupAnagrams.java

/*
## 🧾 Problem Statement

Given an array of strings, group the anagrams together.

### Input → Output Examples

- Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
- Output: [["bat"], ["nat", "tan"], ["eat", "tea",  "ate"]]

*/

public class GroupAnagrams {
    /**
     * Groups a list of strings into anagram groups.
     *
     * @param strs the input array of strings
     * @return a list of grouped anagrams
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a char array, sort it, and convert back to string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add the original string to the corresponding group
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        // Return the grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        // Print the output
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
