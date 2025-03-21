package io.performancelab;

import io.performancelab.example.Sum;
import org.openjdk.jmh.annotations.*;

@BenchmarkMode(Mode.Throughput)
public class PlayWithJMH {

    @Benchmark
    public void sumV1() {
        int x = Sum.sum_v1(1, 1000);
    }

    @Benchmark
    public void sumV2() {
        int x = Sum.sum_v2(1, 1000);
    }
}
