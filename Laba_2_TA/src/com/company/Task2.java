package com.company;

public class Task2 {
    public static int bitCount(int n) {
        int sum = 0;
        for (; n > 0; n >>= 1) {
            sum += n & 1;
        }
        return sum;
    }
}