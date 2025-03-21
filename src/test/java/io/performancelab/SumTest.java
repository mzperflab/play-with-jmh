package io.performancelab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.performancelab.example.Sum;
import org.junit.jupiter.api.Test;

public class SumTest {
    /**
     * This test is verifying that logic of the algorithm is correct
     */
    @Test
    void sum() {
        int v1Val = Sum.sum_v1(1,10000);
        int v2Val = Sum.sum_v2(1,10000);
        assertEquals(v1Val, v2Val);
    }
}
