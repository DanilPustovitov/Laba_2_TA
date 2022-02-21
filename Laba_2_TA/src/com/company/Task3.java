package com.company;

public class Task3 {
    public static int binominalCef(int m, int n){
        if (m==n || m==0)
            return 1;
        return binominalCef(m, n-1) + binominalCef(m-1, n-1);
    }
}
