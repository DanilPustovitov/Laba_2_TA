package com.company;

public class Task1 {
    public static int bitCount(int n) {
        if (n == 0)
            return 0;
        return (n & 1) + bitCount(n >> 1);
    }
}