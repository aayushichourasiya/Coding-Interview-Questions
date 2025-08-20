// File: FibonacciSequence.java

/*
## 🧾 Problem Statement

Write a function that print Fibonacci Series till number 10 using Java 8 

*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSequence {

    /*
    What it does: What it does:
    - Starts from [0,1].
    - Generates the next pair as [current second, sum of both].
    - Prints the first element of each pair (the Fibonacci number).
    - Prints first 10 Fibonacci numbers, one per line.    
    */
    public static List<Long> generateFibonacci(int n) {
        return Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]})
                     .limit(n)
                     .map(fib -> fib[0])
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int n = 10;
        List<Long> fibonacciNumbers = generateFibonacci(n);
        System.out.println("First " + n + " Fibonacci numbers: " + fibonacciNumbers);
    }
}