package io.performancelab.example;

import java.util.stream.IntStream;

public class Sum {
    public static int sum_range(int a, int b) {
        int tmp = 0;
        for (int i = a; i <= b; i++) {
            tmp += i;
        }
        return tmp;
    }
    public static int sum_stream(int a, int b) {
        IntStream intStream = IntStream.range(a, b);
        return intStream.reduce(0, Integer::sum);
    }
    public static int sum_algo(int a, int b) {
        int n = b - a + 1;
        return (n * (a + b)) / 2;
    }
}
