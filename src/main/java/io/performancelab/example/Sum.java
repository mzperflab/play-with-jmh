package io.performancelab.example;

public class Sum {
    public static int sum_v1(int a, int n) {
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += i;
        }
        return tmp;
    }

    public static int sum_v2(int a, int n) {
        return (n * (n-a)) / 2;
    }
}
