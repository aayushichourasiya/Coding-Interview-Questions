// File: CountNumberOccurrences.java

/*
## 🧾 Problem Statement

Write a function that count the number occurrence without using HashMap and Set.

*/

public class CountNumberOccurrences {
    public static void main(String[] args) {
        String str = "2,4,12,2,4,2,5";

        // Split the string into an array
        String[] numbers = str.split(",");

        boolean[] visited = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i].equals(numbers[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(numbers[i] + " occurs " + count + " times");
        }
    }
}

/*
 Output - 
    2 occurs 3 times  
    4 occurs 2 times  
    12 occurs 1 times  
    5 occurs 1 times
*/