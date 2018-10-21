/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.*;

import static org.lwjgl.system.MathUtil.*;
import static org.testng.Assert.*;

@State(Scope.Benchmark)
public class U64DivideTest {

    @Param(value = {"1024"})
    private int size;

    @Param(value = {"3"})
    private long denom;

    private long[] numers;

    @Setup
    public void setup() {
        numers = new long[size];

        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < numers.length; i++) {
            numers[i] = rand.nextLong();
        }

        assertEquals(divideLWJGL(), divideJDK());
        assertEquals(remainderLWJGL(), remainderJDK());
    }

    @Benchmark
    public long divideJDK() {
        long sum = 0;
        for (long n : numers) {
            sum += Long.divideUnsigned(n, denom);
        }
        return sum;
    }

    @Benchmark
    public long remainderJDK() {
        long sum = 0;
        for (long n : numers) {
            sum += Long.remainderUnsigned(n, denom);
        }
        return sum;
    }

    @Benchmark
    public long divideLWJGL() {
        long sum = 0;
        for (long n : numers) {
            sum += mathDivideUnsigned(n, denom);
        }
        return sum;
    }

    @Benchmark
    public long remainderLWJGL() {
        long sum = 0;
        for (long n : numers) {
            sum += mathRemainderUnsigned(n, denom);
        }
        return sum;
    }

}
