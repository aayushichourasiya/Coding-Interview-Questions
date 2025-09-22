// File: MergeListsNoDuplicates.java

/*
## Problem Statement

Given two lists of integers, merge them into a single collection that contains only unique elements (i.e., no duplicates).

### Input → Output Example

- Input: list1 = [10, 2, 3, 4, 2], list2 = [2, 3, 8, 6]
- Output: [2, 3, 4, 6, 8, 10] (order may vary since it's a Set)
*/

import java.util.*;

public class MergeListsNoDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 2, 3, 4, 2);
        List<Integer> list2 = Arrays.asList(2, 3, 8, 6);

        // Use a HashSet to remove duplicates
        Set<Integer> set = new HashSet<>();

        set.addAll(list1);
        set.addAll(list2);

        // Optional: convert to a sorted list if you want ordered output
        List<Integer> mergedSorted = new ArrayList<>(set);
        Collections.sort(mergedSorted);

        System.out.println("Merged Set (no duplicates): " + set);
        System.out.println("Sorted Unique List: " + mergedSorted);
    }
}
