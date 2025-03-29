package io.performancelab;

import io.performancelab.example.ListExperiment;
import io.performancelab.example.Sum;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.List;

@BenchmarkMode(Mode.Throughput)
@Fork(1)
@Threads(1)
public class PlayWithJMH {

    @Benchmark
    public void sum_range(Blackhole blackhole) {
        int x = Sum.sum_range(1, 1000);
        blackhole.consume(x);
    }

    @Benchmark
    public void sum_stream(Blackhole blackhole) {
        int x = Sum.sum_stream(1, 1000);
        blackhole.consume(x);
    }

    @Benchmark
    public void sum_algo(Blackhole blackhole) {
        int x = Sum.sum_algo(1, 1000);
        blackhole.consume(x);
    }

    @Benchmark
    public void linkedList(Blackhole blackhole) {
        List<Integer> array = ListExperiment.arrayLinkedList(10000);
        blackhole.consume(array);
    }

    @Benchmark
    public void arrayList(Blackhole blackhole) {
        List<Integer> array = ListExperiment.arrayArrayList(10000);
        blackhole.consume(array);
    }

    @Benchmark
    public void preAllocatedArrayList(Blackhole blackhole) {
        List<Integer> array = ListExperiment.arrayArrayListPreAllocated(10000);
        blackhole.consume(array);
    }
}
