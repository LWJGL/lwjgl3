/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.testng.annotations.*;

import java.util.concurrent.*;

import static org.testng.Assert.*;

@Test
public class MathUtilTest {

    private static final int RANDOM_NUMERS = 10000;
    private static final int RANDOM_DENOMS = 1000;

    public void testDivideUnsigned()    { test(MathUtil::mathDivideUnsigned, Long::divideUnsigned); }
    public void testRemainderUnsigned() { test(MathUtil::mathRemainderUnsigned, Long::remainderUnsigned); }

    private static void test(DivOp expected, DivOp actual) {
        long[] numers = {
            0L,
            -1L, 1L,
            Integer.MIN_VALUE, Integer.MAX_VALUE,
            Integer.toUnsignedLong(Integer.MIN_VALUE), Integer.toUnsignedLong(Integer.MIN_VALUE) + 1,
            0xF000_0000L,
            Integer.toUnsignedLong(-1), Integer.toUnsignedLong(-1) + 1L,
            Long.MIN_VALUE, Long.MIN_VALUE + 1,
            0xF000_0000_0000_0000L,
            Long.MAX_VALUE
        };

        for (long d : numers) {
            if (d != 0L) {
                test(expected, actual, d, numers);
            }
        }

        numers = new long[RANDOM_NUMERS];

        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < RANDOM_DENOMS; i++) {
            long d;
            do {
                d = rand.nextLong();
            } while (d == 0L);

            // test the difficult case only
            if (d < 0L) {
                for (int j = 0; j < RANDOM_NUMERS; j++) {
                    numers[j] = rand.nextLong();
                }
            } else {
                for (int j = 0; j < RANDOM_NUMERS; j++) {
                    numers[j] = rand.nextLong(Long.MIN_VALUE, -1L);
                }
            }

            test(expected, actual, d, numers);
        }
    }

    private interface DivOp {
        long apply(long numer, long denom);
    }

    private static void test(DivOp expected, DivOp actual, long denom, long... numers) {
        for (long n : numers) {
            assertEquals(
                expected.apply(n, denom),
                actual.apply(n, denom)
            );
        }
    }

}