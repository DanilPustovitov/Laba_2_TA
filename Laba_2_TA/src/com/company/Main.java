package com.company;

public class Main {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        System.out.println("Result of Recursion method: " + (Task1.bitCount(n) == 1 ? "Yes" : "No"));
        System.out.println("Result of Iteration method: " + (Task2.bitCount(n) == 1 ? "Yes" : "No"));
        System.out.println(Task3.binominalCef(m,n));
    }
}

